//strategie patroon
import java.util.Scanner;
public class Coureur {
    private Scanner myObj = new Scanner(System.in); 

    private Communicatiemethode comm = null;

   
    public String gebruik(){
        System.out.println("Schrijf een bericht: ");
        String bericht = myObj.nextLine();
        

        return comm.verstuurBericht(bericht);
    };

    public void zetCommunicatiemethode(Communicatiemethode comm){
            this.comm = comm;
    
    };

}
