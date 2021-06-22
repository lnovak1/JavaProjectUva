package AIA2.src.com.novak.veiculo;

import java.util.Scanner;

public class Carro extends Veiculo implements Desconto {
    private String placa;
    private Motor motor1 = new Motor();

    public Carro() {
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

    public void entrada() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a Marca do Carro: ");
        setMarca(scan.nextLine());
        System.out.print("Digite o Modelo do Carro: ");
        setModelo(scan.nextLine());
        System.out.print("Digite o Preco  do Carro: ");
        setPreco(Double.parseDouble(scan.nextLine()));
        System.out.print("Digite a Cor do Carro: ");
        setCor(scan.nextLine());
        System.out.print("Digite a largura do Carro: ");
        setLargura(Double.parseDouble(scan.nextLine()));
        System.out.print("Digite a comprimento do Carro: ");
        setComprimento(Double.parseDouble(scan.nextLine()));

        System.out.print("Digite a Placa do Carro: ");
        setPlaca(scan.nextLine());
        this.motor1.entrada();

        scan.close();
    }

    // imprimir dados
    public void imprimir() {

        System.out.println("Marca do Carro: " + getMarca());
        System.out.println("Modelo do Carro: " + getModelo());
        System.out.println("A cor é: " + getCor());
        System.out.println("Preço do Carro: " + getPreco());
        System.out.println("Largura do Carro: " + getLargura());
        System.out.println("Comprimento do Carro: " + getComprimento());

        System.out.println("Placa do Carro: " + getPlaca());
        this.motor1.imprimir();
    }

    //return value with 15% discount
    @Override
    public double getValorDesconto(double price) {

        return (price- (price*0.15));
    }

}
