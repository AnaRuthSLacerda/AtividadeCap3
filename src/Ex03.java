import javax.swing.*;

public class Ex03 {
    public static void main(String[] args) {

    double n1 = Double.parseDouble (JOptionPane.showInputDialog ("Diga o primeiro número da divisão"));

    double n2 = Double.parseDouble (JOptionPane.showInputDialog ("Diga o segundo número para realizar a divisão"));

    double result = n1 / n2;

    JOptionPane.showMessageDialog (null, "O resultado da divisão entre "+n1+" e "+n2+" é "+result);

    }
}
