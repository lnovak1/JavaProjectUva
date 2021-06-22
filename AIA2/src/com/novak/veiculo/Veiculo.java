package com.novak.veiculo;

class Veiculo {
    protected String marca;
    protected String modelo;
    protected String cor;
    protected double preco;
    protected double largura;
    protected double comprimento;

    protected Veiculo() {
    };

    private Veiculo(String marca, String modelo, String cor, double preco, double largura, double comprimento) {
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


    private Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    private Veiculo(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    private Veiculo(String marca, String modelo, String cor, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    private Veiculo(String marca, String modelo, String cor, double preco, double largura) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.largura = largura;
    }

    private Veiculo(double preco, double largura) {
        this.preco = preco;
        this.largura = largura;
    }

    private Veiculo(double preco, double largura, double comprimento) {
        this.preco = preco;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    // getters and setters
    private String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    private double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    private double getLargura() {
        return largura;
    }

    private void setLargura(double largura) {
        this.largura = largura;
    }

    private double getComprimento() {
        return comprimento;
    }

    private void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}


