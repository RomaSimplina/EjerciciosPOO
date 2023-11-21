package CLASES;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int intentos = 0, opcion;
        String nombreCliente, email;
        double balance, cantidadsolicitada;

        balance = random.nextDouble(6000);
        System.out.println("1.Depos

        
        switch (opcion) {
            case 1 -> {
                System.out.println("cantidad a depositar: ");
                cantidadsolicitada = entrada.nextDouble();
                CuentaBancaria.depositar(balance, cantidadsolicitada);
            }
            case 2 -> {
                System.out.println("Cantidad a retirar: ");
                cantidadsolicitada = entrada.nextDouble();
                CuentaBancaria.retirar(balance, cantidadsolicitada, intentos);
         

        entrada.close();

    }
}
