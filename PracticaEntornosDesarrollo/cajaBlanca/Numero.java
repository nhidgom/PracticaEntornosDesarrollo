package cajaBlanca;

public class Numero {
    public String evaluarNumero(int num) {
        if (num > 0) {
            return "Positivo";
        } else if (num < 0) {
            return "Negativo";
        } else {
            return "Cero";
        }
    }

}

