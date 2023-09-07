import javax.swing.*;

public class Ex18 {
    public static void main(String[] args) {

        double Celsius = Double.parseDouble (JOptionPane.showInputDialog ("Digite a temperatura em Celsius"));

        double Fahrenheit = 180 * (Celsius + 32) / 100;

        JOptionPane.showMessageDialog (null, "A temperatura em Fahrenheit é: "+Fahrenheit);

    }
}
