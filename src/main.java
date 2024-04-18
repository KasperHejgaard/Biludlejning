public class main {
    public static void main(String[] args) {
        Garage minGarage = new Garage("Min Garage");

        BenzinBil benzinBil = new BenzinBil(1231, "Mercedes", "C63", 2020, 5, 24, 10);
        Dieselbil dieselbil = new Dieselbil(528712, "Audi", "RS6", 2020, 5, true, 12);
        Elbil elbil = new Elbil(12381, "Tesla", "Model X", 2024, 5, 23, 240, 10);

        minGarage.tilføjBil(benzinBil);
        minGarage.tilføjBil(dieselbil);
        minGarage.tilføjBil(elbil);

        System.out.println(minGarage);

        double samletGrønEjerafgift = minGarage.beregnGrønEjerafgiftForBilPark();
        System.out.println("Den samlede grønejerafgift for bilerne i garagen er: " + samletGrønEjerafgift + " i kr.");

    }
}
