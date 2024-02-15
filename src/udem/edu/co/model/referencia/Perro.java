package udem.edu.co.model.referencia;

public class Perro {

    private int patas;
    private String color;
    private String sonido;
    private String tamaño;
    private String raza;
    private String comida;

    public Perro(int patas, String color, String sonido, String tamaño, String raza, String comida) {
        this.patas = patas;
        this.color = color;
        this.sonido = sonido;
        this.tamaño = tamaño;
        this.raza = raza;
        this.comida = comida;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
}
