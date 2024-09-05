/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Asignatura {
    
       private String IdAsignatura;
       private Docente nombreDocente;
       private String nombreAsignatura;
       private Alumno nombreEstudiante;


    public Asignatura() {
        this.IdAsignatura = "Vacio";
        this.nombreDocente = new Docente();
        this.nombreAsignatura = "vacio";
        this.nombreEstudiante = new Alumno();
    }


    public Asignatura(String IdAsignatura, Docente nombreDocente, String nombreAsignatura, Alumno nombreEstudiante) {
        this.IdAsignatura = IdAsignatura;
        this.nombreDocente = nombreDocente;
        this.nombreAsignatura = nombreAsignatura;
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getIdAsignatura() {
        return IdAsignatura;
    }

    public void setIdAsignatura(String IdAsignatura) {
        this.IdAsignatura = IdAsignatura;
    }

    public Docente getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(Docente nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Alumno getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(Alumno nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }



    @Override
    public String toString() {
        return "Asignatura{" + "IdAsignatura=" + IdAsignatura + ", nombreDocente=" + nombreDocente + ",\n nombreAsignatura=" + nombreAsignatura + ", nombreEstudiante=" + nombreEstudiante + '}';
    }
       
    
        
}
