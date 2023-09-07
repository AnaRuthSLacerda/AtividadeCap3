import javax.swing.*;

public class Ex19 {
    public static void main(String[] args) {

        double largura = Double.parseDouble (JOptionPane.showInputDialog ("Informe a largura do cômodo em metros: "));

        double comprimento = Double.parseDouble (JOptionPane.showInputDialog ("Informe o comprimento do cômodo em metros: "));

        double area = largura * comprimento;

        double potencia = area * 18;

        JOptionPane.showMessageDialog (null, "Área do cômodo "+area+ " m²");
        JOptionPane.showMessageDialog (null, "Potência de iluminação necessária: "+potencia+" W");

    }
}
