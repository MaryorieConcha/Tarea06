package principal;

import gui.VentanaBienvenida;
import model.data.DBGenerator;

public class Principal {
    public static void main(String[] args) throws ClassNotFoundException {
        DBGenerator.iniciarBD("Universidad");
        VentanaBienvenida ventanaBienvenida = new VentanaBienvenida();
    }
}