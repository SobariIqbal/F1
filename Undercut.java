public class Undercut extends Strategie{
    public void zetStrategie( Strategie s){
        System.err.println("Undercut is ingezet...");
        
    };
    public int gebruik(){
        return 100;
    };
    public void end(){
        System.err.println("Undercut was a success");
    };
}
