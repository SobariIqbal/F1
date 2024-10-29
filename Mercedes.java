//Soort team
public class Mercedes extends Team {
    private String teamnaam = "Mercedes";

    protected Mercedes(Strateeg strateeg, Monteur monteur,Coureur coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,coureur, auto, teamnaam);
    }

    protected String getTeam(){
        return teamnaam;
    }


    protected String getTeamname(){
        if (eigenteamnaam == null){
            return "Mercedes";
        }
        return eigenteamnaam;
    }

   

    




}
