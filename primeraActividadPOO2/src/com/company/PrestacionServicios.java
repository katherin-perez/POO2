package com.company;

public class PrestacionServicios extends Empleado {


    public PrestacionServicios(String nombre, String apellido, Integer cedula, Double salario) {
        super(nombre, apellido, cedula, salario);
    }

    @Override
    double calcularPagoMensual() {
        if (salario == 908526){
            return salario + 106454;
        }
        return (salario);
    }
}
