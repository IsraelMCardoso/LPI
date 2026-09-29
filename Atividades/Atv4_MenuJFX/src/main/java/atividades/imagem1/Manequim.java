package atividades.imagem1;

public class Manequim {

    private double altura;
    private String material;
    private String roupaExposta;

    public Manequim(double altura, String material, String roupaExposta) {
        this.altura = altura;
        this.material = material;
        this.roupaExposta = roupaExposta;
    }

    public void vestirRoupa() {
        System.out.println("O manequim está usando: " + roupaExposta);
    }

    public void trocarRoupa(String novaRoupa) {
        roupaExposta = novaRoupa;
        System.out.println("Nova roupa exposta: " + roupaExposta);
    }

    public void exibirRoupa() {
        System.out.println("Roupa exposta: " + roupaExposta);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRoupaExposta() {
        return roupaExposta;
    }

    public void setRoupaExposta(String roupaExposta) {
        this.roupaExposta = roupaExposta;
    }
}