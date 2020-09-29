package tddmocking;


public class TrajectPrijsService  {

    private TrajectNaarTrajectEenhedenService krijgEenheid;
    private TrajectEenhedenNaarPrijsService eenheidNaarPrijs;

    public int getTrajectPrijs(String from, String to){
    int eenheden = krijgEenheid.getTrajectEenheden(from, to);
    int prijs = eenheidNaarPrijs.getPriceTrajectEenheden(eenheden);
    return eenheden * prijs;
    }

    public void setTrajectNaarTrajectEenhedenService(TrajectNaarTrajectEenhedenService s) {
        this.krijgEenheid = s;
    }

    public void setTrajectEenhedenNaarPrijsService(TrajectEenhedenNaarPrijsService s) {
        this.eenheidNaarPrijs = s;
    }

}
