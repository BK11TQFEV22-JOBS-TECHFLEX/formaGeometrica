package formas.Impl;

public class CirculoColoridoAnimado extends CirculoColorido {
    public CirculoColoridoAnimado(double raio, String cor) {
        super(raio, cor);
    }     

    public void mover(int x, int y) {
        this.setX(x);
        this.setY(y);
        System.out.println();
    }

    @Override
    public String getNome() {
        return "CirculoColoridoAnimado";
    }

    private void setY(int y) {
        System.out.printf(" e moveu Y para: %d", y);
    }

    private void setX(int x) {
        System.out.printf("Moveu X para: %d", x);
    }
}
