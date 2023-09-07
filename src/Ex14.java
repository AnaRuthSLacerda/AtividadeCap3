import javax.swing.*;

public class Ex14 {
    public static void main(String[] args) {

        int idade, meses, dias, semanas;

        int nascimento = Integer.parseInt (JOptionPane.showInputDialog ("Insira seu ano de nascimento"));

        int ano = Integer.parseInt (JOptionPane.showInputDialog ("Em que anos estamos?"));

        idade = ano - nascimento;
        meses = idade * 12;
        dias = idade * 365;
        semanas = idade * 52;

        JOptionPane.showMessageDialog (null, "Você tem "+ idade + " anos");
        JOptionPane.showMessageDialog (null, "Você tem "+ meses + " meses");
        JOptionPane.showMessageDialog (null, "Você tem "+ dias + " dias");
        JOptionPane.showMessageDialog (null, "Você tem "+ semanas + " semanas");

    }
}
