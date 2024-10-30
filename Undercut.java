//Strategie van strateeg
public class Undercut extends Strategie{
    protected void zetStrategie(){
        System.err.println("Undercut is ingezet... +100 km/u");
        
        
    };
    protected int gebruik(){
        
        return 100;
    };
    protected void eindig(){
        System.err.println("Undercut was a success");
    };
}
