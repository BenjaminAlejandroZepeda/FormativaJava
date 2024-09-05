/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
import java.util.Date;
/**
 *
 * @author vina
 */
public class Alumno {
    private String rut;
    private String nombre;
    private Date fechaNacimiento;
   

            
    public Alumno() {
        this.rut = "00.000.000-0";
        this.nombre = "............";
        this.fechaNacimiento = new Date(2024, 03, 1);
    }

    public Alumno(String rut, String nombre, Date fechaNacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" + "rut=" + rut + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "Edad= " +'}';
    }
   
}
