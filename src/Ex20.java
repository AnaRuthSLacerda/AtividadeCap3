import javax.swing.*;

public class Ex20 {
    public static void main(String[] args) {

        double angulo = Double.parseDouble (JOptionPane.showInputDialog ("Informe a medida do ângulo:"));
        double distancia = Double.parseDouble (JOptionPane.showInputDialog ("Informe a distância da escada à parede:"));

        double medidaEscada = distancia / Math.cos (Math.toRadians (angulo));

        JOptionPane.showMessageDialog (null, "A medida da escada é: "+medidaEscada);

    }
}
