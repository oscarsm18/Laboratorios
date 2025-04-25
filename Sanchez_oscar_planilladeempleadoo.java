/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanchez_oscar_planilladeempleadoo;

/**
 *
 * @author oscarsanchez
 */
import java.util.Scanner;
public class Sanchez_oscar_planilladeempleadoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // public class Sanchez_oscar_planilladeempleado {
        Scanner sin = new Scanner(System.in);
        //Boleta del empleado
        System.out.print(" Ingrese el nombre del empleado: ");
        String nombre = sin.nextLine();
         
        System.out.print(" Horas de trabajado mensual: ");
        int hora = sin.nextInt();
        
        System.out.print(" Tarifa por hora: ");
        double tarifa = sin.nextDouble();
        
        System.out.print(" Salario del empleado semanal: ");
        double salario = hora/3*tarifa;
        
        System.out.println("---- Boleta del empleado ----");
        System.out.println(" Nombre del empleado: "+nombre+"\n");
        System.out.println(" Horas de trabajado mensual "+hora+"\n");
        System.out.println(" Tarifa por hora "+tarifa+"\n");
        System.out.println(" Salario del empleado semanal "+salario+"\n");
        
        sin.close();
    }
    
}
