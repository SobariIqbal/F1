//Strategie van strateeg
public class Undercut extends Strategie{
    protected void zetStrategie(){
        System.err.println("Undercut is ingezet...");
        
        
    };
    protected int gebruik(){
        
        return 100;
    };
    protected void end(){
        System.err.println("Undercut was a success");
    };
}
