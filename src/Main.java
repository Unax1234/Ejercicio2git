import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fecha = JOptionPane.showInputDialog("Teclea una fecha yyyy-MM-dd");
        LocalDate fecha1=LocalDate.parse(fecha,formato);
        JOptionPane.showMessageDialog(null, fecha1);

    }
}