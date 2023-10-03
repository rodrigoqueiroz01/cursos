package streams.reduce.media;

public class Media {

    private double total;
    private int quantidade;

    public Media adicionar(double valor) {
        total += valor;
        quantidade++;
        return this;
    }

    public double getValor() {
        return total / quantidade;
    }

    public static Media combinar(Media m1, Media m2) {
        var resultante = new Media();
        resultante.total = m1.total + m2.total;
        resultante.quantidade = m1.quantidade + m2.quantidade;
        return resultante;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
