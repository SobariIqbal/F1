//Strategy patroon
public class Strateeg{
    private Strategie s = null;

    public Strateeg(Strategie s){
        this.s = s;
    }

    public String getNaam(){
        return "Strateeg";
    }   

    public void zetStrategie(Strategie s){
            this.s = s;
            s.zetStrategie();
       
    }

    public int gebruik(){
        return s.gebruik();
    }

    public void eindig(){
        if(s != null){
            s.eindig();
        }
    }

}
