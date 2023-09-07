import javax.swing.*;

public class Ex07 {
    public static void main(String[] args) {

        double peso = Double.parseDouble (JOptionPane.showInputDialog ("Insira o peso: "));

        double aumento = peso + (peso * 0.15);
        double perca = peso - (peso * 0.20);

        JOptionPane.showMessageDialog (null, "Se uma pessoa que pesa "+peso+" engordar 15%, seu novo peso será: "+aumento);
        JOptionPane.showMessageDialog (null, "Se uma pessoa que pesa "+peso+" perder 20% de seu peso, seu novo peso será: "+perca);


    }
}
