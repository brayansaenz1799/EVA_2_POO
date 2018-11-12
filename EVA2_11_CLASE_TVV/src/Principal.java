/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carolina Amaya Muela 18550324
 */
public class Principal {
private boolean Encendido;
private int subirVol;
private int canal;

    public Principal(boolean Encendido, int subirVol, int canal) {
        this.Encendido = Encendido;
        this.subirVol = subirVol;
        this.canal = canal;
    }


public void prender(){
Encendido = true;
}
public void apagar(){
Encendido = false;
}
public void SubirVol(){
if (subirVol<=100)
    subirVol = subirVol +1;

}
public void volumen(){
if (subirVol>=1)
    if (subirVol>=10)
        subirVol = subirVol -1;

}
public void masuncanal(){
if(canal<999){
    canal = canal +1;
}
}
public void menosuncanal(){
if(canal>=1){
canal = canal +1;
}
}
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
