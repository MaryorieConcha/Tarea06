package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaBienvenida extends Ventana {
    private JLabel textoEncabezado, textoRegistrarCarrera, textoRegistrarEstudiante, textoBuscarEstudiante;
    private JButton botonRegistrarCarrera, botonRegistrarEstudiante, botonBuscarEstudiante, botonSalir;
    //private Carrera carrera;

    public VentanaBienvenida(){
        super("Menú Intranet", 500, 520);

        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonSalir();
        generarBotonRegistrarCarrera();
        generarBotonRegistrarEstudiante();
        generarBotonBuscarEstudiante();
    }

    private void generarEncabezado(){
        String textoEncabezado = "Menú de Bienvenida";
        super.generarJLabelEncabezado(this.textoEncabezado, textoEncabezado, 190, 10, 200, 50);
    }

    private void generarBotonSalir(){
        String textoBotonSalir = "Salir";
        this.botonSalir = super.generarBoton(textoBotonSalir, 275, 400, 150, 20);
        this.add(this.botonSalir);
        this.botonSalir.addActionListener(this);
    }

    private void generarBotonRegistrarCarrera(){
        String textoBotonRegistrarCarrera = "Registrar Carrera";
        this.botonRegistrarCarrera = super.generarBoton(textoBotonRegistrarCarrera,150, 100, 200, 20);
        this.add(this.botonRegistrarCarrera);
        this.botonRegistrarCarrera.addActionListener(this);
    }

    private void generarBotonRegistrarEstudiante(){
        String textoBotonRegistrarEstudiante = "Registrar Estudiante";
        this.botonRegistrarEstudiante = super.generarBoton(textoBotonRegistrarEstudiante,150, 200, 200, 20);
        this.add(this.botonRegistrarEstudiante);
        this.botonRegistrarEstudiante.addActionListener(this);
    }

    private void generarBotonBuscarEstudiante(){
        String textoBotonBuscarEstudiante = "Buscar Estudiante";
        this.botonBuscarEstudiante = super.generarBoton(textoBotonBuscarEstudiante,150, 300, 200, 20);
        this.add(this.botonBuscarEstudiante);
        this.botonBuscarEstudiante.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonRegistrarCarrera){
            VentanaRegistroCarrera ventanaRegistroCarrera = new VentanaRegistroCarrera();
            this.dispose();
        }
        if (e.getSource() == this.botonRegistrarEstudiante){
            VentanaRegistroEstudiante ventanaRegistroEstudiante = new VentanaRegistroEstudiante();
            this.dispose();
        }
        if (e.getSource() == this.botonBuscarEstudiante) {
            VentanaBusquedaEstudiante ventanaBusquedaEstudiante = new VentanaBusquedaEstudiante();
            this.dispose();
        }
        if (e.getSource() == this.botonSalir){
            this.dispose();
        }
    }

}
/*
public class VentanaRegistrarCliente extends Ventana {
    private Automotora automotora;
    public VentanaRegistrarCliente(Automotora automotora){
        this.automotora= automotora;
    }*/