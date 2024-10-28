public class SF_24 extends Auto {
    private int newkm_u = 0;
    private String auto = "SF_24";
    
    protected SF_24(Motor mo) {
        super(mo);
    }

    protected void snelheid(int km_u) {
        
        if(km_u > newkm_u){
            int verschil = km_u - newkm_u;
            newkm_u = km_u;
            m.versnellen(auto, km_u, verschil);
        }else if(km_u < newkm_u){
            int verschil = newkm_u - km_u;
            newkm_u = km_u;
            m.vertragen(auto, km_u, verschil);
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
