package principal;

import javax.swing.JOptionPane;

import model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(0, 0);
        veiculo.setKm(Double.parseDouble(JOptionPane.showInputDialog("Quantos Km: ")));
        veiculo.setLitro(Double.parseDouble(JOptionPane.showInputDialog("Quantos Litros: ")));
        JOptionPane.showMessageDialog(null, "Km/L Consumido: " + veiculo.getCombustivel());
    }
}
/*asdasd*/
