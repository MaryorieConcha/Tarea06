package model.data.dao;

import model.Carrera;
import model.data.DBConnector;
import model.data.DBGenerator;

public class CarreraDAO {
    public static boolean añadirCarrera(String nombreCarrera, String codigoCarrera, int cantSemestres) throws
            ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("nombre_bd");
        if(!CarreraDAO.validarExistenciaCarrera(query,"codigo",codigoCarrera)){
            Carrera carrera = new Carrera(nombreCarrera,codigoCarrera,cantSemestres);
            CarreraDAO.agregarCarrera(query,carrera);
            DBConnector.closeConnection();
            return true;
        }
        else{
            return false;
        }
    }
    public static Object[] getCodigoCarreras() throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("nombre_bd");
        Object[] carreras = CarreraDAO.getCodigoCarreras(query);
        DBConnector.closeConnection();
        return carreras;
    }
}