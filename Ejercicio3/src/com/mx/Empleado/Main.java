package com.mx.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instanciar los objetos de la clase
        Empleado e1= new Empleado(289,"Raul", "Jimenez", "Auxiliar Administrativo", "RRHH", 657651,32000.0);
        Empleado e2= new Empleado(290,"Rosa", "Orozco", "Soporte Tecnico", "RRHH", 6576516,20000.0);
        Empleado e3= new Empleado(291,"Cristian", "Santiago", "Auxiliar Administrativo", "Jefe De Area", 65765165,50000.0);
        Empleado e4= new Empleado(294,"Tania", "Aquino", "Auxiliar Administrativo", "Mantenimiento", 65765165,70000.0);
        Empleado e5= new Empleado(297,"Genesis", "Jimenez", "Auxiliar Administrativo", "Mantenimiento", 65765165,70000.0);
        Empleado e6= new Empleado(212,"Patricia", "Orozco", "Auxiliar Administrativo", "Mantenimiento", 65765165,70000.0);
        Empleado e7= new Empleado(232,"Karen", "Aquino", "Auxiliar Administrativo", "Mantenimiento", 65765165,70000.0);
        Empleado e8= new Empleado(254,"Juan", "Matus", "Auxiliar Administrativo", "Mantenimiento", 657651657,70000.0);

        //Objeto AUXILIAR
        Empleado emp= null;

        //Implementacion
        Implementacion imp = new Implementacion();

        //Guardar Elementos
        imp.guardar(e1);
        imp.guardar(e2);
        imp.guardar(e3);
        imp.guardar(e4);
        imp.guardar(e5);
        imp.guardar(e6);
        imp.guardar(e7);
        imp.guardar(e8);

        /*
        //Mostrar datos
        imp.mostrar();

        //Buscar
        emp= new Empleado(289);
        emp= imp.buscar(emp);
        System.out.println("Encontrado: " + emp);

        //Editar
        emp=new Empleado(e1.getClave());
        emp=imp.buscar(emp);
        emp.setApellido("Gutierritos");
        emp.setDepartamento("Seguridad");
        imp.editar(emp);
        imp.mostrar();

        //Eliminar
        emp =new Empleado(e2.getClave());
        emp=imp.buscar(emp);
        imp.eliminar(emp);
        imp.mostrar();

        //Mostrar
        imp.contar();
        */

        Scanner in = new Scanner(System.in);
        int menuP=0, menuS=0;
        String nombre,apellido,puesto,departamento;
        int clave,contacto;
        double sueldo;

        do {
            mostrarMenu();
            menuP=in.nextInt();
            in.nextLine();

            switch (menuP){
                case 1:
                    System.out.println("<<<<<<<<<<<<<REGISTRO DE EMPLEADOS>>>>>>>>>>>>>>");
                    System.out.println("Ingrese la clave del nuevo empleado: ");
                    clave=in.nextInt();
                    in.nextLine();

                    if (imp.existeClave(clave)){
                        System.out.println("Error: La clave ingresada ya esta asignada a un usuario");
                        break;
                    }

                    System.out.println("Ingresa el nombre: ");
                    nombre=in.nextLine();

                    System.out.println("Ingresa Apellido: ");
                    apellido=in.nextLine();

                    System.out.println("Ingresa el puesto: ");
                    puesto=in.nextLine();

                    System.out.println("Ingresa Departamento: ");
                    departamento=in.nextLine();

                    System.out.println("Ingresa Telefono: ");
                    contacto=in.nextInt();
                    in.nextLine();

                    System.out.println("Ingresa Sueldo: $");
                    sueldo=in.nextDouble();
                    in.nextLine();

                    Empleado emp1= new Empleado(clave, nombre, apellido,puesto,departamento,contacto,sueldo);
                    imp.guardar(emp1);
                    System.out.println("Empleado Registrado Exitosamente!!");
                    break;
                case 2:
                    System.out.println("<<<<<<<<<<<<<<<LISTA DE EMPLEADOS>>>>>>>>>>>>>>>>>");
                    if(imp.hash.isEmpty()){
                        System.out.println("No hay ningun empleado registrado");
                    }else{
                        imp.mostrar();
                    }
                    break;
                case 3:
                    System.out.println("<<<<<<<<<<<<<<<<<<<EDITAR DATOS DEL EMPLEADO>>>>>>>>>>>>>>>");
                    if(imp.hash.isEmpty()){
                        System.out.println("No hay Empleados en la lista");
                    }else{
                        imprimirDatosHash(imp);
                        System.out.println("Ingrese la clave del usuario que desea editar");
                        clave= in.nextInt();
                        in.nextLine();
                        emp=imp.buscar(new Empleado(clave));
                        if(emp != null){
                            do {
                                System.out.println("<<<<<<<<<<<<<<EDITAR EMPLEADO>>>>>>>>>>>>>>>>");
                                System.out.println("EDITANDO DATOS DE: " + emp.getNombre());
                                menuEditar();
                                menuS=in.nextInt();
                                in.nextLine();

                                switch (menuS){
                                    case 1:
                                        System.out.println("Escribe el nuevo Nombre: ");
                                        emp.setNombre(in.nextLine());
                                        break;
                                    case 2:
                                        System.out.println("Escribe el nuevo Apellido: ");
                                        emp.setApellido(in.nextLine());
                                        break;
                                    case 3:
                                        System.out.println("Escribe el nuevo Puesto: ");
                                        emp.setPuesto(in.nextLine());
                                        break;
                                    case 4:
                                        System.out.println("Ingresa el nuevo Departamento: ");
                                        emp.setDepartamento(in.nextLine());
                                        break;
                                    case 5:
                                        System.out.println("Ingresa el nuevo numero de Telefono: ");
                                        contacto=in.nextInt();
                                        in.nextLine();
                                        emp.setContacto(contacto);
                                        break;
                                    case 6:
                                        System.out.println("Ingresa el nuevo Sueldo: $");
                                        sueldo=in.nextDouble();
                                        in.nextLine();
                                        emp.setSueldo(sueldo);
                                        break;
                                    case 7:
                                        System.out.println(emp);
                                        break;
                                    case 8:
                                        System.out.println("Estas seguro que deseas salir del menu en edicion? s/n");
                                        if(confirmar(in.next().charAt(0))){
                                            System.out.println("Regresando al menu Principal");
                                            imp.editar(emp);
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
                        System.out.println("Ingrese el nombre del usuario que desea buscar: ");
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
                        System.out.println("Ingrese el nombre del usuario que desea eliminar: ");
                        nombre=in.nextLine();
                        char confirmar='n';

                        System.out.println("Estas seguro de que deseas eliminar este elemento? s/n");
                        confirmar=in.next().charAt(0);
                        if(confirmar(confirmar)){
                            eliminarPorNombre(imp,nombre);
                        }else{
                            System.out.println("El usuario no fue eliminado");
                        }


                    }
                    break;
                case 6:
                    System.out.println("<<<<<<<<<<<<<<<<<<<C ON T A R>>>>>>>>>>>>>>>>>>>>>>");
                    imp.contar();
                    break;
                case 7:
                    System.out.println("<<<<<<<<<<<<<<<<<<<ELIMINAR TODO>>>>>>>>>>>>>>>>>>>>>>");
                    imp.hash.clear();
                    System.out.println("Se eliminaron todos los registros");
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
        System.out.println("2. APELLIDO");
        System.out.println("3. PUESTO");
        System.out.println("4. DEPARTAMENTO");
        System.out.println("5. CONTACTO");
        System.out.println("6. SUELDO");
        System.out.println("7. MOSTRAR DATOS ACTUALES");
        System.out.println("8. SALIR AL MENU PRINCIPAL");
        System.out.println("Selecciona una de las opciones a editar");
    }

    private static void imprimirDatosHash(Implementacion imp) {
        System.out.println("\n----------Lista de Empleados--------------\n");
        for (Empleado emp: imp.hash.values()){
            System.out.println("Clave: " + emp.getClave() + " Nombre: " + emp.getNombre() + " " + emp.getApellido());
        }
    }

    private static void buscarPorNombre(Implementacion imp, String nombre){
        boolean encontrado = false;
        for (Empleado emp: imp.hash.values()){
            if(emp.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(emp);
                encontrado=true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro ningun empleado con ese nombre");
        }
    }

    private static void eliminarPorNombre(Implementacion imp, String nombre){
        boolean encontrado = false;
        for (Empleado emp: imp.hash.values()){
            if(emp.getNombre().equalsIgnoreCase(nombre)){
                imp.eliminar(emp);
                System.out.println("Empleado eliminado: " + emp);
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro ningun empleado con ese nombre");
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
