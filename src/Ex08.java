import javax.swing.*;

public class Ex08 {
    public static void main(String[] args) {

        double peso = Double.parseDouble (JOptionPane.showInputDialog ("Informe o peso(em kg)"));

        double gramas = peso * 1000;

        JOptionPane.showMessageDialog (null, "O peso em gramas é: "+gramas);

    }
}
