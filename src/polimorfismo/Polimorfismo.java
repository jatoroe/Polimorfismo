/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static int menu()
    {
        int opcion = 0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Agregar \n2. Listar \n3.Nomina \n4. Nomina Programadores \n5. Salir");
        
        opcion = teclado.nextInt();
        return (opcion);
    }
    public static void main(String[] args) 
    {
        
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;
        boolean x = true;
        Empresa empresa = new Empresa();
        
       do{
           opcion = menu();
           
           switch (opcion){
               case 1:
                   System.out.println("Ingresar nombre empleado");
                   String nombre = teclado.next();
                   System.out.println("Tipo empleado \n 1. Programador \n 2. Arquitecto ");
                   int tipo = teclado.nextInt();
                   Empleado empleado = null;
                   if (tipo == 1){
                       empleado = new Programador(nombre);
                   } else if (tipo == 2){
                       empleado = new Arquitecto(nombre);
                   }
                   break;               
               case 2:
                    ArrayList<Empleado> empleados = empresa.ListarEmpleado();
                    for(int i = 0; i<empleados.size();i++){
                        Empleado e = empleados.get(i);
                        if (e instanceof Programador){
                            System.out.println(e.getNombre() + " Programador");
                        }
                        else {
                            System.out.println(e.getNombre()+ " Arquitecto");
                                            }
                    }
                   break;
               case 3:
                   double nomina = empresa.calcularNomina();
                   System.out.println("Nomina " + nomina);
                   break;
               case 4: 
                   double nominaProgramador = empresa.calcularNominaProgramadores();
                   System.out.println("Nomina programador "+ nominaProgramador);
                   break;
               case 5:
                   System.out.println("Hasta pronto");
                   break;
                           
           }
           
       }while (opcion!=6);
     
    }
    
}
