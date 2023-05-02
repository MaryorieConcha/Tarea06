package model;

import utils.ValidadorRut;

import java.util.ArrayList;

public class Carrera {

    private String careerName, careerCode;
    private int cantSemestres;
    private ArrayList<Estudiante> estudiantes;

    public Carrera(String careerName, String careerCode, int cantSemestres, ArrayList<Estudiante> estudiantes) {
        this.careerName = careerName;
        this.careerCode = careerCode;
        this.cantSemestres = cantSemestres;
        this.estudiantes = estudiantes;
    }

    //se deben poder agregar y eliminar objetos de tipo estudiante, con las validaciones necesarias

    public Estudiante buscarEstudiantes(String rut){
        Estudiante estudiante = null;
        for (Estudiante estudiante1 : this.estudiantes) {
            if (estudiante1.getRut().equals(rut)) {
                estudiante = estudiante1;
                break;
                }
            }
            return estudiante;
    }
    public Estudiante agregarEstudiante(Estudiante estudiante, String rut) {
        if (ValidadorRut.validarDigito(rut) && this.buscarEstudiantes(rut)==null){
            this.estudiantes.add(estudiante);
        }
        return estudiante;
    }

    public ArrayList<Estudiante> eliminarEstudiante(Estudiante estudiante, String rut){
        if (ValidadorRut.validarRut(rut) && this.buscarEstudiantes(rut)== estudiante) {
            this.estudiantes.remove(estudiante);
        }
        return estudiantes;
    }
}