public class One_stop_strategie extends Strategie{
    protected void zetStrategie(){
        System.err.println("One_stop_strategie is ingezet...");
        
    };
    protected int gebruik(){
        
        return 50;
    };
    protected void end(){
        System.err.println("One_stop_strategie will work hopefully");
    };
}
