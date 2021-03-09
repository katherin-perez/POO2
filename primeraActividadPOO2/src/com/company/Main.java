package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Nomina> nomina = new ArrayList<>();
        ArrayList<PrestacionServicios> prestacionServicios = new ArrayList<>();

        String control = "";
        do {
            System.out.println("Ingrese el nombre ");
            String nombre = scanner.next();
            System.out.println("Ingrese el apellido ");
            String apellido = scanner.next();
            System.out.println("Ingrese el número de identificación ");
            Integer cedula = scanner.nextInt();
            System.out.println("Ingrese el salario que se gana ");
            Double salario = scanner.nextDouble();
            System.out.println("Ingrese 1 si es un empleado de nómina o 2 si es un prestador de servicios");
            int tipo = scanner.nextInt();

            if (tipo == 1){
                System.out.println("Ingrese la cantidad de días trabajados");
                int diasTrabajo = scanner.nextInt();
                if (diasTrabajo < 32) {
                    Nomina nomina1 = new Nomina(nombre, apellido, cedula, salario, diasTrabajo);
                    nomina.add(nomina1);
                } else {
                    System.out.println("La cantidad de días ingresada no es válida");
                }
            }else {
                PrestacionServicios ps1 = new PrestacionServicios(nombre, apellido, cedula, salario);
                prestacionServicios.add(ps1);
            }

            System.out.println("¿Desea agregar un nuevo empleado? SI/NO");
            control = scanner.next();
        }while (control.equalsIgnoreCase("SI"));

        for (Nomina value : nomina) {
            System.out.println("Salario de: " + value.nombre + " " + value.apellido + " es: "
                    + value.calcularPagoMensual() + " la prima es de: " + value.calcularPrima(value.getDiasTrabajo()) +
                    " las vacaciones pagas son: " + value.calcularPagoVacaciones(15));
            System.out.println();
        }

        for (PrestacionServicios prestacionServicio : prestacionServicios) {
            System.out.println("Salario de: " + prestacionServicio.nombre + " " + prestacionServicio.apellido + "es: "
                    + prestacionServicio.calcularPagoMensual());
            System.out.println();
        }
    }
}
