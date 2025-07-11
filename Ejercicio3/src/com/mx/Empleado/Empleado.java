package com.mx.Empleado;

public class Empleado {
    private int clave;
    private String nombre;
    private String apellido;
    private String puesto;
    private String departamento;
    private int contacto;
    private  Double sueldo;

    public Empleado() {
    }

    public Empleado(int clave, String nombre, String apellido, String puesto, String departamento, int contacto, Double sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.departamento = departamento;
        this.contacto = contacto;
        this.sueldo = sueldo;
    }

    public Empleado(int clave){
        this.clave=clave;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", puesto='" + puesto + '\'' +
                ", departamento='" + departamento + '\'' +
                ", contacto=" + contacto +
                ", sueldo=" + sueldo +
                "}\n";
    }
}
