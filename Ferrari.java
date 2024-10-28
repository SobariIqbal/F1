public class Ferrari extends Team{

    public Ferrari(Strateeg strateeg, Monteur monteur,Coureur coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,coureur,auto,teamnaam);
    }

    public String getTeam(){
        return "Ferrari";
    }

   

    public String getTeamname(){
        if (teamname == null){
            return "Ferrari";
        }
        return teamname;
    }
 

}
