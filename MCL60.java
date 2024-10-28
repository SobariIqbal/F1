public class MCL60 extends Auto {
    protected int newkm_u = 0;
    private String auto = "MCL60";

    

    protected MCL60(Motor mo) {
        super(mo);
    }
    
    protected void snelheid(int km_u) {


        
        if(km_u > newkm_u){
            int verschil = km_u - newkm_u;
            m.versnellen(auto, km_u, verschil);
            newkm_u = km_u;
        }else if(km_u < newkm_u){
            int verschil = newkm_u - km_u;
            m.vertragen(auto, km_u, verschil);
            newkm_u = km_u;
        }else{
            System.out.println("De snelheid blijft " + km_u + " km/u");
        }
       
    }

    protected String getAuto() {
        return auto;
    }

    protected String getMotorType() {
        return m.getMotorType();
    }

    
   


}
