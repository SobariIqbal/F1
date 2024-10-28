import java.util.Scanner;
public class Coureur {
    private Scanner myObj3 = new Scanner(System.in); 

    private Communicatiemethode comm = null;

   
    protected String gebruik(){
        System.out.println("Schrijf een bericht: ");
        String bericht = myObj3.nextLine();
        

        return comm.verstuurBericht(bericht);
    };

    protected void zetCommunicatiemethode(Communicatiemethode comm){
            this.comm = comm;
    
    };

}
