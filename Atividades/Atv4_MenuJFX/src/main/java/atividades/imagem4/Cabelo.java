package atividades.imagem4;

public class Cabelo {

    private String cor;
    private double comprimento;
    private String textura;

    public Cabelo(String cor, double comprimento, String textura) {
        this.cor = cor;
        this.comprimento = comprimento;
        this.textura = textura;
    }

    public void cortar() {
        if (comprimento > 0) {
            comprimento -= 2;

            if (comprimento < 0) {
                comprimento = 0;
            }
        }

        System.out.println(
            "Cabelo cortado. Comprimento atual: "
            + comprimento + " cm."
        );
    }

    public void pentear() {
        System.out.println("O cabelo está sendo penteado.");
    }

    public void lavar() {
        System.out.println("O cabelo foi lavado.");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }
}