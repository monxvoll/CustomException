import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        int cantidadRuedas = 0;
        cantidadRuedas = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese el numero de ruedas de su automovil"));
        try {
            Carro operacion = new Carro(cantidadRuedas);
        } catch (MyExeption e) {
            System.out.println(e.getMessage());
        }

    }
}