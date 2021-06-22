package AIA2.src.com.novak.veiculo;

import java.util.Scanner;

public class Carro extends Veiculo {
    private String placa;
    private Motor motor1 = new Motor();

    protected Carro() {
    }

    protected Carro(String placa, String marca, String modelo, String cor, double preco, double largura) {
        super(marca, modelo, cor, preco, largura);
        this.placa = placa;
    }

    protected Carro(Motor motor1, String marca, String modelo, String cor) {
        super(marca, modelo, cor);
        this.motor1 = motor1;
    }

    protected Carro(String placa, Motor motor1, String marca, String modelo) {
        super(marca, modelo);
        this.placa = placa;
        this.motor1 = motor1;
    }

    protected Carro(String placa, Motor motor1, double preco, double largura) {
        super(preco, largura);
        this.placa = placa;
        this.motor1 = motor1;
    }

    private String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    protected void entrada() {

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a Marca do Carro: ");
        setMarca(ler.nextLine());
        System.out.print("Digite o Modelo do Carro: ");
        setModelo(ler.nextLine());
        System.out.print("Digite o Preco  do Carro: ");
        setPreco(Double.parseDouble(ler.nextLine()));
        System.out.print("Digite a Cor do Carro: ");
        setCor(ler.nextLine());
        System.out.print("Digite a largura do Carro: ");
        setLargura(Double.parseDouble(ler.nextLine()));
        System.out.print("Digite a comprimento do Carro: ");
        setComprimento(Double.parseDouble(ler.nextLine()));

        System.out.print("Digite a Placa do Carro: ");
        setPlaca(ler.nextLine());
        this.motor1.entrada();

    }

    // imprimir dados
    protected void imprimir() {

        System.out.println("Marca do Veiculo: " + getMarca());
        System.out.println("Modelo do Veiculo: " + getModelo());
        System.out.println("A cor é: " + getCor());
        System.out.println("Preço do Veiculo: " + getPreco());
        System.out.println("Largura do Veiculo: " + getLargura());
        System.out.println("Comprimento do Veiculo: " + getComprimento());

        System.out.println("Placa do Veiculo: " + getPlaca());
        this.motor1.imprimir();
    }

}
