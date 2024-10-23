public class Honda_RA620H extends Motoren {
    private String motorType = "Honda_RA620H";
    
    public void versnellen(String auto, int km_u, int verschil) {

        System.out.println(auto + " Met de motor "+ motorType + " versnelt met " + verschil);
        System.out.println("De snelheid van de auto " + auto + " is nu " + km_u + " km/u");
    }

    public void vertragen(String auto, int km_u, int verschil) {

        System.out.println(auto + " Met de motor "+ motorType + " vertraagt met " + verschil);
        System.out.println("De snelheid van de auto " + auto + " is nu " + km_u + " km/u");
    }



    public String getMotorType() {
        return motorType;
    }

}
