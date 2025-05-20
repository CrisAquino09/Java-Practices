package com.mx.coche;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Crear istancias del objeto: Mandar a llamar a la clase para agregarle valores a los atributos

        Coche coche1= new Coche("Toyota", "Tacoma", 2024,"Blanco", 1700000);
        Coche coche2= new Coche("Toyota", "Tacoma", 2024,"Blanco", 1700000);
        Coche coche3 = new Coche("Toyota", "Tacoma", 2024,"Blanco", 1700000);

        //Objeto Auxiliar: Para poder asignarles  un valor de busqueda, se declara null para despues asignarle
        //cualquier valor que se requiera
        Coche auxCoche=null;

        //Creacion de Lista
        //Es una estructura de datos que permite almacenar elementos de una manera ordenada
        //se usa la interfaz list que proviene de java.util

        List <Coche> lista= new ArrayList<Coche>();

        //Guarda objetos en la lista
        lista.add(coche1);
        lista.add(coche2);
        lista.add(coche3);
        /*
        //Visualizar contenido de la lista
        //System.out.println("Elementos de la lista:\n" +lista);

        //Modificar elemento con get y set
        auxCoche= lista.get(1);
        auxCoche.setColor("Azul Diamante");
        auxCoche.setPrecio(0);
        //System.out.printf("Elemento editado: \n" + auxCoche);

        //Eliminar elemento de lista
        System.out.printf("Tamanio de lista original: " + lista.size());
        lista.remove(2);
        System.out.println("\nLista actualizada: " + lista.size());

        //Contar elementos de la lista
        System.out.println();
        System.out.println("Coches en la lista + " + lista.size());

        //Eliminar Todo

        lista.clear();

        //Validar si la lista ya esta vacia para comprobar si se elimino todo
        if (lista.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista es: " + lista);
        }
         */

        //Menu iteractivo
        Scanner scan=null;
        int menuPrincipal=0, menuSecundario=0,index=0;

        String marca,submarca,color;
        double precio;
        int modelo;

        do{
            System.out.println("--------Menu--------");
            System.out.println("1. Agregar un nuevo registro");
            System.out.println("2. Mostrar la lista");
            System.out.println("3. Editar");
            System.out.println("4. Buscar Elemento");
            System.out.println("5. Eliminar elementos");
            System.out.println("6. Contar todos los elementos");
            System.out.println("7. Salir del menu");
            System.out.println();
            System.out.println("************** Elige una opcion del menu ****************");
            System.out.println();
            scan = new Scanner(System.in);
            menuPrincipal= scan.nextInt();

            switch (menuPrincipal){
                case 1:
                    System.out.println("1. AGREGAR UN NUEVO REGISTRO");
                    System.out.println();
                    System.out.println("Ingrese la marca del vehiculo: ");
                    scan = new Scanner(System.in);
                    marca= scan.nextLine();

                    System.out.println("Ingrese la submarca del vehiculo: ");
                    scan = new Scanner(System.in);
                    submarca=scan.nextLine();

                    System.out.println("Ingrese el modelo del vehiculo: ");
                    scan = new Scanner(System.in);
                    modelo=scan.nextInt();

                    System.out.println("Ingrese el color del vehiculo: ");
                    scan = new Scanner(System.in);
                    color=scan.nextLine();

                    System.out.println("Ingrese el precio del vehiculo: $");
                    scan = new Scanner(System.in);
                    precio=scan.nextDouble();

                    auxCoche= new Coche(marca,submarca,modelo,color,precio);
                    lista.add(auxCoche);
                    System.out.println("Registro Agregado exitosamente");
                    break;
                case 2:
                    System.out.println("2. MOSTRAR LISTA");
                    System.out.println();
                    System.out.println("La informacion almacenada es:\n" + lista);
                    break;
                case 3:
                    System.out.println("3. EDITANDO UN ELEMENTO");
                    System.out.println();
                    System.out.println("Ingresa el indice del emento que deseas editar: ");
                    scan= new Scanner(System.in);
                    index=scan.nextInt();

                    auxCoche=lista.get(index);
                    do {
                        System.out.println("-----------Menu de Edicion-------------");
                        System.out.println("1. Editar Marca");
                        System.out.println("2. Editar Sub Marca");
                        System.out.println("3. Editar Modelo");
                        System.out.println("4. Editar Color");
                        System.out.println("5. Editar Precio");
                        System.out.println("6. Regresar Al Menu Principal");
                        System.out.println("***********Elige una opcion valida************");
                        System.out.println();
                        scan=new Scanner(System.in);
                        menuSecundario=scan.nextInt();

                        switch (menuSecundario){
                            case 1:
                                System.out.println("Escribe la nueva marca: ");
                                scan=new Scanner(System.in);
                                marca=scan.nextLine();

                                auxCoche.setMarca(marca);
                                lista.set(index,auxCoche);
                                System.out.println("Se edito la marca correctamente");
                                break;
                            case 2:
                                System.out.println("Escribe la nueva submarca: ");
                                scan=new Scanner(System.in);
                                submarca=scan.nextLine();

                                auxCoche.setSubMarca(submarca);
                                lista.set(index,auxCoche);
                                System.out.println("Se edito la submarca correctamente");
                                break;
                            case 3:
                                System.out.println("Escribe el nuevo modelo: ");
                                scan=new Scanner(System.in);
                                modelo=scan.nextInt();

                                auxCoche.setModelo(modelo);
                                lista.set(index,auxCoche);
                                System.out.println("Se edito el modelo correctamente");
                                break;
                            case 4:
                                System.out.println("Escribe el nuevo color: ");
                                scan=new Scanner(System.in);
                                color=scan.nextLine();

                                auxCoche.setColor(color);
                                lista.set(index,auxCoche);
                                System.out.println("Se edito el color correctamente");
                                break;
                            case 5:
                                System.out.println("Ingresa el nuevo precio: ");
                                scan = new Scanner(System.in);
                                precio=scan.nextDouble();

                                auxCoche.setPrecio(precio);
                                lista.set(index,auxCoche);
                                System.out.println("El precio se edito correctamente");
                                break;
                            case 6:
                                System.out.println("Regresando al menu principal");
                                break;
                            default:
                                System.out.println("Indice fuera de rango");
                                break;
                        }

                    }while (menuSecundario!=6);
                    break;
                case 4:
                    System.out.println("4. BUSCAR ELEMENTO");
                    System.out.println();
                    System.out.println("Ingresa el elemento que desea buscar: ");
                    scan = new Scanner(System.in);
                    index=scan.nextInt();
                    auxCoche=lista.get(index);
                    System.out.println("Elemento encontrado:\n " + auxCoche);
                    break;
                case 5:
                    System.out.println("5. ELIMINAR ELEMENTO");
                    System.out.println();
                    System.out.println("Ingresa el indice del elemento que desea eliminar: ");
                    scan=new Scanner(System.in);
                    index=scan.nextInt();
                    int aux= lista.size();

                    lista.remove(index);

                    if(aux != lista.size()){
                        System.out.println("Elemento eliminado correctamente");
                        System.out.println("Lista actualizada: \n" + lista);
                    }else{
                        System.out.println("Hubo un error al eliminar el registro");
                    }
                    break;
                case 6:
                    System.out.println("6. CONTAR TODOS LOS ELEMENTOS");
                    System.out.println();
                    System.out.println("La cantidad de vehiculos disponibles son: " + lista.size());
                    break;
                case 7:
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    System.out.println("Opcion invalida, intenta un numero del 1 al 7");
                    break;
            }
        }while (menuPrincipal!=7);
    }
}

//Actividad:
//Replicar el ejercicio, crear un nuevo archivo java, con los mismos objetos y clases
//usar las acciones de la lista, agregando al menos 5 elementos de la lista

//ACTIVIDAD 2
// HACER UN MENU INTERACTIVO PARA EL EJERCCIO QUE SE HIZO
//con las siguientes opciones
/*
    1. agregar registro
    2. mostrar lista
    3. editar
    4. buscar un elemento por atributo
    5. eliminar elemento por atributo
    6. contar elementos
    7. eliminar todo
    8. salir
Agregar calidaciones, por ejemplo que n existran datos duplicados y al eliminar
o editar verificar primero que los datos existen.

 */