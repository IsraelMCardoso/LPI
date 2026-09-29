package atividades.imagem1;

public class Roupa {

    private String tipo;
    private String tamanho;
    private double preco;

    public Roupa(String tipo, String tamanho, double preco) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void vestir() {
        System.out.println("A roupa do tipo " + tipo + " está sendo vestida.");
    }

    public void exibirPreco() {
        System.out.printf("Preço: R$ %.2f%n", preco);
    }

    public void alterarPreco(double novoPreco) {
        preco = novoPreco;
        System.out.printf("Novo preço: R$ %.2f%n", preco);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}