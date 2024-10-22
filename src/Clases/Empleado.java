package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thoma
 */
public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected String numeroSocial;

    public Empleado(String nombre, String apellido, String numeroSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSocial = numeroSocial;
    }
    
    public abstract double calcularDevengado();
    
    
    public abstract double calcularDeducciones();
    
    public double calcularSalarioNeto(){
        return calcularDevengado() - calcularDeducciones();
    }
    
    public String getInformacion(){
        return "nombre" + nombre + " " + apellido + "\nSeguro Social: " + numeroSocial;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the numeroSocial
     */
    public String getNumeroSocial() {
        return numeroSocial;
    }

    /**
     * @param numeroSocial the numeroSocial to set
     */
    public void setNumeroSocial(String numeroSocial) {
        this.numeroSocial = numeroSocial;
    }

    
}
