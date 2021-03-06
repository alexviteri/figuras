package com.nviteri.modelo;


public class Punto {
    private int coordX;
    private int coordY;

    public Punto() {
    }

    public Punto(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    /**
     * @return the coordX
     */
    public int getCoordX() {
        return coordX;
    }

    /**
     * @param coordX the coordX to set
     */
    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    /**
     * @return the coordY
     */
    public int getCoordY() {
        return coordY;
    }

    /**
     * @param coordY the coordY to set
     */
    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    @Override
    public String toString() {
        return "P ("+getCoordX()+","+getCoordY()+")";
    }
    

}
