/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author thoma
 */
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        EmpleadoPorHora empleado1 = new EmpleadoPorHora(40, 20.0, "Ana ", "Perez", "25856");
        EmpleadosPorSueldo empleado2 = new EmpleadosPorSueldo(5000.0, 1000.0, 700.0, 250.0, 300.0, "Mario", "Tirapues", "4467");
        Gerente gerente = new Gerente(5026.0, 1000.0, 700.0, 250.0, 302.0, 362.0, "antonio", "Suesca", "7590");
        
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(gerente);
        
        empresa.calcularNomina();
    
    
    }
    
}
