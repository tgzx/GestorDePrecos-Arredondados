public class Produto{
    String mercadoria;
    float preco;

    public Produto(String mercadoria, float preco) {
        this.setMercadoria(mercadoria);
        this.setPreco(preco);
    }

    public void status(){
        System.out.println(this.getMercadoria() + " " + this.getPreco());
    }

    public String getMercadoria() {
        return this.mercadoria;
    }

    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setPorcentagem(float porcentagem, String arredondaMaisMenos, float casaDecimal) {
        this.preco = GestaoDePreco.GestorDePrecos(porcentagem, arredondaMaisMenos, this.preco, casaDecimal);
    }
}
