//fabriek soort
public class TangTools extends Fabriek{
    protected Slagmoresleutel Slagmoersleutel() {
        System.err.println("TangTools heeft een goedkope Slagmoersleutel geproduceerd");
        return new GoedkopeSlagmoersleutel();
    };

    protected Momensleutel Momensleutel(){
        System.err.println("TangTools heeft een goedkope Momensleutel geproduceerd");
        return new GoedkopeMomentsleutel();
    }
}
