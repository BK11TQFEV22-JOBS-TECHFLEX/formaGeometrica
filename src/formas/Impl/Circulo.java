package formas.Impl;

import formas.FormaGeometrica;

public class Circulo implements FormaGeometrica{
    private double _raio;

    protected double getRaio() {
        return _raio;
    }

    public Circulo(double raio) {
        _raio = raio;
    }

    @Override
    public int getLados() {
        return 0;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(_raio, 2);
    }

    @Override
    public String getNome() {
        return "Circulo";
    }    
}
