public abstract class Team {


    protected Strateeg strateeg = null;
    protected Monteur monteur = null;
    protected Coureur coureur = null;
    protected Auto auto = null;
    

    protected String teamname;


    protected Team(Strateeg strat, Monteur mont, Coureur cour , Auto au, String team){
        strateeg = strat;
        monteur = mont;
        coureur = cour;
        teamname = team;
        auto = au;
    }

    

    protected abstract String getTeam();

    

    protected abstract String getTeamname();

    

 



}
