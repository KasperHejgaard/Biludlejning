import java.util.ArrayList;

public class Garage {
    private String navn;
    private ArrayList<Bil> bilPark;

public Garage(String navn){
    this.navn = navn;
    this.bilPark = new ArrayList<>();
}

public void tilføjBil(Bil bil) {
    bilPark.add(bil);
}

public double beregnGrønEjerafgiftForBilPark() {
double totalGrønAfgift = 0;
    for (Bil bil : bilPark) {
        totalGrønAfgift += bil.beregnGrønEjerafgift();
    }
    return totalGrønAfgift;
        
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Biler til salg i vores garage: ").append(" ").append("\n");
        for (Bil bil : bilPark) {
            sb.append(bil.toString()).append("\n");
        }
        return sb.toString();
    }
}