public class Mercedes extends Team {

    



    public Mercedes(Strateeg strateeg, Monteur monteur,Coureur coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,coureur, auto, teamnaam);
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
