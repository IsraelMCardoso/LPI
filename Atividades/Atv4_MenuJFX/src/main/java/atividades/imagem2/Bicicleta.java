package atividades.imagem2;

public class Bicicleta {

    private String marca;
    private String modelo;
    private int marchaAtual;

    public Bicicleta(String marca, String modelo, int marchaAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.marchaAtual = marchaAtual;
    }

    public void pedalar() {
        System.out.println("A bicicleta " + modelo + " está em movimento.");
    }

    public void trocarMarcha(int novaMarcha) {
        marchaAtual = novaMarcha;
        System.out.println("Marcha atual: " + marchaAtual);
    }

    public void frear() {
        System.out.println("A bicicleta " + modelo + " está freando.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }
}