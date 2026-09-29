package atividades;

public class Atv4 {

    public static String analisarTemperaturas(double[] temperaturas) {

        int frio = 0;
        int calor = 0;

        for (double temperatura : temperaturas) {

            if (temperatura < 18.0) {
                frio++;
            } else {
                calor++;
            }
        }

        String resultado;

        if (frio > calor) {
            resultado = "A temperatura em SJC é fria.";
        } else {
            resultado = "A temperatura em SJC é agradável.";
        }

        return "Dias frios: " + frio
                + "\nDias agradáveis: " + calor
                + "\n\n" + resultado;
    }
}