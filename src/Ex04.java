import javax.swing.*;

public class Ex04 {
    public static void main(String[] args) {

        double n1 = Double.parseDouble (JOptionPane.showInputDialog ("Diga o primeiro número para que a média seja calculada"));

        double n2 = Double.parseDouble (JOptionPane.showInputDialog ("Diga o segundo"));

        double media = (n1*2 + n2*3)/5;

        JOptionPane.showMessageDialog (null, "A média desses dois números é: "+media);



    }
}
