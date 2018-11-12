/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mis_Clases;

/**
 *
 * @author Carolina Amaya Muela 18550324
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int estadoCivil;
    // 0 soltero, 1 casado, 2 divorciado, 3 viudo
    private String direccion;

    public Persona() {
        nombre = "Caro";
        apellido = "Amaya";
        edad = 19;
        estadoCivil = EstadoCivil.VIUDO;
        direccion = "Z";
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstadoCivil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
