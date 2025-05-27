public class VerkeersBoete {
    private String naamDader;
    private String kenteken;
    private double bedrag;

    public String getNaamDader() { return naamDader; }
    public void setNaamDader(String naamDader) { this.naamDader = naamDader; }

    public String getKenteken() { return kenteken; }
    public void setKenteken(String kenteken) { this.kenteken = kenteken; }

    public double getBedrag() { return bedrag; }
    public void setBedrag(double bedrag) { this.bedrag = bedrag; }

    @Override
    public String toString() {
        return naamDader + " met kenteken " + kenteken + " heeft als boete: " + bedrag + " euro.";
    }
}
