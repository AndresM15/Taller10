/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author thoma
 */
public class EmpleadosPorSueldo extends Empleado {
    private double sueldoMensual;
    private double RetencionFuente;
    private double fondoSolidaridad;
    private double salud;
    private double pension;

    public EmpleadosPorSueldo(double sueldoMensual, double RetencionFuente, double fondoSolidaridad, double salud, double pension, String nombre, String apellido, String numeroSocial) {
        super(nombre, apellido, numeroSocial);
        this.sueldoMensual = sueldoMensual;
        this.RetencionFuente = RetencionFuente;
        this.fondoSolidaridad = fondoSolidaridad;
        this.salud = salud;
        this.pension = pension;
    }

    @Override
    public double calcularDevengado(){
        return sueldoMensual;
    }
    
    @Override
    public double calcularDeducciones(){
        return RetencionFuente + fondoSolidaridad + salud + pension;
    }
            
            
    /**
     * @return the sueldoMensual
     */
    public double getSueldoMensual() {
        return sueldoMensual;
    }

    /**
     * @param sueldoMensual the sueldoMensual to set
     */
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * @return the RetencionFuente
     */
    public double getRetencionFuente() {
        return RetencionFuente;
    }

    /**
     * @param RetencionFuente the RetencionFuente to set
     */
    public void setRetencionFuente(double RetencionFuente) {
        this.RetencionFuente = RetencionFuente;
    }

    /**
     * @return the fondoSolidaridad
     */
    public double getFondoSolidaridad() {
        return fondoSolidaridad;
    }

    /**
     * @param fondoSolidaridad the fondoSolidaridad to set
     */
    public void setFondoSolidaridad(double fondoSolidaridad) {
        this.fondoSolidaridad = fondoSolidaridad;
    }

    /**
     * @return the salud
     */
    public double getSalud() {
        return salud;
    }

    /**
     * @param salud the salud to set
     */
    public void setSalud(double salud) {
        this.salud = salud;
    }

    /**
     * @return the pension
     */
    public double getPension() {
        return pension;
    }

    /**
     * @param pension the pension to set
     */
    public void setPension(double pension) {
        this.pension = pension;
    }
    
    
    
}
