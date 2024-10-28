public class Monteur {
    //gebruik van de abstracte klasse Gereedschap
    private Gereedschap m;
    private Gereedschap s;
    

    protected Monteur(Gereedschap momentsleutel, Gereedschap slagmoersleutel) {
        m = momentsleutel;
        s = slagmoersleutel;

    }
    protected void gebruikMomemsleutel(){
        m.gebruik();    
       
    };

    protected void gebruikSlagmoersleutel(){
        s.gebruik();
    };

    protected String getNaam(){
        return "Monteur";	
    }   

}
