/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisVehiculos;

/**
 *
 * @author invitado
 */
public class vehiculo {
   private String marca;
   private String modelo;
   private int año;
   private int cilindros;
   private boolean estaEncendido;
   private int velocidad;
   //Agregar constructor default 
   public vehiculo(){
        marca = "Volkswagen";
        modelo = "Vocho";
        año = 1950;
        cilindros = 1;
        estaEncendido = false;
        velocidad = 0;
    
   
   }

    public vehiculo(String sMArca, String Modeldo, int año, int cilindros) {
        this.marca = "marca";
        this.modelo = "modelo";
        this.año = año;
        this.cilindros = cilindros;
        this.estaEncendido = false;
        velocidad = 0;
    
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
  // Imprimir datos del vehiculo
    public void imprimirDatos(){
        System.out.println("Tu vehículo es:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Cilindros: " + cilindros);
        
    }
    public void prender(){
    estaEncendido = true;
   
    }
    public void apagar(){
    estaEncendido = false;
    }
    public void acelerar(){
    if(estaEncendido)
        velocidad = velocidad + 10;
    }
    public void frenar(){
    if(estaEncendido){
    if(velocidad >=10)
        velocidad = velocidad -10;
        
        
        
    }
    
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
}
