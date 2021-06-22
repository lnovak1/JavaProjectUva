package AIA2.src.com.novak.veiculo;

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

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Motor getMotor1() {
        return motor1;
    }

    public void setMotor1(Motor motor1) {
        this.motor1 = motor1;
    }

    public Motor getMotor2() {
        return motor2;
    }

    public void setMotor2(Motor motor2) {
        this.motor2 = motor2;
    }

    public Motor getMotor3() {
        return motor3;
    }

    public void setMotor3(Motor motor3) {
        this.motor3 = motor3;
    }

    public Motor getMotor4() {
        return motor4;
    }

    public void setMotor4(Motor motor4) {
        this.motor4 = motor4;
    }

    //return price with 8% discount
    @Override
    public double getValorDesconto(double price) {
        return (price- (price*0.08));
    }
}
