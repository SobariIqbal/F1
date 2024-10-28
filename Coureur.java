import java.util.Scanner;
public class Coureur {
    protected Scanner myObj3 = new Scanner(System.in); 

    private Communicatiemethode comm = null;

   
    public Object gebruik(){
        System.out.println("Schrijf een bericht: ");
        String bericht = myObj3.nextLine();
        

        return comm.verstuurBericht(bericht);
    };

    public void zetCommunicatiemethode(Communicatiemethode comm){
            this.comm = (Communicatiemethode) comm;
    
    };

}
