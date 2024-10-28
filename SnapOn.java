public class SnapOn extends Fabriek{
    protected Momensleutel Momensleutel(){
        System.err.println("SnapOn heeft een dure Momensleutel geproduceerd");
        return new DureMomentsleutel();
    }

    protected Slagmoresleutel Slagmoersleutel(){
        System.err.println("SnapOn heeft een dure Slagmoersleutel geproduceerd");
        return new DureSlagmoersleutel();
    }
}
