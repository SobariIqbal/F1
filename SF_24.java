public class SF_24 extends Auto {
    protected int newkm_u = 0;
    private String auto = "SF_24";
    
    public SF_24(int mo) {
        super(mo);
    }

    public void snelheid(int km_u) {
        
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

    public String getAuto() {
        return auto;
    }

    public String getMotorType() {
        return m.getMotorType();
    }

}
