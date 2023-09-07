import javax.swing.*;

public class Ex24 {
    public static void main(String[] args) {

        double dinheiroReais = Double.parseDouble (JOptionPane.showInputDialog ("Informe a quantidade de dinheiro: "));

        double cotacaoDolar = 4.95;
        double cotacaoMarcoAlemao = 2.00;
        double cotacaoLibraEsterlina = 3.57;

        double dinheiroDolares = dinheiroReais/cotacaoDolar;
        double dinheiroMarcoAlemao = dinheiroReais/cotacaoMarcoAlemao;
        double dinheiroLibraEsterlina = dinheiroReais/cotacaoLibraEsterlina;

        JOptionPane.showMessageDialog (null, "Valor em dólares: "+ dinheiroDolares);
        JOptionPane.showMessageDialog (null, "Valor em marco alemão: "+dinheiroMarcoAlemao);
        JOptionPane.showMessageDialog (null, "Valor em libra esterlina: "+dinheiroLibraEsterlina);

    }
}
