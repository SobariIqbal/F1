public abstract class Team {


    protected Strateeg strateeg = null;
    protected Monteur monteur = null;
    protected Coureur coureur = null;
    protected Auto auto = null;
    

    protected String teamname;


    public Team(Strateeg strat, Monteur mont, Coureur cour , Auto au, String team){
        strateeg = strat;
        monteur = mont;
        
        coureur = cour;
        teamname = team;
        auto = au;
        // if(au == 1){
        //     auto = new MCL60(motor);
        // }
        // if(au == 2){
        //     auto = new W15(motor);
        // }
        // if(au == 3){
        //     auto = new SF_24(motor);
        // }
      
    
    }

    public abstract String getTeam();

    

    public abstract String getTeamname();

    

 



}
