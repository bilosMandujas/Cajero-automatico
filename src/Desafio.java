import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nombre = "tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;


        System.out.println("**************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta:" + tipoDeCuenta);
        System.out.println("Su saldo en cuenta es:" + saldo + "$");
        System.out.println("\n************************************");

        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar 
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

        switch (opcion){
            case 1 :
                System.out.println("El saldo actulizado es: " +saldo+ "$");
                break;
            case 2 :
                System.out.println("¿Cual es el valor que desea retirar?");
                double valorARetirar = teclado.nextDouble();
                if(saldo < valorARetirar){
                    System.out.println("Saldo insuficiente");
                }else{
                    saldo = saldo - valorARetirar;
                    System.out.println("El saldo actualizado es:" + saldo);
                }
                break;

            case 3 :
                System.out.println("¿Cual es el valor que desea despositar");
                double valorADepositar = teclado.nextDouble();
                saldo += valorADepositar;
                System.out.println("El saldo actualizado es:" + saldo);
                break;
            case 9:
                System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
            default:
                System.out.println("Opcion no valida");
        }

        }

    }
}
