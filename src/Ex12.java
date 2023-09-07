import javax.swing.*;

public class Ex12 {
    public static void main(String[] args) {

        double salario = Double.parseDouble (JOptionPane.showInputDialog ("Informe o seu salário: "));

        double m = 1.320;

        double salarios = salario / m;

        JOptionPane.showMessageDialog (null, "Você recebe o equivalente a "+salarios+" salário mínimos");

    }
}
