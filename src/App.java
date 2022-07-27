import javax.swing.JOptionPane;

// Un obrero necesita calcular su salario semanal, el cual se obtine de la siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. Si trabaja mas de 40 horas se le paga $16 por cada una de las primera 40 horas y $20 por cada hora extra.

public class App {
    public static void main(String[] args) throws Exception {
        int horasTrabajadas;
        float salarioTotal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de horas trabajadas"));

        if (horasTrabajadas <= 40) {
            salarioTotal = horasTrabajadas *16;
        }
        else {
            salarioTotal = (40 * 16) + ((horasTrabajadas - 40) * 20);
        }
        JOptionPane.showMessageDialog(null, "El salario total es: $" + salarioTotal);
    }
}
