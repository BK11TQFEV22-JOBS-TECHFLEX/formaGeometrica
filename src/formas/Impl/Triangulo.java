package formas.Impl;

import formas.FormaGeometrica;

public class Triangulo implements FormaGeometrica {
    private int _base;
    private int _altura;	

    public Triangulo(int base, int altura) {
        this._base = base;
        this._altura = altura;
    }

    @Override
    public int getLados() {
        return 3;
    }

    @Override
    public double calcularArea() {
        return (_base * _altura) / 2;
    }

    @Override
    public String getNome() {
        return "Triangulo";
    }
    
}
