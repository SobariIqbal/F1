public class Monteur {
    //gebruik van de abstracte klasse Gereedschap
    private Gereedschap momentsleutel;
    private Gereedschap slagmoersleutel;
    

    public Monteur(Gereedschap momentsleutel, Gereedschap slagmoersleutel) {
        this.momentsleutel = momentsleutel;
        this.slagmoersleutel = slagmoersleutel;

    }
    public void gebruikMomemsleutel(){
        momentsleutel.gebruik();    
       
    };

    public void gebruikSlagmoersleutel(){
        slagmoersleutel.gebruik();
    };

    public String getNaam(){
        return "Monteur";	
    }   

}
