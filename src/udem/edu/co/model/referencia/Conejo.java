package udem.edu.co.model.referencia;

public class Conejo {
    private int patas;
    private String raza;
    private String comida;

    public Conejo(int patas, String raza, String comida) {
        this.patas = patas;
        this.raza = raza;
        this.comida = comida;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
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
