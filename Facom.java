public class Facom {
    private Fabriek f = null;
    private Momensleutel m = null;
    private Slagmoresleutel s = null;

    protected void goedkoop(){
        f= new TangTools();
        m= f.Momensleutel();
        s= f.Slagmoersleutel();
    }

    protected void duur(){
        f= new SnapOn();
        m= f.Momensleutel();
        s= f.Slagmoersleutel();
    }
}
