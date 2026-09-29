package atividades;

public class Atv7 {

    public static String calcularViagem(
            double diaria,
            double maxKm,
            double valorKm,
            double distancia,
            int dias) {

        double total = diaria * dias;

        if (distancia > maxKm) {
            double kmExcedido = distancia - maxKm;
            total += kmExcedido * valorKm;
        }

        return "Valor da diária: R$ " + diaria
                + "\nDias utilizados: " + dias
                + "\nDistância percorrida: " + distancia + " km"
                + "\n\nValor total da viagem: R$ " + total;
    }
}