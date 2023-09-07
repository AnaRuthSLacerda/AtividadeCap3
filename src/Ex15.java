import javax.swing.*;

public class Ex15 {
    public static void main(String[] args) {

        double salario = Double.parseDouble (JOptionPane.showInputDialog ("Informe seu salário total: "));
        double c1 = Double.parseDouble (JOptionPane.showInputDialog ("Valor da primeira conta: "));
        double c2 = Double.parseDouble (JOptionPane.showInputDialog ("Valor da segunda conta"));

        double conta1, conta2, total;

        conta1 = c1 * 0.02;
        conta2 = c2 * 0.02;
        total = salario - (conta1 + c1 + conta2 + c2);

        JOptionPane.showMessageDialog (null, "Após pagar as contas, restará "+total+" do salário de João");

    }
}
