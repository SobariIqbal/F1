//Strategy patroon
public class Strateeg{
    protected Strategie s = null;

    protected Strateeg(Strategie s){
        this.s = s;
    }

    protected String getNaam(){
        return "Strateeg";
    }   

    protected void zetStrategie(Strategie s){
            this.s = s;
            s.zetStrategie();
       
    }

    protected int gebruik(){
        return s.gebruik();
    }

    protected void end(){
        if(s != null){
            s.end();
        }
    }

}
