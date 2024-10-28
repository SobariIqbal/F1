//Soort Team
public class Mclaren extends Team {

    protected Mclaren(Strateeg strateeg, Monteur monteur,Coureur coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,coureur, auto, teamnaam);
    }

    protected String getTeam(){
        return "Mclaren";
    }

   

    protected String getTeamname(){
        if (teamname == null){
            return "Mclaren";
        }
        return teamname;
    }
}
