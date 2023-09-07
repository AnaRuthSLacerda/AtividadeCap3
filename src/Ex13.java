import javax.swing.*;

public class Ex13 {
    public static void main(String[] args) {

        int n = Integer.parseInt (JOptionPane.showInputDialog ("Informe o número"));

        for (int i = 0; i <=12; i++){
            int resultado = n * i;
            JOptionPane.showMessageDialog (null, n + " x " +i + " = " + resultado );
        }

    }
}
