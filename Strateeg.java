public class Strateeg{
    protected Strategie s = null;

    public Strateeg(Strategie s){
        this.s = s;
    }

    public String getNaam(){
        return "Strateeg";
    }   

    public void zetStrategie(Object s){
        

        if (s instanceof Strategie) {
            this.s = (Strategie) s;
            ((Strategie)s).zetStrategie();
            
        } else {
            throw new IllegalArgumentException("Parameter must be of type Strategie");
        }
        
      
        
    }

    public Object gebruik(){
        return s.gebruik();
    }

    public void end(){
        if(s != null){
            s.end();
        }
    }

}
