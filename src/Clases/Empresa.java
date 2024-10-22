/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void calcularNomina(){
        for(Empleado empleado : empleados){
            System.out.println(empleado.getInformacion());
            System.out.println("Salario Devengado: "+ empleado.calcularDevengado());
            System.out.println("Deducciones: "+empleado.calcularDeducciones());
            System.out.println("Salario Neto: "+empleado.calcularSalarioNeto());
            System.out.println("----------------------------------------------------");
            
        }
    }
    
    
    
    
}
