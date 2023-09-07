import javax.swing.*;

public class Ex10 {
    public static void main(String[] args) {

        double lado = Double.parseDouble (JOptionPane.showInputDialog ("Informe o lado do quadrado"));

        double area = lado * lado;

        JOptionPane.showMessageDialog (null, "A área do quadrado é: "+area);

    }
}
