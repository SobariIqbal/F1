public class SnapOn extends Fabriek{
    public Momensleutel Momensleutel(){
        System.err.println("SnapOn heeft een dure Momensleutel geproduceerd");
        return new DureMomentsleutel();
    }

    public Slagmoresleutel Slagmoersleutel(){
        System.err.println("SnapOn heeft een dure Slagmoersleutel geproduceerd");
        return new DureSlagmoersleutel();
    }
}
