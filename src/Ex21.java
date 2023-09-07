import javax.swing.*;

public class Ex21 {
    public static void main(String[] args) {

        double horasTrabalhadas = Double.parseDouble (JOptionPane.showInputDialog ("Informe o número de horas trabalhadas"));
        double salarioMinimo = 1.320;

        double horasExtras = Double.parseDouble (JOptionPane.showInputDialog ("Informe o número de horas extras"));

        double valorHoraTrabalhada = salarioMinimo / 8;
        double valorHoraExtra = salarioMinimo / 4;

        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        double quantiaHorasExtras = horasExtras * valorHoraExtra;
        double salarioReceber = salarioBruto + quantiaHorasExtras;

        JOptionPane.showMessageDialog (null, "O salário a receber é: "+ salarioReceber);

    }

}
