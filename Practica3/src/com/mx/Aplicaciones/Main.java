package com.mx.Aplicaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instanciar Objetos
        Aplicaciones a1 =new Aplicaciones(278,"Facebook", "Red Social", 1.0, 543.6, true);
        Aplicaciones a2 =new Aplicaciones(256,"WhatsApp", "Mensajeria", 1.0, 543.6, false);
        Aplicaciones a3 =new Aplicaciones(782,"Instagram", "Red Social", 1.0, 543.6, true);
        Aplicaciones a4 =new Aplicaciones(867,"YouTube", "Contenido Multimedia", 1.0, 543.6, true);
        Aplicaciones a5 =new Aplicaciones(982,"TikTok", "Red Social", 1.0, 543.6, false);
        Aplicaciones a6 =new Aplicaciones(942,"X", "Red Social", 1.0, 543.6, true);
        Aplicaciones a7 =new Aplicaciones(122,"Threads", "Red Social", 1.0, 543.6, true);
        Aplicaciones a8 =new Aplicaciones(762,"VScode", "Editor de Codigo", 1.0, 543.6, true);

        //Objeto AUXILIAR
        Aplicaciones app= null;

        //Implementacion
        Implementacion imp = new Implementacion();

        //Guardar Elementos
        imp.guardar(a1);
        imp.guardar(a2);
        imp.guardar(a3);
        imp.guardar(a4);
        imp.guardar(a5);
        imp.guardar(a6);
        imp.guardar(a7);
        imp.guardar(a8);
        /*
        //Mostrar datos
        imp.mostrar();

        //Buscar
        app= new Aplicaciones(a4.getClave());
        app= imp.buscar(app);
        System.out.println("Encontrado: " + app);

        //Editar
        app=new Aplicaciones(a1.getClave());
        app=imp.buscar(app);
        app.setNombre("IntelijIDEA");
        app.setDescripcion("Editor de codigo");
        imp.editar(app);
        imp.mostrar();

        //Eliminar
        app =new Aplicaciones(a2.getClave());
        app=imp.buscar(app);
        imp.eliminar(app);
        imp.mostrar();

        //Mostrar
        imp.contar();

         */

        Scanner in = new Scanner(System.in);
        int menuP=0, menuS=0, indice=0;
        String nombre,decripcion;
        int clave;
        double version,tamanio;
        boolean actualizadp;
        char confirmar='n';

        do {
            try {
                mostrarMenu();
                menuP=in.nextInt();
                in.nextLine();

                switch (menuP){
                    case 1:
                        System.out.println("<<<<<<<<<<<<<REGISTRO DE APLICAIONES>>>>>>>>>>>>>>");
                        System.out.println("Ingrese la clave de la nueva Aplicacion: ");
                        clave=in.nextInt();
                        in.nextLine();

                        if (imp.existeClave(clave)){
                            System.out.println("Error: La clave ingresada ya esta asignada a una Aplicacion");
                            break;
                        }

                        System.out.println("Ingresa el nombre: ");
                        nombre=in.nextLine();

                        System.out.println("Ingresa la Descripcion: ");
                        decripcion=in.nextLine();

                        System.out.println("Ingresa la Version: ");
                        version=in.nextDouble();
                        in.nextLine();

                        System.out.println("Ingresa El Tamaño: ");
                        tamanio=in.nextDouble();
                        in.nextLine();

                        actualizadp=true;

                        app= new Aplicaciones(clave, nombre, decripcion,version,tamanio,actualizadp);
                        imp.guardar(app);
                        System.out.println("Aplicacion Registrada Exitosamente!!");
                        break;
                    case 2:
                        System.out.println("<<<<<<<<<<<<<<<APLICACIONES INSTALADAS>>>>>>>>>>>>>>>>>");
                        if(imp.hash.isEmpty()){
                            System.out.println("No hay ninguna Aplicacion instalada");
                        }else{
                            imp.mostrar();
                        }
                        break;
                    case 3:
                        System.out.println("<<<<<<<<<<<<<<<<<<<EDITAR DATOS DE LAS APLICACIONES>>>>>>>>>>>>>>>");
                        if(imp.hash.isEmpty()){
                            System.out.println("No hay Aplicaiones instaladas");
                        }else{
                            imprimirDatosHash(imp);
                            System.out.println("Ingrese la clave de la aplicacion que desea editar");
                            clave= in.nextInt();
                            in.nextLine();
                            app=imp.buscar(new Aplicaciones(clave));
                            if(app != null){
                                do {
                                    System.out.println("<<<<<<<<<<<<<<EDITAR DATOS DE LA APLICACION>>>>>>>>>>>>>>>>");
                                    System.out.println("EDITANDO DATOS DE: " + app.getNombre());
                                    menuEditar();
                                    menuS=in.nextInt();
                                    in.nextLine();

                                    switch (menuS){
                                        case 1:
                                            System.out.println("Escribe el nuevo Nombre: ");
                                            app.setNombre(in.nextLine());
                                            break;
                                        case 2:
                                            System.out.println("Escriba la nueva Descripcion: ");
                                            app.setDescripcion(in.nextLine());
                                            break;
                                        case 3:
                                            System.out.println("Escribe la nueva version: ");
                                            version=in.nextDouble();
                                            in.nextLine();
                                            app.setVersion(version);
                                            break;
                                        case 4:
                                            System.out.println("Ingresa el nuevo Tamaño: ");
                                            tamanio=in.nextDouble();
                                            in.nextLine();
                                            app.setTamanio(tamanio);
                                            break;
                                        case 5:
                                            System.out.println("La aplicacion esta actualizada? true/false  ");
                                            actualizadp=in.nextBoolean();
                                            in.nextLine();
                                            app.setActualizado(actualizadp);
                                            break;
                                        case 6:
                                            System.out.println(app);
                                            break;
                                        case 7:
                                            System.out.println("Estas seguro que deseas salir del menu en edicion? s/n");
                                            if(confirmar(in.next().charAt(0))){
                                                System.out.println("Regresando al menu Principal");
                                                imp.editar(app);
                                            }else{
                                                System.out.println("Volviendo Al Menu de Edicion");
                                            }
                                            break;
                                        default:
                                            System.out.println("Ingresa Una Opcion Valida");
                                            break;
                                    }
                                }while (menuS != 8);
                            }else{
                                System.out.println("La clave ingresada no se encuentra en los registros intenta de nuevo");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("<<<<<<<<<<<<<< BUSCAR POR NOMBRE >>>>>>>>>>>>>>>>>");
                        if (imp.hash.isEmpty()){
                            System.out.println("La lista esta Vacia");
                        }else{
                            imprimirDatosHash(imp);
                            System.out.println("Ingrese el nombre de la Aplicaion que desea buscar: ");
                            nombre=in.nextLine();
                            buscarPorNombre(imp, nombre);
                        }
                        break;
                    case 5:
                        System.out.println("<<<<<<<<<<<<<<<<<< ELIMINAR POR NOMBRE >>>>>>>>>>>>>>>>");
                        if(imp.hash.isEmpty()){
                            System.out.println("No hay ningun registro en la lista");
                        }else{
                            imprimirDatosHash(imp);
                            System.out.println("Ingrese el nombre de la aplicacion que desea eliminar: ");
                            nombre=in.nextLine();

                            System.out.println("Estas seguro de que deseas eliminar este elemento? s/n");
                            confirmar=in.next().charAt(0);
                            if(confirmar(confirmar)){
                                eliminarPorNombre(imp,nombre);
                            }else{
                                System.out.println("La Aplicacion no fue eliminada");
                            }
                        }
                        break;
                    case 6:
                        System.out.println("<<<<<<<<<<<<<<<<<<<C ON T A R>>>>>>>>>>>>>>>>>>>>>>");
                        imp.contar();
                        break;
                    case 7:
                        System.out.println("<<<<<<<<<<<<<<<<<<<ELIMINAR TODO>>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println("Estas seguro de que deseas eliminar TODAS LAS APLICACIONES? s/n");
                        confirmar=in.next().charAt(0);
                        if(confirmar(confirmar)){
                            imp.hash.clear();
                            System.out.println("Se eliminaron todas las aplicaciones");
                        }else{
                            System.out.println("Las Aplicaciones no fueron eliminadas");
                            imp.mostrar();
                        }

                        break;
                    case 8:
                        System.out.println("Estas seguro que deseas salir del menu? s/n");
                        if(confirmar(in.next().charAt(0))){
                            System.out.println("Saliendo del Menu");
                            System.out.println("Vuelva Pronto");
                        }else{
                            System.out.println("Volviendo al Menu Principal");
                            menuP=0;
                        }

                        break;
                    default:
                        System.out.println("Ingresa una opcion valida para el menu");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una opcion valida");
                in.nextLine();
            } catch (Exception e) {
                System.out.println("Hubo un error inesperado, reinicia el programa");
                System.out.println("Error: " + e);
            }
        }while (menuP!=8);


    }

    private static void mostrarMenu(){
        System.out.println("\n-------------------M E N U------------------\n");
        System.out.println("1. Agregar Registro");
        System.out.println("2. Mostrar La Lista");
        System.out.println("3. Editar");
        System.out.println("4. Buscar Por Nombre");
        System.out.println("5. Eliminar Por Nombre");
        System.out.println("6. Contar Elementos");
        System.out.println("7. Eliminar Todo");
        System.out.println("8. Salir");
        System.out.println("SELECCIONA UNA OPCION");
    }

    private static void menuEditar(){
        System.out.println("1. NOMBRE ");
        System.out.println("2. DESCRIPCION");
        System.out.println("3. VERSION");
        System.out.println("4. TAMAÑO");
        System.out.println("5. ESTADO DE ACTUALIZACION: true/false");
        System.out.println("6. MOSTRAR DATOS ACTUALES");
        System.out.println("7. SALIR AL MENU PRINCIPAL");
        System.out.println("Selecciona una de las opciones a editar");
    }

    private static void imprimirDatosHash(Implementacion imp) {
        System.out.println("\n----------Lista de Empleados--------------\n");
        for (Aplicaciones app: imp.hash.values()){
            System.out.println("Clave: " + app.getClave() + " Nombre: " + app.getNombre() + " " + app.getDescripcion());
        }
    }

    private static void buscarPorNombre(Implementacion imp, String nombre){
        boolean encontrado = false;
        for (Aplicaciones app: imp.hash.values()){
            if(app.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(app);
                encontrado=true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro ninguna Aplicacion con ese nombre");
        }
    }

    private static void eliminarPorNombre(Implementacion imp, String nombre){
        boolean encontrado = false;
        for (Aplicaciones app: imp.hash.values()){
            if(app.getNombre().equalsIgnoreCase(nombre)){
                imp.eliminar(app);
                System.out.println("Aplicacion eliminada: " + app);
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro ninguna Aplicacion con ese nombre");
        }
    }

    private static boolean confirmar(char confirmar){
        boolean estado=false;
        if(confirmar == 's'){
            estado=true;
            return estado;
        }else if(confirmar=='n'){
            return estado;
        }else{
            return estado;
        }
    }

}
