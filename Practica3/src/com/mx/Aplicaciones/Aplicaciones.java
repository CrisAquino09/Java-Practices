package com.mx.Aplicaciones;

public class Aplicaciones {
    private int clave;
    private String nombre;
    private String descripcion;
    private Double Version;
    private  Double tamanio;
    private Boolean actualizado;

    public Aplicaciones() {
    }

    public Aplicaciones(int clave) {
        this.clave = clave;
    }

    public Aplicaciones(int clave, String nombre, String descripcion, Double version, Double tamanio, Boolean actualizado) {
        this.clave = clave;
        this.nombre = nombre;
        this.descripcion = descripcion;
        Version = version;
        this.tamanio = tamanio;
        this.actualizado = actualizado;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getVersion() {
        return Version;
    }

    public void setVersion(Double version) {
        Version = version;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getActualizado() {
        return actualizado;
    }

    public void setActualizado(Boolean actualizado) {
        this.actualizado = actualizado;
    }

    @Override
    public String toString() {
        return "Aplicaciones{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", Version=" + Version +
                ", tamanio=" + tamanio +
                ", actualizado=" + actualizado +
                "}\n";
    }
}
