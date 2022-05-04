package formas.Impl;

public class CirculoColorido extends Circulo {

    private String _cor;

    public CirculoColorido(double raio, String cor) {
        super(raio);
        _cor = cor;
    }

    public String getCor() {
        return _cor;
    }

    @Override
    public String getNome() {
        return "CirculoColorido";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final CirculoColorido outroCirculo = (CirculoColorido) obj;
        if (Double.doubleToLongBits(getRaio()) != Double.doubleToLongBits(outroCirculo.getRaio())) {
            return false;
        }

        if (getCor() != outroCirculo.getCor()) {
            return false;
        }

        return true;
    }
}
