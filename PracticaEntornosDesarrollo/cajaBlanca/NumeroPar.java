package cajaBlanca;

public class NumeroPar {
    public String esPar(int num) {
        if (num % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }
}
