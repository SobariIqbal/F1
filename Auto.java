public abstract class Auto{

    protected Motoren m = null;
   

    public Auto(int motor){
        if (motor == 1){
            m = new Renault_20();
        }   
        if (motor == 2){
            m = new Ferrari_065();
        }
        if (motor == 3){
            m = new Honda_RA620H();
        }
       
        
    }

    public abstract void snelheid(int km_u);

    public abstract String getAuto();
    public abstract String getMotorType();
    



}
