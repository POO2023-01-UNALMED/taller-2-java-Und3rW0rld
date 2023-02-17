package test;
public class Asiento {
    String color;
    int precio;
    int registro;


    void cambiarColor(String color){
        color = color.toLowerCase();
        if(color.equals("blanco") || color.equals("amarillo") || color.equals("rojo") || color.equals("verde") || color.equals("negro")){
            this.color = color;
        }
    }
}
