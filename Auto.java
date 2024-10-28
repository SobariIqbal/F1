public abstract class Auto{

    protected Motoren m = null;
   

    public Auto(Motoren motor){
        // if (motor == 1){
        //     m = new Renault_20();
        // }   
        // if (motor == 2){
        //     m = new Ferrari_065();
        // }
        // if (motor == 3){
        //     m = new Honda_RA620H();
        // }

        this.m = motor;
       
        
    }

    public abstract void snelheid(int km_u);

    public abstract String getAuto();
    public abstract String getMotorType();
    



}
