public class App {

    public static void main(String[] args) {
        System.out.println("F1");
        F1_CareerMode player1 = new F1_CareerMode();
        
        player1.kiesjouwteam();
        player1.kiesjouwauto();
        player1.kiesjouwmotor();
        player1.startRace();
        player1.verstuurbericht();
    }
}
