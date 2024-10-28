public class Overcut extends Strategie{
    public void zetStrategie(){
        System.err.println("Overcut is ingezet..."); 
        
    };
    public int gebruik(){ 
        
        return -25;
    };
    public void end(){
        System.err.println("Overcut was a success");
    };
}
