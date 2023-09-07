import javax.swing.*;

public class Ex25 {
    public static void main(String[] args) {

    int hora, minutos, horaMinutos, totalMinutos, segundos;

    hora = Integer.parseInt (JOptionPane.showInputDialog ("Informe a hora"));
    minutos = Integer.parseInt (JOptionPane.showInputDialog ("Informe os minutos"));

    horaMinutos = hora * 60;
    totalMinutos = horaMinutos + minutos;
    segundos = totalMinutos * 60;

    JOptionPane.showMessageDialog (null, "Hora(exata) em minutos: "+horaMinutos);
    JOptionPane.showMessageDialog (null, "Total de minutos: "+totalMinutos);
    JOptionPane.showMessageDialog (null, "Minutos em segundos: "+segundos);

    }
}
