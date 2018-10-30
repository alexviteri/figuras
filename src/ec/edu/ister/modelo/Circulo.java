package ec.edu.ister.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Circulo {
    int radio;
    Punto p;

    public Circulo() {
    }

    public Circulo(int radio, Punto p) {
        this.radio = radio;
        this.p = p;
    }

    public void setP(Punto p) {
        this.p = p;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getP() {
        return p;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "El punto del círculo es:"+p.toString()+
                "\nRadio: "+getRadio();
    }
    

    
}
