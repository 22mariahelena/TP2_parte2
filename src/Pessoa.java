public class Pessoa {

    private double idade;
    private String nome;
    private double altura;
    private double peso;

    public Pessoa() {
    }

    public double getIdade() {
        return this.idade;
    }

    public void setIdade(double idade) {
        if (idade > 0.0) {
            this.idade = idade;
        }

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura > 0.0) {
            this.altura = altura;
        }

    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        if (peso > 0.0) {
            this.peso = peso;
        }

    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }
}
