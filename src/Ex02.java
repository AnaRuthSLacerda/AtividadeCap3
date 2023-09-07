import javax.swing.*;

public class Ex02 {
    public static void main(String[] args) {

        double n1 = Double.parseDouble (JOptionPane.showInputDialog ("Qual o primeiro número da multiplicação?"));

        double n2 = Double.parseDouble (JOptionPane.showInputDialog ("Qual o segundo número?"));

        double n3 = Double.parseDouble (JOptionPane.showInputDialog ("Qual o terceiro número?"));

        double resultado = n1 * n2 * n3;

        JOptionPane.showMessageDialog (null, "O resultado é "+resultado);
    }
}
