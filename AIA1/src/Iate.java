import java.util.Scanner;

public class Iate extends VeiculoNautico {
  int numeroTripulantes;
  float peso;
  int numeroCabines;
  Boolean piscina;

  // contrutores
  public Iate() {
  }

  public Iate(String marca, String modelo, int trip, int cab) {
    super(marca, modelo);
    numeroTripulantes = trip;
    numeroCabines = cab;
  }

  public Iate(String id, String modelo, boolean p) {
    super(id, modelo);
    piscina = p;
  }

  public Iate(int n, boolean p, int trip, String marca) {
    super(n, marca);
    piscina = p;
    numeroTripulantes = trip;
  }

  public Iate(int v, int num_cabine, int n) {
    super(v, n);
    numeroCabines = num_cabine;
  }

  public Iate(String modelo, String marca, float preco, int num_cabine) {
    super(modelo, marca, preco);
    numeroCabines = num_cabine;
  }

  public Iate(String modelo, int v, int trip) {
    super(modelo, v);
    numeroTripulantes = trip;
  }

  public Iate(String marca, boolean p, int n) {
    super(marca, n);
    piscina = p;
  }

  public Iate(String modelo, int n, float preco, int num_cabine) {
    super(modelo, n, preco);
    numeroCabines = num_cabine;
  }

  public Iate(String modelo, int n, int v, boolean p, int trip) {
    super(modelo, n, v);
    piscina = p;
    numeroTripulantes = trip;
  }

  public Iate(boolean p, String modelo, int trip, String i) {
    super(modelo, i);
    piscina = p;
    numeroTripulantes = trip;
  }

  // setters
  public void setNumeroTripulantes(int num) {
    numeroTripulantes = num;
  }

  public void setPeso(float p) {
    peso = p;
  }

  public void setNumeroCabines(int cabs) {
    numeroCabines = cabs;
  }

  public void setPiscina(Boolean p) {
    piscina = p;
  }

  // getters
  public int getNumeroTripulantes() {
    return numeroTripulantes;
  }

  public float getPeso() {
    return peso;
  }

  public int getNumeroCabines() {
    return numeroCabines;
  }

  public boolean getPiscina() {
    return piscina;
  }

  public float getPessoasPorCabine() {
    return ((numeroTripulantes + numeroPassageiros) / numeroCabines);

  }

  public double getValorDesconto(float p) {
    return p - (p * 0.1);
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

    char resp;
    resp = 't';
    System.out.print("Digite a Quantidade de Tripulantes: ");
    setNumeroTripulantes(Integer.parseInt(scan.nextLine()));
    System.out.print("Digite a Quantidade de Cabines: ");
    setNumeroCabines(Integer.parseInt(scan.nextLine()));
    System.out.print("Digite o Peso: ");
    setPeso(Float.parseFloat(scan.nextLine()));
    System.out.print("Seu Iate tem piscina? S/N ");
    resp = scan.next().charAt(0);
    if (resp == 's' || resp == 'S') {
      setPiscina(true);
    } else {
      setPiscina(false);
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

    System.out.println("Valor com desconto é:" + getValorDesconto(getPreco()));
    System.out.println("Numero de pessoa por cabine é:" + getPessoasPorCabine());
    System.out.println("Número de Tripulantes: " + getNumeroTripulantes());
    System.out.println("Número de cabines:" + getNumeroCabines());
    System.out.println("O peso do veiculo é: " + getPeso());
    if (getPiscina() == true) {
      System.out.println("Seu Iate tem piscina.");
    } else {
      System.out.println("Seu Iate nao tem piscina.");
    }
  }
}