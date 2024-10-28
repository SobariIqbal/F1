public class Mercedes extends Team {

    



    protected Mercedes(Strateeg strateeg, Monteur monteur,Coureur coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,coureur, auto, teamnaam);
    }

    protected String getTeam(){
        return "Mercedes";
    }


    protected String getTeamname(){
        if (teamname == null){
            return "Mercedes";
        }
        return teamname;
    }

   

    




}
