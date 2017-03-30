/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Estudiante
 */
public class Empleado 
{
  private String Nombre;
  private double Salario = 0;
  
  public Empleado(String nombre){
      this.Nombre = nombre;
  }
  
 public double calcularSalario(){
     return (0);
 }

    public String getNombre() {
        return Nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
 
 
}
