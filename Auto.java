public abstract class Auto{

    protected Motoren m = null;
   

    public Auto(Motoren motor){
   
        this.m = motor;
       
        
    }

    public abstract void snelheid(int km_u);
    public abstract String getAuto();
    public abstract String getMotorType();
    



}
