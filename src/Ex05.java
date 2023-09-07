import javax.swing.*;
import java.awt.*;

public class Ex05 {
    public static void main(String[] args) {

        double valor = Double.parseDouble (JOptionPane.showInputDialog ("Insira o valor do produto que receberá o desconto"));
        double desconto = valor * 0.1;

        double novo = valor - desconto;

        JOptionPane.showMessageDialog (null, "O novo valor é: "+novo);

    }
}
