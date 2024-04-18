public class Elbil extends Bil {
    int batterikapacitetKWh;
    int maxKm;
    int whPrKm;

    public Elbil(int regNr, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }
    public int getMaxKm() {
        return maxKm;
    }
    public int getWhPrKm() {
        return whPrKm;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }
    @Override
    public String toString() {
        return "Reg nummer: " + regNr + "\n " + "Mærke: " + mærke + "\n " +"Model: " + model + "\n " +"Årgang: " + årgang + "\n " +"Antal Døre: " + antalDøre + "\n " + "Batteri kapacitet i KWh: " + batterikapacitetKWh + "\n " + "Max km: " + maxKm + "\n " + "Wh pr km: " + whPrKm;
    }
    @Override
    public double beregnGrønEjerafgift(){
        double omregn = 100 / (whPrKm/91.25);
        if (omregn >= 20 && omregn < 50) {
            return 330;
        } else if (omregn >= 15 && omregn < 20) {
            return 1050;
        } else if (omregn >= 10 && omregn < 15) {
            return 2340;
        } else if (omregn >= 5 && omregn < 10) {
            return 5500;
        } else {
            return 10470;
        }

    }
}
