//Bridge patroon
public abstract class Auto{

    protected Motor m = null;
   

    protected Auto(Motor motor){
   
        this.m = motor;
       
        
    }

    protected abstract void snelheid(int km_u);
    protected abstract String getAuto();
    protected abstract String getMotorType();
    



}
