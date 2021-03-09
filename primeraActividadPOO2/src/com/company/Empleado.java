package com.company;

public abstract class Empleado {

    protected String nombre;
    protected String apellido;
    protected Integer cedula;
    protected Double salario;

    public Empleado(String nombre, String apellido, Integer cedula, Double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.salario = salario;
    }

    abstract double calcularPagoMensual();

}
