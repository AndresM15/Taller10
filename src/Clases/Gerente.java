/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author thoma
 */
public class Gerente extends Empleado{
    private double sueldoMensual;
    private double bonoMensual;
    private double retencionFuente;
    private double salud;
    private double pension;
    private double impuestoRiqueza;

    public Gerente(double sueldoMensual, double bonoMensual, double retencionFuente, double salud, double pension, double impuestoRiqueza, String nombre, String apellido, String numeroSocial) {
        super(nombre, apellido, numeroSocial);
        this.sueldoMensual = sueldoMensual;
        this.bonoMensual = bonoMensual;
        this.retencionFuente = retencionFuente;
        this.salud = salud;
        this.pension = pension;
        this.impuestoRiqueza = impuestoRiqueza;
    }

    @Override
    public double calcularDevengado(){
        return sueldoMensual + bonoMensual;
    }
    
    @Override
    public double calcularDeducciones(){
        return retencionFuente + salud + pension + impuestoRiqueza;
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
     * @return the bonoMensual
     */
    public double getBonoMensual() {
        return bonoMensual;
    }

    /**
     * @param bonoMensual the bonoMensual to set
     */
    public void setBonoMensual(double bonoMensual) {
        this.bonoMensual = bonoMensual;
    }

    /**
     * @return the retencionFuente
     */
    public double getRetencionFuente() {
        return retencionFuente;
    }

    /**
     * @param retencionFuente the retencionFuente to set
     */
    public void setRetencionFuente(double retencionFuente) {
        this.retencionFuente = retencionFuente;
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

    /**
     * @return the impuestoRiqueza
     */
    public double getImpuestoRiqueza() {
        return impuestoRiqueza;
    }

    /**
     * @param impuestoRiqueza the impuestoRiqueza to set
     */
    public void setImpuestoRiqueza(double impuestoRiqueza) {
        this.impuestoRiqueza = impuestoRiqueza;
    }
    
    
    
}
