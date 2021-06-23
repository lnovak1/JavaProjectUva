package AIA2.src.com.novak.veiculo;

import java.util.InputMismatchException;
import java.util.Scanner;



class Motor{
    protected double peso;
    protected int rpm;
    protected int velocidade;
    protected String tipo;
    protected double preco;

    protected Motor() {
    }

    protected Motor(double peso, int rpm, int velocidade, String tipo, double preco) {
        this.peso = peso;
        this.rpm = rpm;
        this.velocidade = velocidade;
        this.tipo = tipo;
        this.preco = preco;
    }

    // this makes no sense to exist. Only exist to fit 5 constructor obligation
    // since motor
    // needs all items and or it will be already constructed
    // or it will be constructed
    private Motor(double peso) {
        this.peso = peso;
    }

    private Motor(int rpm) {
        this.rpm = rpm;
    }

    private Motor(String tipo) {
        this.tipo = tipo;
    }

    // getters and setters

    public double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRpm() {
        return rpm;
    }

    private void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getVelocidade() {
        return velocidade;
    }

    private void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    protected void entradaDados() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a peso do motor: ");
        try{
            setPeso(Double.parseDouble(scan.nextLine()));
        }catch(InputMismatchException | NullPointerException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite a peso do motor: ");
            setPeso(Double.parseDouble(scan.nextLine()));
        }

        System.out.print("Digite o Rpm do motor: ");
        try{
            setRpm(Integer.parseInt(scan.nextLine()));
        }catch(InputMismatchException | NullPointerException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite o Rpm do motor: ");
            setRpm(Integer.parseInt(scan.nextLine()));
        }

        System.out.print("Digite o Preço  do motor: ");
        try{
            setPreco(Double.parseDouble(scan.nextLine()));
        }catch(InputMismatchException | NullPointerException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite o Preço  do motor: ");
            setPreco(Double.parseDouble(scan.nextLine()));
        }

        System.out.print("Digite a velocidade do motor: ");
        try{
            setVelocidade(Integer.parseInt(scan.nextLine()));
        }catch(InputMismatchException | NullPointerException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite a velocidade do motor: ");
            setVelocidade(Integer.parseInt(scan.nextLine()));
        }


        System.out.print("Digite a tipo do motor: ");
        try{
            setTipo(scan.nextLine());
            if(tipo.length()== 0){
                throw new IllegalArgumentException("Digite algo");
            }
        }catch(InputMismatchException | NullPointerException | IllegalArgumentException inputMismatchException){
            System.out.println("digite uma entrada valida");
            System.out.print("Digite a tipo do motor: ");
            setTipo(scan.nextLine());
        }


    }

    // imprimir dados
    public void imprimir() {

        System.out.println("Peso do Motor: " + getPeso());
        System.out.println("Rpm do Motor: " + getRpm());
        System.out.println("Preço do Motor: " + getPreco());
        System.out.println("Velocidade do motor: " + getVelocidade());
        System.out.println("Tipo do Motor: " + getTipo());
    }
}
