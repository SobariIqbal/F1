public class Mercedes extends Team {

    



    public Mercedes(Staff strateeg, Staff monteur,Staff raceengineer,Staff coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,raceengineer,coureur, auto, teamnaam);
    }

    public String getTeam(){
        return "Mercedes";
    }


    public String getTeamname(){
        if (teamname == null){
            return "Mercedes";
        }
        return teamname;
    }

   

    




}
