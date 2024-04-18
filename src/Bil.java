public abstract class Bil {
    int regNr;
    String mærke;
    String model;
    int årgang;
    int antalDøre;

    public Bil(int regNr, String mærke, String model, int årgang, int antalDøre) {
        this.regNr = regNr;
        this.model = model;
        this.mærke = mærke;
        this.årgang = årgang;
        this.antalDøre = antalDøre;

    }
    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public int getRegNr() {
        return regNr;
    }
    public int getÅrgang() {
        return årgang;
    }
    public int getAntalDøre() {
        return antalDøre;
    }
    public String getMærke() {
        return mærke;
    }
    public String getModel() {
        return model;
    }
    public abstract double beregnGrønEjerafgift();
}
