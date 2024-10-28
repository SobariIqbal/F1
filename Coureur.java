import java.util.Scanner;
public class Coureur extends Staff {
    protected Scanner myObj3 = new Scanner(System.in); 

    private Communicatiemethode comm = null;

    public Object gebruik(){
        System.out.println("Schrijf een bericht: ");
        String bericht = myObj3.nextLine();
        

        return comm.verstuurBericht(bericht);
    };

    public void zetStrategie(Object comm){

        if (comm instanceof Communicatiemethode) {
            this.comm = (Communicatiemethode) comm;
        } else {
            throw new IllegalArgumentException("Parameter must be of type Communicatiemethode");
        }
    };

}
