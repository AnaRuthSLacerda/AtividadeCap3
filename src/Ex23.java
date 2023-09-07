import javax.swing.*;

public class Ex23 {
    public static void main(String[] args) {

        double angulo1 = Double.parseDouble (JOptionPane.showInputDialog ("Digite a medida do primeiro ângulo"));
        double angulo2 = Double.parseDouble (JOptionPane.showInputDialog ("Digite a medida do segundo ângulo"));

        double angulo3 = 180 - angulo1 - angulo2;

        JOptionPane.showMessageDialog (null, "A medida do terceiro ângulo é: "+ angulo3 + " graus");


    }
}
