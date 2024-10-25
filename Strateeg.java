public class Strateeg extends Staff {
    protected Strategie s = null;

   
    // public String getStrat() {
    //     return getStrat();
    // }

    public Strateeg(Strategie s){
        this.s = s;
    }

    public void zetStrategie(Strategie s){
        
        this.s = s;
        if (s != null){
            s.zetStrategie(s);
        }    
        
    }

    public int gebruik(){
        return s.gebruik();
    }

    public void end(){
        if(s != null){
            s.end();
        }
    }

}
