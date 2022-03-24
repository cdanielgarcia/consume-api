package com.example.consumeapi.pojo;

public class Futbolista {
    private int codigo;
    private String nombre;
    private String posicion;
    private int year;

    public Futbolista(int codigo, String nombre, String posicion, int year) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.posicion = posicion;
        this.year = year;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", year=" + year +
                '}';
    }
}
