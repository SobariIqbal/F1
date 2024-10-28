//bridge pattern
public abstract class Motor {

    protected abstract void versnellen(String auto, int km_u, int verschil);
    protected abstract void vertragen(String auto, int km_u, int verschil);
    protected abstract String getMotorType();

}
