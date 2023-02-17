package test;
public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int registro){
        this.registro = registro;
    }

    void asignarTipo(String tipo){
        tipo = tipo.toUpperCase();
        if(tipo.equals("electrico") || tipo.equals("gasolina")){
            this.tipo = tipo;
        }

    }
}
