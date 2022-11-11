package main;

public class Conversor {

    public double tempConversor(double temperatura, String unidadeInicial, String unidadeFinal) {
        if (unidadeInicial.equals("C") & unidadeFinal.equals("F")) {
            return ((temperatura * (9.0 / 5.0)) + 32);
        }
        else if (unidadeInicial.equals("C") & unidadeFinal.equals("K")) {
            return ((temperatura + 273.15));
        }
        else if (unidadeInicial.equals("F") & unidadeFinal.equals("C")) {
            return ((temperatura - 32) * (9.0 / 5.0));
        }
        else if (unidadeInicial.equals("F") & unidadeFinal.equals("K")) {
            return (((temperatura - 32) * (5.0 / 9.0)) + 273.15);
        }
        else if (unidadeInicial.equals("K") & unidadeFinal.equals("C")) {
            return (temperatura - 273.15);
        }
        else {
            return (((temperatura - 273.15) * (9.0 / 5.0)) + 32);
        }
    }
}
