public class Dieselbil extends Bil {
    boolean harPartikelFilter;
    int kmPrL;

    public Dieselbil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelFilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }
    public int getKmPrL() {
        return kmPrL;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }
    @Override
    public String toString() {
        return "Reg nummer: " + regNr + "\n " + "Mærke: " + mærke + "\n " +"Model: " + model + "\n " +"Årgang: " + årgang + "\n " +"Antal Døre: " + antalDøre + "\n " + "Partikel Filter: " + harPartikelFilter + "\n " + "Km/l: " + kmPrL;
    }
    @Override
    public double beregnGrønEjerafgift() {
        double grønEjerafgift = 0;
        if (kmPrL >= 20 && kmPrL < 50) {
            grønEjerafgift = 130;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            grønEjerafgift = 1390;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            grønEjerafgift = 1850;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            grønEjerafgift = 2770;
        } else {
            grønEjerafgift = 15260;
        }
        if (!harPartikelFilter) {
            grønEjerafgift += 1000;
        }
        return grønEjerafgift;
    }

}
