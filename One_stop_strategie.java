public class One_stop_strategie extends Strategie{
    public void zetStrategie(Strategie s){
        System.err.println("One_stop_strategie is ingezet...");
    };
    public int gebruik(){
        return 50;
    };
    public void end(){
        System.err.println("One_stop_strategie will work hopefully");
    };
}
