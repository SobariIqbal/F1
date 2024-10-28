public class TangTools extends Fabriek{
    public Slagmoresleutel Slagmoersleutel() {
        System.err.println("TangTools heeft een goedkope Slagmoersleutel geproduceerd");
        return new GoedkopeSlagmoersleutel();
    };

    public Momensleutel Momensleutel(){
        System.err.println("TangTools heeft een goedkope Momensleutel geproduceerd");
        return new GoedkopeMomentsleutel();
    }
}
