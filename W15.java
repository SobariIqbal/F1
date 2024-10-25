public class W15 extends Auto {
    protected int newkm_u = 0;
    private String auto = "W15";

    public W15(int mo) {
        super(mo);
    }

    public void snelheid(int km_u) {
       
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

    public String getAuto() {
        return auto;
    }

    public String getMotorType() {
        return m.getMotorType();
    }
    
    

}
