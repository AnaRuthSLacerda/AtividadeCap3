import javax.swing.*;

public class Ex17 {
    public static void main(String[] args) {

    double raio = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor do raio da esfera"));

    double comprimento = 2 * Math.PI * raio;

    double area = Math.PI * raio * raio;

    double volume = 4.0 / 3.0 * Math.PI * Math.pow (raio, 3);

    JOptionPane.showMessageDialog (null, "O comprimento da esfera é: "+comprimento);
    JOptionPane.showMessageDialog (null, "Área da esfera: "+area);
    JOptionPane.showMessageDialog (null, "Volume da esfera: " + volume);

    }
}
