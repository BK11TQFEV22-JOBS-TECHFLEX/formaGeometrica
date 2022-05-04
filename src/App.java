import formas.FormaGeometrica;
import formas.Impl.Circulo;
import formas.Impl.CirculoColorido;
import formas.Impl.CirculoColoridoAnimado;
import formas.Impl.Losango;
import formas.Impl.Quadrado;
import formas.Impl.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(10);
        System.out.println(circulo.getLados());
        System.out.println(circulo.calcularArea());
        imprimirMensagem(circulo);

        Quadrado quadrado = new Quadrado(10);
        imprimirMensagem(quadrado);

        Triangulo triangulo = new Triangulo(10, 5);
        imprimirMensagem(triangulo);

        Losango losango = new Losango(10, 5);
        imprimirMensagem(losango);

        CirculoColorido circuloColorido = new CirculoColorido(1.5, "vermelho");
        imprimirMensagem(circuloColorido);

        CirculoColorido circuloColorido2 = new CirculoColorido(1.5, "vermelho");
        imprimirMensagem(circuloColorido2);

        System.out.println(circuloColorido.equals(circuloColorido2));

        CirculoColoridoAnimado circuloColoridoAnimado = new CirculoColoridoAnimado(1.5, "vermelho");
        circuloColoridoAnimado.mover(10, -5);
        imprimirMensagem(circuloColoridoAnimado);

        Circulo circuloColoridoAnimado2 = new CirculoColoridoAnimado(1.5, "vermelho");
        //circuloColoridoAnimado2.mover(-50, 256);
        imprimirMensagem(circuloColoridoAnimado2);

        System.out.println(circuloColoridoAnimado.equals(circuloColoridoAnimado2));
    }

    private static void imprimirMensagem(FormaGeometrica formaGeometrica) {
        double area = formaGeometrica.calcularArea();
        if (area < 15) {
            System.out.printf("A forma do %s é muito pequena. Área: %s\n", formaGeometrica.getNome(), area);
        } else if (area < 30) {
            System.out.printf("A forma do %s é pequena. Área: %s\n", formaGeometrica.getNome(), area);
        } else if (area < 50) {
            System.out.printf("A forma do %s é média. Área: %s\n", formaGeometrica.getNome(), area);
        } else if (area < 100) {
            System.out.printf("A forma do %s é grande. Área: %s\n", formaGeometrica.getNome(), area);
        } else {
            System.out.printf("A forma do %s é  muito grande. Área: %s\n", formaGeometrica.getNome(), area);
        }       
    }
}
