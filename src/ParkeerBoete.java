public class ParkeerBoete extends VerkeersBoete{
    private String zone;

    public String getZone() { return zone; }
    public void setZone(String zone) { this.zone = zone; }

    public ParkeerBoete(String naam, String kenteken, String zone){
        setNaamDader(naam);
        setKenteken(kenteken);
        this.zone = zone;

    }

    public void bepaalBedrag(){
        if (zone.equals("1")) {
            setBedrag(60);
        }
        else if (zone.equals("2")) {
            setBedrag(100);
        }
        else if (zone.equals("3")) {
            setBedrag(180);
        }
    }

    @Override
    public String toString() {
        return "Parkeerboete voor " + getNaamDader() + ", kenteken " + getKenteken() + ", " + getBedrag() + " euro in zone " + getZone();
    }
}
