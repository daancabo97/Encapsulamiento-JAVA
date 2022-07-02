package dominio;

public class Carro {

    private double motor;
    private String marca;
    private String color;
    private float cilindros;

    public Carro(double motor, String marca, String color, float cilindros) {
        this.motor = motor;
        this.marca = marca;
        this.color = color;
        this.cilindros = cilindros;

    }

    // metodos get y set -> recuperar y modificar informacion
    public double getMotor() {
        return this.motor;

    }

    public void setMotor(double motor) {
        this.motor = motor;

    }

    public String getMarca() {
        return this.marca;

    }

    public void setMarca(String marca) {
        this.marca = marca;

    }

    public String getColor() {
        return this.color;

    }

    public void setColor(String color) {
        this.color = color;

    }

    public float getCilindros() {
        return this.cilindros;

    }

    public void setCilindros(float cilindros) {
        this.cilindros = cilindros;

    }

}
