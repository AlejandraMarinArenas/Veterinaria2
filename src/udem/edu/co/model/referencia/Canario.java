package udem.edu.co.model.referencia;

public class Canario {
    private int alas;
    private int patas;
    private String sonido;
    private String comida;

    public Canario(int alas, int patas, String sonido, String comida) {
        this.alas = alas;
        this.patas = patas;
        this.sonido = sonido;
        this.comida = comida;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

}
