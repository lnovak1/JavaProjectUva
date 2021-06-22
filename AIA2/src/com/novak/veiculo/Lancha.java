package com.novak.veiculo;


public class Lancha extends Veiculo implements Desconto{
    String nome;
    Motor motor1 = new Motor();
    Motor motor2 = new Motor();



    public Lancha(String nome, Motor motor1, Motor motor2) {
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public Lancha(String marca, String modelo, String cor, double preco, double largura, double comprimento, String nome) {
        super(marca, modelo, cor, preco, largura, comprimento);
        this.nome = nome;
    }

    public Lancha(String marca, String modelo, String nome) {
        super(marca, modelo);
        this.nome = nome;
    }

    public Lancha(String marca, String modelo, String cor, String nome) {
        super(marca, modelo, cor);
        this.nome = nome;
    }

    public Lancha(String marca, String modelo, String cor, double preco, String nome) {
        super(marca, modelo, cor, preco);
        this.nome = nome;
    }

    public Lancha(String marca, String modelo, String cor, double preco, double largura, String nome) {
        super(marca, modelo, cor, preco, largura);
        this.nome = nome;
    }

    public Lancha(double preco, double largura, String nome) {
        super(preco, largura);
        this.nome = nome;
    }

    public Lancha(String marca, String modelo, String cor, double preco, double largura, double comprimento, String nome, Motor motor1) {
        super(marca, modelo, cor, preco, largura, comprimento);
        this.nome = nome;
        this.motor1 = motor1;
    }

    public Lancha(String marca, String modelo, String nome, Motor motor1) {
        super(marca, modelo);
        this.nome = nome;
        this.motor1 = motor1;
    }

    public Lancha(String marca, String modelo, String cor, String nome, Motor motor1) {
        super(marca, modelo, cor);
        this.nome = nome;
        this.motor1 = motor1;
    }

    public Lancha(String marca, String modelo, String cor, double preco, String nome, Motor motor1) {
        super(marca, modelo, cor, preco);
        this.nome = nome;
        this.motor1 = motor1;
    }

    public Lancha(String marca, String modelo, String cor, double preco, double largura, String nome, Motor motor1) {
        super(marca, modelo, cor, preco, largura);
        this.nome = nome;
        this.motor1 = motor1;
    }

    public Lancha(double preco, double largura, String nome, Motor motor1) {
        super(preco, largura);
        this.nome = nome;
        this.motor1 = motor1;
    }

    public Lancha(String marca, String modelo, String cor, double preco, double largura, double comprimento, String nome, Motor motor1, Motor motor2) {
        super(marca, modelo, cor, preco, largura, comprimento);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public Lancha(String marca, String modelo, String nome, Motor motor1, Motor motor2) {
        super(marca, modelo);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public Lancha(String marca, String modelo, String cor, String nome, Motor motor1, Motor motor2) {
        super(marca, modelo, cor);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public Lancha(String marca, String modelo, String cor, double preco, String nome, Motor motor1, Motor motor2) {
        super(marca, modelo, cor, preco);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public Lancha(String marca, String modelo, String cor, double preco, double largura, String nome, Motor motor1, Motor motor2) {
        super(marca, modelo, cor, preco, largura);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public Lancha(double preco, double largura, String nome, Motor motor1, Motor motor2) {
        super(preco, largura);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public Lancha(double preco, double largura, double comprimento, String nome, Motor motor1, Motor motor2) {
        super(preco, largura, comprimento);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public Lancha(Motor motor1) {
        this.motor1 = motor1;
    }

    public Lancha(String nome) {
        this.nome = nome;
    }

    public Lancha(Motor motor1, Motor motor2) {
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    public Lancha(String nome, Motor motor1) {
        this.nome = nome;
        this.motor1 = motor1;
    }


    //    getters and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Motor getMotor1() {
        return motor1;
    }

    public void setMotor1(Motor motor1) {
        this.motor1 = motor1;
    }

    public Motor getMotor2() {
        return motor2;
    }

    public void setMotor2(Motor motor2) {
        this.motor2 = motor2;
    }

    public Lancha() {
    }

    //return value with 10% discount
    @Override
    public double getValorDesconto(double price) {

        return (price- (price*0.1));
    }


}
