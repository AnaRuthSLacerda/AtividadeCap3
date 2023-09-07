import javax.swing.*;

public class Ex11 {
    public static void main(String[] args) {

        double maior = Double.parseDouble (JOptionPane.showInputDialog ("Diagonal maior: "));
        double menor = Double.parseDouble (JOptionPane.showInputDialog ("Diagonal menor: "));

        double area = maior * menor /2;

        JOptionPane.showMessageDialog (null, "A área total do losango é: "+area);

    }
}
