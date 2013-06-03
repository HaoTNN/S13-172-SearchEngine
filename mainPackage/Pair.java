//main - http://collabedit.com/r349a
//Crawl - http://collabedit.com/836y2
//Pair - http://collabedit.com/tscyv
package mainPackage;

public class Pair<L, R>{
    private L first;
    private R second;
    
    public Pair(L first, R second){
        this.first = first;
        this.second = second;
    }
    
    public L getFirst(){
        return first;
    }
    
    public R getSecond(){
        return second;
    }
    
    public void setFirst(L f){
        first = f;
    }
    public void setSecond(R s){
        second = s;
    }
}