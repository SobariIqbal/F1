//Soort Team
public class Mclaren extends Team {
    private String teamnaam = "Mclaren";

    protected Mclaren(Strateeg strateeg, Monteur monteur,Coureur coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,coureur, auto, teamnaam);
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
