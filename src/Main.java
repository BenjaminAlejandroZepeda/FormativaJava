
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @BenjaminZepeda
 * version 05/09/2024
 */



public class Main {
    static int opc;
    public static void main(String[] args) {
        String nombreAlumno;
        String rutAlumno;
        int anio, mes, dia;
        Date fecha;
        int Nota1,Nota2,Nota3;
        
    Utilidad S1 = new Utilidad();
    Docente D1 = new Docente();
    Alumno A1 = new Alumno();
     Asignatura As1 = new Asignatura();
    
    int opc;

        do {
            opc = S1.Menu();
            
            if (opc == 1){
                System.out.println("1. Registrar Alumno");
                Scanner leer = new Scanner(System.in);
                
                System.out.println("Ingresa Nombre de alumno: ");
                nombreAlumno = leer.nextLine();
                A1.setNombre(nombreAlumno);
                System.out.println("Ingresa Rut del alumno");
                rutAlumno = leer.nextLine();
                A1.setRut(rutAlumno);
                System.out.println("Ingresa Fecha de nacimiento");
                System.out.println("Año: ");
                anio = leer.nextInt();
                System.out.println("mes: ");
                mes = leer.nextInt();
                System.out.println("dia: ");
                dia = leer.nextInt();
                fecha = new Date(anio,mes,dia);
                A1.setFechaNacimiento(fecha);
                System.out.println("Alumno Registrado");
                System.out.println(A1.toString());
               
            }
            else if (opc == 2){
                System.out.println("2. Registrar docente");
                Scanner leer = new Scanner(System.in);
                
                System.out.println("Ingresa Nombre de Docente: ");
                nombreAlumno = leer.nextLine();
                D1.setNombreDocente(nombreAlumno);
                System.out.println("Ingresa Rut del Docente");
                rutAlumno = leer.nextLine();
                D1.setRut(rutAlumno);
                System.out.println("Ingresa Fecha de nacimiento");
                System.out.println("Año: ");
                anio = leer.nextInt();
                System.out.println("mes: ");
                mes = leer.nextInt();
                System.out.println("dia: ");
                dia = leer.nextInt();
                fecha = new Date(anio,mes,dia);
                D1.setfIngreso(fecha);
                System.out.println("Alumno Registrado");
                System.out.println(D1.toString());
               
                
            }
            else if (opc == 3){
                System.out.println("3. Registrar asignatura");
                Scanner leer = new Scanner(System.in);
               
                System.out.println("Ingresa datos Asignatura");
                System.out.println("Ingresa ID de asignatura");
                String ID;
                ID = leer.nextLine();
                As1.setIdAsignatura(ID);
                System.out.println("Docente...");
                As1.setNombreDocente(D1);
                System.out.println("Ingrese Nombre Asignatura: ");
                nombreAlumno = leer.nextLine();
                As1.setNombreAsignatura(nombreAlumno);
                System.out.println("Alumno....");
                As1.setNombreEstudiante(A1);
                System.out.println("Registrado");
                System.out.println(As1.toString());
               
               
            }
            else if (opc == 4){
                System.out.println("4. Calcular notas");
                Scanner leer = new Scanner(System.in);
                System.out.println("Nota 1: ");
                Nota1 = leer.nextInt();
                System.out.println("Nota 2: ");
                Nota2 = leer.nextInt();
                System.out.println("Nota 4: ");
                Nota3 = leer.nextInt();
                nota n1 = new nota(Nota1, Nota2, Nota3);
                
                System.out.println("Resultado: "+ n1.toString() + "Promedio: "+ n1.promedio(Nota1, Nota2, Nota3) );
                
                
            }
            else if (opc == 5){
                System.out.println("5. Salir");
                
                break;
            }
           
        } while ( opc > 0 || opc < 6 );
        
    }
}
    
    
    

