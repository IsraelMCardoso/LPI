package atividades.imagem3;

public class Expositor {

    private String material;
    private double altura;
    private int quantidadeMascaras;

    public Expositor(String material, double altura, int quantidadeMascaras) {
        this.material = material;
        this.altura = altura;
        this.quantidadeMascaras = quantidadeMascaras;
    }

    public void adicionarMascara() {
        quantidadeMascaras++;
        System.out.println(
            "Máscara adicionada ao expositor. Quantidade: "
            + quantidadeMascaras
        );
    }

    public void removerMascara() {
        if (quantidadeMascaras > 0) {
            quantidadeMascaras--;
        }

        System.out.println(
            "Máscara removida do expositor. Quantidade: "
            + quantidadeMascaras
        );
    }

    public void mostrarMascaras() {
        System.out.println(
            "O expositor possui " + quantidadeMascaras + " máscaras."
        );
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getQuantidadeMascaras() {
        return quantidadeMascaras;
    }

    public void setQuantidadeMascaras(int quantidadeMascaras) {
        this.quantidadeMascaras = quantidadeMascaras;
    }
}