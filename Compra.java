package br.com.alura.exercicios;

public class Compra implements Comparable<Compra>{
    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }

    private double valor;
    private String descricao;

    public Compra(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "O valor da compra: " + this.valor + " do produto: " + this.descricao + "\n";
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

}
