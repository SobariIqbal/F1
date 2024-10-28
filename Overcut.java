public class Overcut extends Strategie{
    protected void zetStrategie(){
        System.err.println("Overcut is ingezet..."); 
        
    };
    protected int gebruik(){ 
        
        return -25;
    };
    protected void end(){
        System.err.println("Overcut was a success");
    };
}
