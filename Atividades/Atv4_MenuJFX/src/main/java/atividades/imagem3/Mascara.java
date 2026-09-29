package atividades.imagem3;

public class Mascara {

    private String material;
    private String cor;
    private double altura;

    public Mascara(String material, String cor, double altura) {
        this.material = material;
        this.cor = cor;
        this.altura = altura;
    }

    public void exibirMascara() {
        System.out.println("Máscara de " + material + ", cor " + cor + ".");
    }

    public void alterarCor(String novaCor) {
        cor = novaCor;
        System.out.println("Nova cor da máscara: " + cor);
    }

    public double calcularValor() {
        return altura * 10;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}