import javax.swing.*;

public class Ex06 {
    public static void main(String[] args) {

        double salario = Double.parseDouble (JOptionPane.showInputDialog ("Insira o valor do salário fixo: "));
        double vendas = Double.parseDouble (JOptionPane.showInputDialog ("Valor total das vendas: "));

        double comissao = 0.04 * vendas;

        double salarioFinal = salario + comissao;

        JOptionPane.showMessageDialog (null, "A comissão é de: "+comissao+" Salário final: "+salarioFinal);

    }
}
