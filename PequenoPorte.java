public class PequenoPorte extends VeiculoNautico {
  int potenciaMotor;
  String tipoCasco;

  // construtores

  public PequenoPorte() {
  };

  public PequenoPorte(int v, String c, int n) {
    super(v, n);
    tipoCasco = c;
  }

  public PequenoPorte(String m, String c, int n) {
    super(m, n);
    tipoCasco = c;
  }

  public PequenoPorte(String m, int n, float p, String c) {
    super(m, n, p);
    tipoCasco = c;
  }

  // setters
  public void setPotenciaMotor(int power) {
    potenciaMotor = power;
  }

  public void setTipoCasco(String type) {
    tipoCasco = type;
  }

  // getters

  public int getPotenciaMotor() {
    return potenciaMotor;
  }

  public String getTipoCasco() {
    return tipoCasco;
  }

}