package AIA1.src;

public class VeiculoNautico {
  String marca;
  String modelo;
  String cor;
  int numeroPassageiros;
  float preco;
  int velocidadeMaxima;
  String identificacao;
  float alturaCalado;

  // contrutores

  public VeiculoNautico() {
  };

  public VeiculoNautico(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  public VeiculoNautico(String id, String m, float p) {
    identificacao = id;
    modelo = m;
    preco = p;
  }

  public VeiculoNautico(int v, String modelo_) {
    velocidadeMaxima = v;
    modelo = modelo_;
  }

  public VeiculoNautico(float p, int n) {
    preco = p;
    numeroPassageiros = n;
  }

  public VeiculoNautico(int v, String modelo, String marca, float p, int n) {
    velocidadeMaxima = v;
    this.marca = marca;
    this.modelo = modelo;
    preco = p;
    numeroPassageiros = n;
  }

  public VeiculoNautico(String m, int n) {
    marca = m;
    numeroPassageiros = n;
  }

  public VeiculoNautico(String m, int n, float p) {
    modelo = m;
    numeroPassageiros = n;
    preco = p;
  }

  public VeiculoNautico(int n, int v) {
    numeroPassageiros = n;
    velocidadeMaxima = v;
  }

  public VeiculoNautico(float p, String m, int vel, String id) {
    preco = p;
    modelo = m;
    velocidadeMaxima = vel;
    identificacao = id;
  }

  public VeiculoNautico(String c, float alt) {
    cor = c;
    alturaCalado = alt;
  }

  // setters
  public void setMarca(String m) {
    marca = m;
  }

  public void setModelo(String mod) {
    modelo = mod;
  }

  public void setCor(String c) {
    cor = c;
  }

  public void setNumeroPassageiros(int num) {
    numeroPassageiros = num;
  }

  public void setPreco(float p) {
    preco = p;
  }

  public void setVelocidadeMaxima(int vel) {
    velocidadeMaxima = vel;
  }

  public void setIdentificacao(String id) {
    identificacao = id;
  }

  public void setAlturaCalado(float alt) {
    alturaCalado = alt;
  }

  // getters

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public String getCor() {
    return cor;
  }

  public int getNumeroPassageiros() {
    return numeroPassageiros;
  }

  public float getPreco() {
    return preco;
  }

  public int getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  public String getIdentificacao() {
    return identificacao;
  }

  public float getAlturaCalado() {
    return alturaCalado;
  }
}