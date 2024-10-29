//bridge pattern
public abstract class Motor {

    public abstract void versnellen(String auto, int km_u, int verschil);
    public abstract void vertragen(String auto, int km_u, int verschil);
    public abstract String getMotorType();

}
