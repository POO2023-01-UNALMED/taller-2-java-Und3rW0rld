package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){
        return this.asientos.length;
    }

    String verificarIntegridad(){
        boolean valido = this.registro == motor.registro;
        if (valido){
            for(Asiento asiento: this.asientos){
                if(asiento.registro != this.registro){
                    valido = false;
                    break;
                }
            }
        }
        return valido? "Auto original" : "Las piezas no son originales";
    }

}
