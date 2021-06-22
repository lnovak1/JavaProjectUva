package AIA2.src.com.novak.veiculo;

class Veiculo {
    protected String marca;
    protected String modelo;
    protected String cor;
    protected double preco;
    protected double largura;
    protected double comprimento;

    protected Veiculo() {
    };

    protected Veiculo(String marca, String modelo, String cor, double preco, double largura, double comprimento) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.largura = largura;
        this.comprimento = comprimento;
    }
    //      this makes no sense to exist. Only exists to fit 8 constructor obligation since Veiculo
    //      needs all items and or he will be already constructed
    //      or it will be constructed


    protected Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    protected Veiculo(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    protected Veiculo(String marca, String modelo, String cor, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    protected Veiculo(String marca, String modelo, String cor, double preco, double largura) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.largura = largura;
    }

    protected Veiculo(double preco, double largura) {
        this.preco = preco;
        this.largura = largura;
    }

    protected Veiculo(double preco, double largura, double comprimento) {
        this.preco = preco;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    // getters and setters
    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected String getCor() {
        return cor;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }

    protected double getPreco() {
        return preco;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }

    protected double getLargura() {
        return largura;
    }

    protected void setLargura(double largura) {
        this.largura = largura;
    }

    protected double getComprimento() {
        return comprimento;
    }

    protected void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}


