//strategie van strateeg
public class One_stop_strategie extends Strategie{
    protected void zetStrategie(){
        System.err.println("One_stop_strategie is ingezet... +50 km/u");
        
    };
    protected int gebruik(){
        
        return 50;
    };
    protected void eindig(){
        System.err.println("One_stop_strategie will work hopefully");
    };
}
