public class Facom {
    private Fabriek f = null;
    private Momensleutel m = null;
    private Slagmoresleutel s = null;

    public void cheap(){
        f= new TangTools();
        m= f.Momensleutel();
        s= f.Slagmoersleutel();
    }

    public void expensive(){
        f= new SnapOn();
        m= f.Momensleutel();
        s= f.Slagmoersleutel();
    }
}
