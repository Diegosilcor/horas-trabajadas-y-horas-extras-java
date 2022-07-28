import javax.swing.JOptionPane;

// Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 dias.

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) {
        int dia, mes, año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if ((dia >= 1) && (dia <= 30)) { // Si el dia es correcto
            if ((mes >= 1) && (mes <= 12)) { // Si el mes es correcto
                if (año != 0) { // Si el año es correcto
                }
                
                else {
                    JOptionPane.showMessageDialog(null, "Fecha Incorrecta, año incorrecto");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Fecha Incorrecta, mes incorrecto");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Fecha Incorrecta, dia incorrecto");
    }
    }
}
