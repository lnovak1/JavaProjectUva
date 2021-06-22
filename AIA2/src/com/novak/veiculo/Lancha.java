package AIA2.src.com.novak.veiculo;

import java.util.Scanner;

public class Lancha extends Veiculo implements Desconto{
    private String nome;
    private Motor motor1 = new Motor();
    private Motor motor2 = new Motor();



    protected Lancha(String nome, Motor motor1, Motor motor2) {
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    protected Lancha(String marca, String modelo, String cor, double preco, double largura, double comprimento, String nome) {
        super(marca, modelo, cor, preco, largura, comprimento);
        this.nome = nome;
    }

    protected Lancha(String marca, String modelo, String nome) {
        super(marca, modelo);
        this.nome = nome;
    }

    protected Lancha(String marca, String modelo, String cor, String nome) {
        super(marca, modelo, cor);
        this.nome = nome;
    }

    protected Lancha(String marca, String modelo, String cor, double preco, String nome) {
        super(marca, modelo, cor, preco);
        this.nome = nome;
    }

    protected Lancha(String marca, String modelo, String cor, double preco, double largura, String nome) {
        super(marca, modelo, cor, preco, largura);
        this.nome = nome;
    }

    protected Lancha(double preco, double largura, String nome) {
        super(preco, largura);
        this.nome = nome;
    }

    protected Lancha(String marca, String modelo, String cor, double preco, double largura, double comprimento, String nome, Motor motor1) {
        super(marca, modelo, cor, preco, largura, comprimento);
        this.nome = nome;
        this.motor1 = motor1;
    }

    protected Lancha(String marca, String modelo, String nome, Motor motor1) {
        super(marca, modelo);
        this.nome = nome;
        this.motor1 = motor1;
    }

    protected Lancha(String marca, String modelo, String cor, String nome, Motor motor1) {
        super(marca, modelo, cor);
        this.nome = nome;
        this.motor1 = motor1;
    }

    protected Lancha(String marca, String modelo, String cor, double preco, String nome, Motor motor1) {
        super(marca, modelo, cor, preco);
        this.nome = nome;
        this.motor1 = motor1;
    }

    protected Lancha(String marca, String modelo, String cor, double preco, double largura, String nome, Motor motor1) {
        super(marca, modelo, cor, preco, largura);
        this.nome = nome;
        this.motor1 = motor1;
    }

    protected Lancha(double preco, double largura, String nome, Motor motor1) {
        super(preco, largura);
        this.nome = nome;
        this.motor1 = motor1;
    }

    protected Lancha(String marca, String modelo, String cor, double preco, double largura, double comprimento, String nome, Motor motor1, Motor motor2) {
        super(marca, modelo, cor, preco, largura, comprimento);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    protected Lancha(String marca, String modelo, String nome, Motor motor1, Motor motor2) {
        super(marca, modelo);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    protected Lancha(String marca, String modelo, String cor, String nome, Motor motor1, Motor motor2) {
        super(marca, modelo, cor);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    protected Lancha(String marca, String modelo, String cor, double preco, String nome, Motor motor1, Motor motor2) {
        super(marca, modelo, cor, preco);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    protected Lancha(String marca, String modelo, String cor, double preco, double largura, String nome, Motor motor1, Motor motor2) {
        super(marca, modelo, cor, preco, largura);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    protected Lancha(double preco, double largura, String nome, Motor motor1, Motor motor2) {
        super(preco, largura);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    protected Lancha(double preco, double largura, double comprimento, String nome, Motor motor1, Motor motor2) {
        super(preco, largura, comprimento);
        this.nome = nome;
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    protected Lancha(Motor motor1) {
        this.motor1 = motor1;
    }

    protected Lancha(String nome) {
        this.nome = nome;
    }

    protected Lancha(Motor motor1, Motor motor2) {
        this.motor1 = motor1;
        this.motor2 = motor2;
    }

    protected Lancha(String nome, Motor motor1) {
        this.nome = nome;
        this.motor1 = motor1;
    }


    //    getters and setter
    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    protected Lancha() {
    }

    protected void entrada() {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o Nome da lancha: ");
        setNome(ler.nextLine());
        System.out.print("Digite a Marca da lancha: ");
        setMarca(ler.nextLine());
        System.out.print("Digite o Modelo da lancha: ");
        setModelo(ler.nextLine());
        System.out.print("Digite o Preco  da lancha: ");
        setPreco(Double.parseDouble(ler.nextLine()));
        System.out.print("Digite a Cor da lancha: ");
        setCor(ler.nextLine());
        System.out.print("Digite a largura da lancha: ");
        setLargura(Double.parseDouble(ler.nextLine()));
        System.out.print("Digite a comprimento da lancha: ");
        setComprimento(Double.parseDouble(ler.nextLine()));

        this.motor1.entrada();
        this.motor2.entrada();

    }

    // imprimir dados
    protected void imprimir() {

        System.out.println("Nome da lancha: " + getNome());
        System.out.println("Marca da lancha: " + getMarca());
        System.out.println("Modelo da lancha: " + getModelo());
        System.out.println("A cor é: " + getCor());
        System.out.println("Preço da lancha: " + getPreco());
        System.out.println("Largura da lancha: " + getLargura());
        System.out.println("Comprimento da lancha: " + getComprimento());
        this.motor1.imprimir();
        this.motor2.imprimir();
    }

    //return value with 10% discount
    @Override
    public double getValorDesconto(double price) {

        return (price- (price*0.1));
    }


}
