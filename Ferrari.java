public class Ferrari extends Team{

    protected Ferrari(Strateeg strateeg, Monteur monteur,Coureur coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,coureur,auto,teamnaam);
    }

    protected String getTeam(){
        return "Ferrari";
    }

   

    protected String getTeamname(){
        if (teamname == null){
            return "Ferrari";
        }
        return teamname;
    }
 

}
