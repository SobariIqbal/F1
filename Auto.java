//Bridge patroon
public abstract class Auto{

    protected Motor m = null;
   

    protected Auto(Motor motor){
   
        this.m = motor;
       
        
    }

    public abstract void snelheid(int km_u);
    public abstract String getAuto();
    public abstract String getMotorType();
    



}
