package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thoma
 */
public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora(int horasTrabajadas, double tarifaPorHora, String nombre, String apellido, String numeroSocial) {
        super(nombre, apellido, numeroSocial);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    @Override
    public double calcularDevengado(){
        return horasTrabajadas * tarifaPorHora;
    }  
    
    @Override
    public double calcularDeducciones(){
        double fondoSolidaridad = calcularDevengado() * 0.01;
        double retencionFuente = calcularDevengado() * 0.1;
        return fondoSolidaridad + retencionFuente;
    }
    
    
    
    
    
    
}
