public class Mercedes extends Team {

    



    public Mercedes(Staff strateeg, Staff monteur,Staff raceengineer,Staff coureur , int auto, String teamnaam, int motor) { 
        super(strateeg, monteur,raceengineer,coureur, auto, teamnaam, motor);
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
