
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Utilidad {
    Scanner scanner = new Scanner(java.lang.System.in);
    public int op;
    public int Menu(){
        java.lang.System.out.println("Elije una Opción");
        java.lang.System.out.println("...................");
        java.lang.System.out.println("1. Registrar Alumno");
        java.lang.System.out.println("2. Registrar docente");
        java.lang.System.out.println("3. Registrar asignatura");
        java.lang.System.out.println("4. Calcular notas");
        java.lang.System.out.println("5. Salir");
        java.lang.System.out.println("(\"...................\");");
        java.lang.System.out.println("");
        java.lang.System.out.println("       Opción:        ");
        
            
           op = scanner.nextInt();
           if (op > 0 || op < 6){
               return op;
           }
           else{
            return 0;
           }
        
        }

}
