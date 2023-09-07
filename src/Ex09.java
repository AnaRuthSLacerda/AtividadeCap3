import javax.swing.*;

public class Ex09 {
    public static void main(String[] args) {

        double maior = Double.parseDouble (JOptionPane.showInputDialog ("Base maior: "));

        double menor = Double.parseDouble (JOptionPane.showInputDialog ("Base menor"));

        double altura = Double.parseDouble (JOptionPane.showInputDialog ("Altura"));

        double area = (maior + menor) * altura / 2;

        JOptionPane.showMessageDialog (null, "A área total do trapézio é: "+area);

    }
}
