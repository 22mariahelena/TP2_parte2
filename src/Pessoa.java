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

    public String classificarIMC() {
        double imc = this.calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else if (imc < 35.0) {
            return "Obsidade grau 1";
        } else {
            return imc < 40.0 ? "Obsidade grau 2" : "Obsidade grau 3";
        }
    }

    public String toString() {
        String var10000 = this.nome;
        return "Nome: " + var10000 + "\nPeso: " + this.peso + "\nAltura: " + this.altura + "\nIdade: " + this.idade + "\nIMC: " + this.calcularIMC() + "\nClassificação: " + this.classificarIMC();
    }
}
