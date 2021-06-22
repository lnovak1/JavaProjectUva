package AIA1.src;

import java.util.Scanner;

public class Jetski extends PequenoPorte {
  Boolean reboque;

  // construtores

  public Jetski() {
  };

  public Jetski(int v, String c, int n, boolean r) {
    super(v, c, n);
    reboque = r;
  }

  public Jetski(String m, String c, int n, boolean r) {
    super(m, c, n);
    reboque = r;
  }

  public Jetski(String m, int n, float p, String c, boolean r) {
    super(m, n, p, c);
    reboque = r;
  }

  // setters
  public void setReboque(Boolean r) {
    reboque = r;
  }

  // getters

  public Boolean getReboque() {
    return reboque;
  }

  public double getValorDesconto(float p) {
    return p - (p * 0.15);
  }

  // entrada dados

  public void entrada() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite a Marca do Veiculo: ");
    setMarca(scan.nextLine());
    System.out.print("Digite o Modelo do Veiculo: ");
    setModelo(scan.nextLine());
    System.out.print("Digite a Cor do Veiculo: ");
    setCor(scan.nextLine());
    System.out.print("Digite o número de Passageiros: ");
    setNumeroPassageiros(Integer.parseInt(scan.nextLine()));
    System.out.print("Digite o preco do Veiculo: ");
    setPreco(Float.parseFloat(scan.nextLine()));
    System.out.print("Digite a velocidade Maxima: ");
    setVelocidadeMaxima(Integer.parseInt(scan.nextLine()));
    System.out.print("Digite a Identificação do Veiculo: ");
    setIdentificacao(scan.nextLine());
    System.out.print("Digite a altura do Calado: ");
    setAlturaCalado(Float.parseFloat(scan.nextLine()));

    System.out.print("Digite a Potencia do motor: ");
    setPotenciaMotor(Integer.parseInt(scan.nextLine()));
    System.out.print("Tipo do Casco: ");
    setTipoCasco(scan.nextLine());

    char resp;
    resp = 't';
    System.out.print("Seu Jetski tem reboque? S/N ");
    resp = scan.next().charAt(0);
    if (resp == 's' || resp == 'S') {
      setReboque(true);
    } else {
      setReboque(false);
    }

  }

  // imprimir dados
  public void imprimir() {

    System.out.println("Marca do Veiculo: " + getMarca());
    System.out.println("Modelo do Veiculo: " + getModelo());
    System.out.println("A cor é: " + getCor());
    System.out.println("Número de passageiros: " + getNumeroPassageiros());
    System.out.println("Preço do Veiculo: " + getPreco());
    System.out.println("Velocidade Máxima do Veiculo: " + getVelocidadeMaxima());
    System.out.println("Identificação : " + getIdentificacao());
    System.out.println("A altura calado: " + getAlturaCalado());

    System.out.println("A potencia do motor é:" + getPotenciaMotor());
    System.out.println("O tipo de casco é:" + getTipoCasco());

    System.out.println("Valor com desconto é:" + getValorDesconto(getPreco()));
    if (getReboque() == true) {
      System.out.println("Seu Jetski tem reboque.");
    } else {
      System.out.println("Seu Jetski nao tem reboque.");
    }
  }
}