public class Mclaren extends Team {

    public Mclaren(Strateeg strateeg, Monteur monteur,Coureur coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,coureur, auto, teamnaam);
    }

    public String getTeam(){
        return "Mclaren";
    }

   

    public String getTeamname(){
        if (teamname == null){
            return "Mclaren";
        }
        return teamname;
    }
}
