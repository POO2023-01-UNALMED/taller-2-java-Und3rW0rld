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
        int cont = 0;
        for(Asiento a : this.asientos){
            if(a!= null){
                cont++;
            }
        }
        return cont;
    }

    String verificarIntegridad(){
        boolean valido = this.registro == motor.registro;
        if (valido){
            for(Asiento asiento: this.asientos){
                if (asiento != null){
                if(asiento.registro != this.registro){
                    valido = false;
                    break;
                }
                }
            }
        }
        return valido? "Auto original" : "Las piezas no son originales";
    }

}
