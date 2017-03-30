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
public class Empresa {
    private ArrayList<Empleado> empleados;
    
    public Empresa(){
        this.empleados = new ArrayList<>();        
    }
    
    public void agregarEmpleado(Empleado e){
        this.empleados.add(e);
    }
    
    public double calcularNomina(){
        double nomina = 0;
        for (Empleado empleado : empleados){
            nomina+=empleado.calcularSalario();            
        }
        
        return nomina;
    }
    
    public ArrayList<Empleado> ListarEmpleado(){
        return this.empleados;
    }
    
    public double calcularNominaProgramadores(){
        double nomina = 0;
        for (Empleado empleado : empleados){
        if(empleado instanceof Programador){
            nomina+=empleado.calcularSalario();
        }       
    }
         return nomina;
    }
    
      public double calcularNominaArquitectos(){
        double nomina = 0;
        for (Empleado empleado : empleados){
        if(empleado instanceof Arquitecto){
            nomina+=empleado.calcularSalario();
        }       
    }
         return nomina;
    }
    
}
