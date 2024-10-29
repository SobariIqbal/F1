//fabriek soort
public class TangTools extends Fabriek{
    public Slagmoersleutel Slagmoersleutel() {
        System.err.println("TangTools heeft een goedkope Slagmoersleutel geproduceerd");
        return new GoedkopeSlagmoersleutel();
    };

    public Momensleutel Momensleutel(){
        System.err.println("TangTools heeft een goedkope Momensleutel geproduceerd");
        return new GoedkopeMomentsleutel();
    }
}
