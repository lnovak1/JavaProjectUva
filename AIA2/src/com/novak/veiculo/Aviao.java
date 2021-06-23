package AIA2.src.com.novak.veiculo;


import java.util.InputMismatchException;
import java.util.Scanner;



public class Aviao extends Veiculo implements Desconto {
    String identificacao;
    Motor motor1 = new Motor();
    Motor motor2 = new Motor();
    Motor motor3 = new Motor();
    Motor motor4 = new Motor();

    public Aviao() {
    }

    public Aviao(String identificacao, Motor motor1, Motor motor2, Motor motor3, Motor motor4) {
        this.identificacao = identificacao;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
        this.motor4 = motor4;
    }

    public Aviao(String marca, String modelo, String cor, double preco, double largura, double comprimento, String identificacao, Motor motor1, Motor motor2, Motor motor3, Motor motor4) {
        super(marca, modelo, cor, preco, largura, comprimento);
        this.identificacao = identificacao;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
        this.motor4 = motor4;
    }

    public Aviao(String marca, String modelo, String identificacao, Motor motor1, Motor motor2, Motor motor3, Motor motor4) {
        super(marca, modelo);
        this.identificacao = identificacao;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
        this.motor4 = motor4;
    }

    public Aviao(String marca, String modelo, String cor, String identificacao, Motor motor1, Motor motor2, Motor motor3, Motor motor4) {
        super(marca, modelo, cor);
        this.identificacao = identificacao;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
        this.motor4 = motor4;
    }

    public Aviao(String marca, String modelo, String cor, double preco, String identificacao, Motor motor1, Motor motor2, Motor motor3, Motor motor4) {
        super(marca, modelo, cor, preco);
        this.identificacao = identificacao;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
        this.motor4 = motor4;
    }

    public Aviao(String marca, String modelo, String cor, double preco, double largura, String identificacao, Motor motor1, Motor motor2, Motor motor3, Motor motor4) {
        super(marca, modelo, cor, preco, largura);
        this.identificacao = identificacao;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
        this.motor4 = motor4;
    }

    public Aviao(double preco, double largura, String identificacao, Motor motor1, Motor motor2, Motor motor3, Motor motor4) {
        super(preco, largura);
        this.identificacao = identificacao;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
        this.motor4 = motor4;
    }

    public Aviao(double preco, double largura, double comprimento, String identificacao, Motor motor1, Motor motor2, Motor motor3, Motor motor4) {
        super(preco, largura, comprimento);
        this.identificacao = identificacao;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
        this.motor4 = motor4;
    }

    private String getIdentificacao() {
        return identificacao;
    }

    private void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public void entradaDados() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a Marca do avião: ");
        try{
            setMarca(scan.nextLine());
            if(marca.length()== 0){
                throw new IllegalArgumentException("Digite algo");
            }
        }catch(InputMismatchException | NullPointerException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite a Marca do avião: ");
            setMarca(scan.nextLine());
        } catch (IllegalArgumentException illegalArgumentException){
            System.out.println("digite uma entrada valida   ");
            System.out.print("Digite a Marca do avião: ");
            setMarca(scan.nextLine());

        }

        System.out.print("Digite o Modelo do avião: ");
        try{
            setModelo(scan.nextLine());
            if(modelo.length()== 0){
                throw new IllegalArgumentException("Digite algo");
            }
        }catch(InputMismatchException | NullPointerException | IllegalArgumentException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite o Modelo do avião: ");
            setModelo(scan.nextLine());
        }
        System.out.print("Digite o Preco  do avião: ");
        try{
            setPreco(Double.parseDouble(scan.nextLine()));
        }catch(InputMismatchException | NullPointerException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite o Preco  do avião: ");
            setPreco(Double.parseDouble(scan.nextLine()));
        }

        System.out.print("Digite a Cor do avião: ");
    try{
    setCor(scan.nextLine());
        if(cor.length()== 0){
            throw new IllegalArgumentException("Digite algo");
        }
    }catch(InputMismatchException | NullPointerException | IllegalArgumentException inputMismatchException){
        System.out.println("digite uma entrada valida");
        System.out.print("Digite a cor do avião: ");
        setCor(scan.nextLine());
    }

        System.out.print("Digite a largura do avião: ");
        try{
            setLargura(Double.parseDouble(scan.nextLine()));
        }catch(InputMismatchException | NullPointerException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite a largura do avião: ");
            setLargura(Double.parseDouble(scan.nextLine()));
        }


        System.out.print("Digite o comprimento do avião: ");
        try{
            setComprimento(Double.parseDouble(scan.nextLine()));
        }catch(InputMismatchException | NullPointerException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite o comprimento  do avião: ");
            setComprimento(Double.parseDouble(scan.nextLine()));
        }

        System.out.print("Digite a Identificação do avião: ");
        try{
            setIdentificacao(scan.nextLine());
            if(identificacao.length()== 0){
                throw new IllegalArgumentException("Digite algo");
            }
        }catch(InputMismatchException | NullPointerException | IllegalArgumentException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite a Identificação do avião: ");
            setIdentificacao(scan.nextLine());
        }

        System.out.println("dados do motor 1:");
        this.motor1.entradaDados();
        System.out.println("dados do motor 2:");
        this.motor2.entradaDados();
        System.out.println("dados do motor 3:");
        this.motor3.entradaDados();
        System.out.println("dados do motor 4:");
        this.motor4.entradaDados();


    }

    // imprimir dados
    public void imprimir() {

        System.out.println("Marca do avião: " + getMarca());
        System.out.println("Modelo do avião: " + getModelo());
        System.out.println("A cor é: " + getCor());
        System.out.println("Preço do avião: " + getPreco());
        System.out.println("Largura do avião: " + getLargura());
        System.out.println("Comprimento do avião: " + getComprimento());
        System.out.println("Identificação do avião: " + getIdentificacao());
        System.out.println("dados do motor 1:");
        this.motor1.imprimir();
        System.out.println("dados do motor 2:");
        this.motor2.imprimir();
        System.out.println("dados do motor 3:");
        this.motor3.imprimir();
        System.out.println("dados do motor 4:");
        this.motor4.imprimir();
        System.out.println("Preco com desconto" + getValorDesconto(getPreco()));
    }


    //return price with 8% discount
    @Override
    public double getValorDesconto(double price) {
        return (price- (price*0.08));
    }
}
