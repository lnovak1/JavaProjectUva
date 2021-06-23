package AIA2.src.com.novak.veiculo;

import java.util.InputMismatchException;
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

    public void entradaDados() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a Marca do Carro: ");
        try{
            setMarca(scan.nextLine());
            if(marca.length()== 0){
                throw new IllegalArgumentException("Digite algo");
            }
        }catch(InputMismatchException | NullPointerException | IllegalArgumentException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite a Marca do Carro: ");
            setMarca(scan.nextLine());
        }

        System.out.print("Digite o Modelo do Carro: ");
        try{
            setModelo(scan.nextLine());
            if(modelo.length()== 0){
                throw new IllegalArgumentException("Digite algo");
            }
        }catch(InputMismatchException | NullPointerException | IllegalArgumentException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite o Modelo do Carro: ");
            setModelo(scan.nextLine());
        }

        System.out.print("Digite o Preco  do Carro: ");
        try{
            setPreco(Double.parseDouble(scan.nextLine()));
        }catch(InputMismatchException | NullPointerException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite o Preco  do Carro: ");
            setPreco(Double.parseDouble(scan.nextLine()));
        }

        System.out.print("Digite a Cor do Carro: ");
        try{
            setCor(scan.nextLine());
            if(cor.length()== 0){
                throw new IllegalArgumentException("Digite algo");
            }
        }catch(InputMismatchException | NullPointerException | IllegalArgumentException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite a Cor do Carro: ");
            setCor(scan.nextLine());
        }

        System.out.print("Digite a largura do Carro: ");
        try{
            setLargura(Double.parseDouble(scan.nextLine()));
        }catch(InputMismatchException | NullPointerException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite a largura do Carro: ");
            setLargura(Double.parseDouble(scan.nextLine()));
        }

        System.out.print("Digite o comprimento do Carro: ");
        try{
            setComprimento(Double.parseDouble(scan.nextLine()));
        }catch(InputMismatchException | NullPointerException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite o comprimento do Carro: ");
            setComprimento(Double.parseDouble(scan.nextLine()));
        }

        System.out.print("Digite a Placa do Carro: ");
        try{
            setPlaca(scan.nextLine());
            if(placa.length()== 0){
                throw new IllegalArgumentException("Digite algo");
            }
        }catch(InputMismatchException | NullPointerException | IllegalArgumentException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite a Placa do Carro: ");
            setPlaca(scan.nextLine());
        }

        System.out.println("dados do motor 1:");
        this.motor1.entradaDados();

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
        System.out.println("Preco com desconto" + getValorDesconto(getPreco()));
    }

    //return value with 15% discount
    @Override
    public double getValorDesconto(double price) {

        return (price- (price*0.15));
    }

}
