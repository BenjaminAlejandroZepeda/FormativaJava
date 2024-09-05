
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Docente {
   private String rut;
   private String nombreDocente;
   private Date fIngreso;
   private String sede;

    public Docente() {
        this.rut = "00.000.000-7";
        this.nombreDocente = "vacio";
        this.fIngreso = new Date(2024, 03, 1);
        this.sede = "Viña del mar";
    }

    public Docente(String rut, String nombreDocente, Date fIngreso, String sede) {
        this.rut = rut;
        this.nombreDocente = nombreDocente;
        this.fIngreso = fIngreso;
        this.sede = sede;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public Date getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(Date fIngreso) {
        this.fIngreso = fIngreso;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Docente{" + "rut=" + rut + ", nombreDocente=" + nombreDocente + ", fIngreso=" + fIngreso + ", sede=" + sede + '}';
    }

    
   
   
   
}
