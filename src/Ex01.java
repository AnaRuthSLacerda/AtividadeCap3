import javax.swing.*;

public class Ex01 {
    public static void main(String[] args) {

        double n1 = Double.parseDouble (JOptionPane.showInputDialog ("Insira um número para que a subtração seja feita"));

        double n2 = Double.parseDouble (JOptionPane.showInputDialog ("Insira o segundo número para realizar a subtração"));

        double resultado = n1 - n2;

        JOptionPane.showMessageDialog (null, "O resultado da subtração entre "+n1+ " e " +n2+" É: "+resultado);
    }
}
