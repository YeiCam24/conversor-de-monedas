import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String monedaBase;
        String monedaAconvertir;
        double monto;
        String menu = """
                =============================================
                        MENU CONVERTIDOR DE DIVISAS
                =============================================
                         Marque la opcion que desea\s
                ____________________________________________
                1) - para pasar de Dólar >>> Peso Argentino
                2) - para pasar de Peso Argentino >>> Dólar
                3) - para pasar de Dólar >>> Real Brasileño
                4) - para pasar de Real Brasileño >>> Dólar
                5) - para pasar de Dólar >>> Peso Colombiano\s
                6) - para pasar de Peso Colombiano >>> Dólar
                8) - ayuda...
                9) - para Salir
                ===========================================
               \s""";
        String ayuda= """
                ===========================================
                Bienvenido a la aplicación de conversión de monedas\s
                seleccione mediante el teclado numero la opción que desea\s
                realizar\s
                evite usar teclado alfabético ya que no esta permitido como una opción
                """;
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        Divisa moneda = new Divisa();

        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    // de dolar a peso argentino
                    System.out.println("ingrese el monto a convertir ");
                    monedaBase = "USD";
                    monedaAconvertir ="ARS";
                    monto = teclado.nextDouble();

                    System.out.println(moneda.convertirMoneda(monedaBase, monedaAconvertir, monto));
                    break;
                case 2:
                    //de peso argentino a dolar
                    System.out.println("ingrese el monto a convertir ");
                    monedaBase = "ARS";
                    monedaAconvertir ="USD";
                    monto = teclado.nextDouble();

                    System.out.println(moneda.convertirMoneda(monedaBase, monedaAconvertir, monto));
                    break;
                case 3:
                    // dolar a real brasileño
                    System.out.println("ingrese el monto a convertir ");
                    monedaBase = "USD";
                    monedaAconvertir ="BRL";
                    monto = teclado.nextDouble();

                    System.out.println(moneda.convertirMoneda(monedaBase, monedaAconvertir, monto));
                    break;
                case 4:
                    // de real brasileño a dolar
                    System.out.println("ingrese el monto a convertir ");
                    monedaBase = "BRL";
                    monedaAconvertir ="USD";
                    monto = teclado.nextDouble();

                    System.out.println(moneda.convertirMoneda(monedaBase, monedaAconvertir, monto));
                    break;
                case 5:
                    // de dolar a peso colombiano
                    System.out.println("ingrese el monto a convertir ");
                    monedaBase = "USD";
                    monedaAconvertir ="COP";
                    monto = teclado.nextDouble();

                    System.out.println(moneda.convertirMoneda(monedaBase, monedaAconvertir, monto));
                    break;
                case 6:
                    // de peso colombiano a dolar
                    System.out.println("ingrese el monto a convertir ");
                    monedaBase = "COP";
                    monedaAconvertir ="USD";
                    monto = teclado.nextDouble();

                    System.out.println(moneda.convertirMoneda(monedaBase, monedaAconvertir, monto));
                    break;
                case 8:
                    System.out.println(ayuda);
                case 9:
                    System.out.println("Gracias por utilizar nuestro servicio");
                default:
                    System.out.println("Esta opción no está disponible, utilice la opción 8 para ayuda ");
            }
        }
    }
}