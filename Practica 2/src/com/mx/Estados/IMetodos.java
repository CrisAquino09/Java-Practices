package com.mx.Estados;

public interface IMetodos {
    public void guardar(Estados estado);
    public void editar(int indice, Estados estado);
    public void mostrar();
    public void eliminar(int indice);
    public Estados buscar(int indice);
}
