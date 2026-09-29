package atividades;

public class Atv5 {

    public static String dividirCamelos(int camelos) {

        int camelosParaDivisao = camelos + 1;

        int irmao1 = camelosParaDivisao / 2;
        int irmao2 = camelosParaDivisao / 3;
        int irmao3 = camelosParaDivisao / 9;

        int totalDistribuido = irmao1 + irmao2 + irmao3;
        int sobra = camelosParaDivisao - totalDistribuido;

        return "Divisão:\n"
                + "Primeiro irmão: " + irmao1 + " camelos\n"
                + "Segundo irmão: " + irmao2 + " camelos\n"
                + "Terceiro irmão: " + irmao3 + " camelos\n\n"
                + "Total distribuído: " + totalDistribuido + "\n"
                + "Camelo que sobra: " + sobra;
    }
}