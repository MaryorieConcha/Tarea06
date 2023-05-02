package model;

public class Estudiante {

	private String name, apellido, rut;
	private  int numMatricula;
	private CarreraEstudiante carrera;

	//Constructor con y sin parametros.

	public Estudiante(String name, String apellido, String rut, int numMatricula, CarreraEstudiante carrera) {
		this.name = name;
		this.apellido = apellido;
		this.rut = rut;
		this.numMatricula = numMatricula;
		this.carrera = carrera;
	}

	public Estudiante(){}

	//Metodos getter and setter.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public CarreraEstudiante getCarrera() {
		return carrera;
	}

	public void setCarrera(CarreraEstudiante carrera) {
		this.carrera = carrera;
	}
}