package formas.Impl;

import formas.FormaGeometrica;

public class Losango implements FormaGeometrica {

    private double _diagonal1;
    private double _diagonal2;

    public Losango(double diagonal1, double diagonal2) {
        _diagonal1 = diagonal1;
        _diagonal2 = diagonal2;
    }

    @Override
    public int getLados() {
        return 4;
    }

    @Override
    public double calcularArea() {
        return (_diagonal1 * _diagonal2) / 2;
    }

    @Override
    public String getNome() {
        return "Losango";
    }
    
}
