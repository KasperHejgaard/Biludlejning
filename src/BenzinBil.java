public class BenzinBil extends Bil {
    int oktantal;
    int kmPrL;

    public BenzinBil(int regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;

    }

    public int getOktantal() {
        return oktantal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }
    @Override
    public String toString() {
        return "Reg nummer: " + regNr + "\n " + "Mærke: " + mærke + "\n " +"Model: " + model + "\n " +"Årgang: " + årgang + "\n " +"Antal Døre: " + antalDøre + "\n " + "Oktantal: " + oktantal + "\n " + "Km/l: " + kmPrL;
    }

    @Override
    public double beregnGrønEjerafgift() {
        if (kmPrL >= 20 && kmPrL < 50) {
            return 330;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            return 1050;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            return 2340;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            return 5500;
        } else {
            return 10470;
        }
    }
}
