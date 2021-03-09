package com.company;

public class Nomina extends Empleado{

    private Integer diasTrabajo;

    public Nomina(String nombre, String apellido, Integer cedula, Double salario, Integer diasTrabajo) {
        super(nombre, apellido, cedula, salario);
        this.diasTrabajo = diasTrabajo;
    }

    public Integer getDiasTrabajo() {
        return diasTrabajo;
    }

    @Override
    double calcularPagoMensual() {
        if (salario == 908526){
            return (salario * 0.92) + 106454;
        }
        return salario * 0.92;
    }

    double calcularPrima(int diasTrabajo){
        return (salario * diasTrabajo) / 360;
    }

    double calcularPagoVacaciones(int diasVacaciones){
        return (salario / 30) * diasVacaciones;
    }
}
