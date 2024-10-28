public class Monteur {
    private Gereedschap m;
    private Gereedschap s;
    

    public Monteur(Gereedschap momentsleutel, Gereedschap slagmoersleutel) {
        m = momentsleutel;
        s = slagmoersleutel;

    }
    public Object gebruik(){
        m.gebruik();    
        s.gebruik();


        return 0;
    };

    public String getNaam(){
        return "Monteur";	
    }   

    public void zetStrategie(Object s){
     
        
    };

}
