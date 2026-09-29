package atividades;

public class Atv1 {

    public static String verificarMultiplo(int n1, int n2) {

        if (n2 == 0) {
            return "Não é possível verificar múltiplo de zero.";
        }

        if (n1 % n2 == 0) {
            return n1 + " é múltiplo de " + n2;
        }

        return n1 + " não é múltiplo de " + n2;
    }
}