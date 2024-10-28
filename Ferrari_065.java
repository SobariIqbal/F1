public class Ferrari_065 extends Motor {

    private String motorType = "Ferrari_065";

   
    protected void versnellen(String auto, int km_u, int verschil) {

        System.out.println("De " + auto + " Met de motor "+ motorType + " versnelt met " + verschil);
        System.out.println("De snelheid van de auto " + auto + " is nu " + km_u + " km/u");
    }

    protected void vertragen(String auto, int km_u, int verschil) {

        System.out.println("De " + auto + " Met de motor "+ motorType + " vertraagt met " + verschil);
        System.out.println("De snelheid van de auto " + auto + " is nu " + km_u + " km/u");
    }




    protected String getMotorType() {
        return motorType;
    }





}
