package model;


public class Veiculo {
    private double litro;
    private double km;

    public Veiculo(double km, double litro) {
        this.km = km;
        this.litro = litro;

    }

    public double getLitro() {
        return litro;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getCombustivel() {
        if (litro == 0) {
            return 0;
        }
            return ((getKm() / getLitro()));
    }
}
