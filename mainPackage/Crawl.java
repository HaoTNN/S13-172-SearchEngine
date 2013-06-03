//main - http://collabedit.com/r349a
//Crawl - http://collabedit.com/836y2
//Pair - http://collabedit.com/tscyv
package mainPackage;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.*;
import java.util.*;

public class Crawl {
    public Crawl(){
        connection = null;
        doc = null;
    }
    public Crawl(String url){
        connect(url);
    }
    
    //Establish the connection and get the document for this instance.
    //
    //Parameters:
    //    url: link to connect to
    public boolean connect(String url){
        try{
            connection = Jsoup.connect(url);
            doc = connection.get();
            return true;
        }
        catch(Exception e){
            System.err.println("Error in void connect(String url): " + e.getMessage());
            return false;
        }
    }
    
    //Save to a file named fileName given a string data
    //
    //Parameters:
    //    fileName: name of the file to be saved
    //    data: information contained as a String
    public void saveAsFile(String fileName, String data) {
        try{
            FileWriter fstream = new FileWriter(fileName);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(data);
            out.close();
        }
        catch(Exception e){
            System.err.println("Error in saveAsFile: " + e.getMessage());
        }
    }
    
    //Turns the Elements of Links into an ArrayList and returns it.
    //Each entry will be type String and will be absolute HTML links
    //
    //Parameters:
    //
    //Returns: ArrayList<String> of links the Crawler instance contains.
    public ArrayList<String> getLinks(){
        Elements links = doc.select("a[href]");
        ArrayList<String> arrayOfLinks = new ArrayList<String>();
        for( Element link : links ) {
            arrayOfLinks.add(link.attr("abs:href"));
        }
        return arrayOfLinks;
    }
    
    public String getHTML(){
    	return doc.html();
    }
    
    Connection connection = null;
    Document doc = null;
}
