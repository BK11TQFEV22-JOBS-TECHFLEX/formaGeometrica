package formas.Impl;

import formas.FormaGeometrica;

public class Quadrado implements FormaGeometrica {
    private int _base;

    public Quadrado(int base) {
        this._base = base;
    }

    @Override
    public int getLados() {
        return 4;
    }

    @Override
    public double calcularArea() {
        return _base * _base;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }    
}
