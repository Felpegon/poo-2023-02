
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(4.0, 6.0);
        Triangulo triangulo = new Triangulo(3.0, 4.0);

        FormaGeometrica[] formas = {circulo, retangulo, triangulo};
        double areaTotal = CalculadoraArea.calcularAreaTotal(formas);

        System.out.println("Área total das formas: " + areaTotal);
    }
}
