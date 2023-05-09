public class Main {
    public static void main(String[] args) {

        //Exercício Retornos
        System.out.println("Exercício Retorno");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado é igual a" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("A área do retângulo é igual a " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("A área do trapézio é igual a " + areaTrapezio);

        float areaLosango = Quadrilatero.area(4, 4);
        System.out.println("A área do losango é igual a " + areaLosango);

    }
}