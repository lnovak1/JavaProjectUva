package com.novak.veiculo;

class Motor {
    protected double peso;
    protected int rpm;
    protected int velocidade;
    protected String tipo;
    protected double preco;

    protected Motor() {
    };

    protected Motor(double peso, int rpm, int velocidade, String tipo, double preco) {
        this.peso = peso;
        this.rpm = rpm;
        this.velocidade = velocidade;
        this.tipo = tipo;
        this.preco = preco;
    }


//      this makes no sense to exist. Only exist to fit 5 constructor obligation since motor
//      needs all items and or it will be already constructed
//      or it will be constructed
    protected Motor(double peso) {
        this.peso = peso;
    }

    protected Motor(int rpm) {
        this.rpm = rpm;
    }

    protected Motor(String tipo) {
        this.tipo = tipo;
    }

//    getters and setters

    protected double getPeso() {
        return peso;
    }

    protected void setPeso(double peso) {
        this.peso = peso;
    }

    protected int getRpm() {
        return rpm;
    }

    protected void setRpm(int rpm) {
        this.rpm = rpm;
    }

    protected int getVelocidade() {
        return velocidade;
    }

    protected void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    protected String getTipo() {
        return tipo;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected double getPreco() {
        return preco;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }
}
