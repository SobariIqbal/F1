public abstract class Team {

   //aggregaties
    protected Strateeg strateeg = null;
    protected Monteur monteur = null;
    protected Coureur coureur = null;
    protected Auto auto = null;
    

    protected String eigenteamnaam;


    protected Team(Strateeg strat, Monteur mont, Coureur cour , Auto au, String team){
        strateeg = strat;
        monteur = mont;
        coureur = cour;
        eigenteamnaam = team;
        auto = au;
    }

    

    protected abstract String getTeam();

    

    protected abstract String getTeamname();

    

 



}
