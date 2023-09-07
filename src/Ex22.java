import javax.swing.*;
import java.awt.*;

public class Ex22 {
    public static void main(String[] args) {

        int numeroLados = Integer.parseInt (JOptionPane.showInputDialog ("Informe o número de lados do polígono"));

        int numeroDiagonais = numeroLados * (numeroLados - 3) / 2;

        JOptionPane.showMessageDialog (null, "O número de diagonais do polígono é: "+numeroDiagonais);

    }
}
