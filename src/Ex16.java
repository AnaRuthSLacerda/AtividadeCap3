import javax.swing.*;

public class Ex16 {
    public static void main(String[] args) {

        double catetoA = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor do cateto A"));
        double catetoB = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor do cateto B"));

        double hipotenusa = Math.sqrt (catetoA * catetoA + catetoB * catetoB);

        JOptionPane.showMessageDialog (null, "O valor da hipotenusa é: "+hipotenusa);

    }
}
