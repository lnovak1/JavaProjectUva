import java.util.Scanner;

public class Lancha extends PequenoPorte {
  Boolean banheiro;

  // construtores

  public Lancha() {
  };

  public Lancha(int v, String c, int n, boolean b) {
    super(v, c, n);
    banheiro = b;
  }

  public Lancha(String m, String c, int n, boolean b) {
    super(m, c, n);
    banheiro = b;
  }

  public Lancha(String m, int n, float p, String c, boolean b) {
    super(m, n, p, c);
    banheiro = b;
  }

  // setters
  public void setBanheiro(Boolean b) {
    banheiro = b;
  }

  // getters

  public Boolean getBanheiro() {
    return banheiro;
  }

  public double getValorDesconto(float p) {
    return p - (p * 0.12);
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
    // while (resp != 's' || resp != 'S' || resp != 'n' || resp != 'N') {
    System.out.print("Sua Lancha tem Banheiro? S/N ");
    resp = scan.next().charAt(0);
    // }
    if (resp == 's' || resp == 'S') {
      setBanheiro(true);
    } else {
      setBanheiro(false);
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
    if (getBanheiro() == true) {
      System.out.println("Sua Lancha tem banheiro.");
    } else {
      System.out.println("Sua Lancha nao tem banheiro.");
    }
  }
}