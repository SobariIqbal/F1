//Soort team
public class Ferrari extends Team{
private String teamnaam = "Ferrari";

    protected Ferrari(Strateeg strateeg, Monteur monteur,Coureur coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,coureur,auto,teamnaam);
    }

    protected String getTeam(){
        return teamnaam;
    }

    protected String getTeamname(){
        if (eigenteamnaam == null){
            return teamnaam;
        }
        return eigenteamnaam;
    }
 

}
