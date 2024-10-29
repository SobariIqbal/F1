//Strategie van strateeg
public class Overcut extends Strategie{
    protected void zetStrategie(){
        System.err.println("Overcut is ingezet..."); 
        
    };
    protected int gebruik(){ 
        
        return -25;
    };
    protected void eindig(){
        System.err.println("Overcut was a success");
    };
}
