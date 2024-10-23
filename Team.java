public abstract class Team {


    protected Staff strateeg = null;
    protected Staff monteur = null;
    protected Staff raceengineer = null;
    protected Staff coureur = null;
    protected Auto auto = null;
    

    protected String teamname;


    public Team(Staff strat, Staff mont,Staff raceeng,Staff cour , int au, String team, int motor){
        strateeg = strat;
        monteur = mont;
        raceengineer = raceeng;
        coureur = cour;
        teamname = team;
        if(au == 1){
            auto = new MCL60(motor);
        }
        if(au == 2){
            auto = new W15(motor);
        }
        if(au == 3){
            auto = new SF_24(motor);
        }
      
    
    }

    public abstract String getTeam();

    

    public abstract String getTeamname();

    

 



}
