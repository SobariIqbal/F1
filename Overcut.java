//Strategie van strateeg
public class Overcut extends Strategie{
    protected void zetStrategie(){
        System.err.println("Overcut is ingezet... tegenstanders krijgen -30"); 
        
    };
    protected int gebruik(){ 
        return -30;
    };
    protected void eindig(){
        System.err.println("Overcut was a success");
    };
}
