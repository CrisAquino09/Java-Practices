package com.mx.Estados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estados estado1= new Estados("Oaxaca", "Oaxaca de Juarez", 1000000, 23000000);
        Estados estado2= new Estados("Puebla", "Puebla de Zaragoza", 1000000, 23000000);
        Estados estado3= new Estados("Colima", "Colima", 1000000, 23000000);
        Estados estado4= new Estados("Jalisco", "Guadalajara", 1000000, 23000000);
        Estados estado5= new Estados("Nuevo Leon", "Monterrey", 1000000, 23000000);

        //Variable auxiliar
        Estados aux=null;

        //Crear el objeto para usar los metodos de la implementacion
        Implementacion imp= new Implementacion();

        //Guardar Elementos
        imp.guardar(estado1);
        imp.guardar(estado2);
        imp.guardar(estado3);
        imp.guardar(estado4);
        imp.guardar(estado5);
        /*
        //Mostrar Elementos
        imp.mostrar();

        //Buscar Elemento
        aux =imp.buscar(2);
        System.out.println("El elemento que buscas es: " + aux);

        //Editar Elemento
        aux=imp.buscar(3);
        aux.setPib(3498793);
        aux.setNumHabitantes(75657);
        imp.editar(3,estado4);
        imp.mostrar();


        //Eliminar Elemento
        imp.eliminar(3);
        imp.mostrar();

        //Contar
        imp.contar();

         */
        Scanner in =new Scanner(System.in);
        int menuP=0,menuS=0,index=0;
        String nombre,capital;
        int numHabitantes;
        double pib;

        do {
            System.out.println("**************MENU****************");
            System.out.println("1. ALTA");
            System.out.println("2. BUSCAR POR ATRIBUTO");
            System.out.println("3. EDITAR");
            System.out.println("4. ELIMINAR POR ATRIBUTO");
            System.out.println("5. MOSTRAR");
            System.out.println("6. CONTAR");
            System.out.println("7. ELIMINAR TODO");
            System.out.println("8. SALIR");
            System.out.println("---Elige una opcion validad del menu");
            try {
                menuP=in.nextInt();
                in.nextLine();

                switch (menuP){
                    case 1:
                        System.out.println("<<<<<<<<<<<< A L T A >>>>>>>>>>>>");
                        System.out.println("Rellena los siguientes datos sobre el Estado: \n");

                        System.out.println("Nombre: ");
                        nombre=in.nextLine();

                        System.out.println("Capital: ");
                        capital=in.nextLine();

                        System.out.println("Numero de Habitantes: ");
                        numHabitantes=in.nextInt();
                        in.nextLine();

                        System.out.println("PIB: ");
                        pib=in.nextInt();
                        in.nextLine();

                        aux= new Estados(nombre,capital,numHabitantes,pib);

                        if (imp.existeDuplicado(aux)){
                            System.out.println("Este registro ya existe en la lista");
                            System.out.println("NO SE PUEDEN AGREGAR DUPLICADOS");
                        }else {
                            imp.guardar(aux);
                            System.out.println("Registro guardado exitosamente: " + aux.getNombre() + " En la lista");
                        }
                        break;
                    case 2:
                        System.out.println("<<<<<<<<<<<< BUSCAR POR ATRIBUTO >>>>>>>>>>>>");
                        if(imp.lista.isEmpty()){
                            System.out.println("No hay Registros en la lista");
                        }else{
                            imprimirDatos(imp);
                            System.out.println("Ingrese el indice del articulo que desea verificar");
                            index=in.nextInt();
                            in.nextLine();

                            if(index >= 0 && index < imp.lista.size()){
                                aux=imp.buscar(index);
                                System.out.println("La informacion completa del estado es: ");
                                System.out.println(aux);
                            }else{
                                System.out.println("Indice Fuera de Rango");
                                System.out.println("Vuelva A intentar");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("<<<<<<<<<<<< E D I T A R >>>>>>>>>>>>");
                        imprimirDatos(imp);
                        if (imp.lista.size()>=0){
                            System.out.println("Elige El Estado que desea editar: ");
                            index=in.nextInt();
                            in.nextLine();

                            if (index>=0 && index < imp.lista.size()){
                                do {
                                    System.out.println("<<<<<<<<< MENU EDITAR>>>>>>>>");
                                    System.out.println("1. Nombre");
                                    System.out.println("2. Capital");
                                    System.out.println("3. Numero de Habitantes");
                                    System.out.println("4. PIB");
                                    System.out.println("5. Regresar al Menu Principal");
                                    System.out.println("Elige la opcion que desea editar");
                                    menuS= in.nextInt();
                                    in.nextLine();
                                    aux = imp.buscar(index);

                                    switch (menuS){
                                        case 1:
                                            System.out.println("Ingrese El nuevo Nombre: ");
                                            nombre=in.nextLine();
                                            aux.setNombre(nombre);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la nueva Capital: ");
                                            capital= in.nextLine();
                                            aux.setCapital(capital);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese la nueva cantidad de habitantes:");
                                            numHabitantes=in.nextInt();
                                            in.nextLine();
                                            aux.setNumHabitantes(numHabitantes);
                                            break;
                                        case 4:
                                            System.out.println("Ingrese el nuevo Producto Interno Bruto");
                                            pib=in.nextDouble();
                                            in.nextLine();
                                            aux.setPib(pib);
                                            break;
                                        case 5:
                                            do {
                                                System.out.println("Estas seguro que deseas SALIDE DEL MENU EDITAR?");
                                                System.out.println("1. Si");
                                                System.out.println("2. No");
                                                menuS=in.nextInt();
                                                in.nextLine();

                                                switch (menuS){
                                                    case 1:
                                                        System.out.println("Saliendo... Vuelva Pronto");
                                                        break;
                                                    case 2:
                                                        System.out.println("Volviendo Al Menu Principal");
                                                        menuP=0;
                                                        break;
                                                    default:
                                                        System.out.println("Ingrese una opcion valida");
                                                        break;
                                                }
                                            }while (menuS< 1 && menuS > 2);

                                            break;
                                        default:
                                            System.out.println("Opcion invalida, intenta de nuevo");
                                            break;

                                    }
                                }while (menuS !=5);
                            }else{
                                System.out.println("Indice Fuera de rango intente de nueo");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("<<<<<<<<<<<< ELIMINAR POR ATRIBUTO >>>>>>>>>>>>");
                        if (imp.lista.isEmpty()){
                            System.out.println("No hay elementos en la lista para eliminar");
                        }else{
                            imprimirDatos(imp);
                            System.out.println("Ingresa el indice del elemento que deseas eliminar: ");
                            index=in.nextInt();

                            if(index >=0 && index < imp.lista.size()){
                                do {
                                    System.out.println("Estas seguro que deseas eliminar ese elemento?");
                                    System.out.println("1. SI");
                                    System.out.println("2. NO");
                                    menuS=in.nextInt();
                                    in.nextLine();
                                    switch (menuS){
                                        case 1:
                                            imp.eliminar(index);
                                            System.out.println("El elemento fue eliminado Exitosamente");
                                            break;
                                        case 2:
                                            System.out.println("El elemento no fue eliminado:");
                                            System.out.println(imp.lista.get(index));
                                            break;
                                        default:
                                            System.out.println("Ingresa una opcion valida");
                                            break;
                                    }
                                }while (menuS < 1 && menuS >2);

                            }
                        }
                        break;
                    case 5:
                        System.out.println("<<<<<<<<<<<< M O S T R A R >>>>>>>>>>>>");
                        if(imp.lista.isEmpty()){
                            System.out.println("No hay registros por mostrar");
                        }else{
                            imprimirDatos(imp);
                        }
                        break;
                    case 6:
                        System.out.println("<<<<<<<<<<<< C O N T A R >>>>>>>>>>>>");
                        imp.contar();
                        break;
                    case 7:
                        System.out.println("<<<<<<<<<<<< ELIMINAR TODO >>>>>>>>>>>>");
                        if (imp.lista.isEmpty()){
                            System.out.println("No hay ningun elemento en la lista");
                        }else{
                            do {
                                System.out.println("Estas seguro que deseas eliminar todos los datos?");
                                System.out.println("1. SI");
                                System.out.println("2. NO");
                                menuS=in.nextInt();
                                in.nextLine();
                                switch (menuS){
                                    case 1:
                                        imp.lista.clear();
                                        System.out.println("Los registros se eliminaron exitosmente");
                                        break;
                                    case 2:
                                        System.out.println("Los registros no se han eliminado: ");
                                        imprimirDatos(imp);
                                        break;
                                    default:
                                        System.out.println("Opcion Fuera De rango Intente de nuevo");
                                        break;
                                }
                            }while (menuS <1 && menuS > 2);
                        }
                        break;
                    case 8:
                        do {
                            System.out.println("Estas seguro que deseas Cerrar el MENU PRINCIPAL?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            menuS=in.nextInt();
                            in.nextLine();

                            switch (menuS){
                                case 1:
                                    System.out.println("Saliendo... Vuelva Pronto");
                                    break;
                                case 2:
                                    System.out.println("Volviendo Al Menu Principal");
                                    menuP=0;
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida");
                                    break;
                            }
                        }while (menuS< 1 && menuS > 2);
                        break;
                    default:
                        System.out.println("Ingresa una opcion valida para el menu");
                        System.out.println("Vuelve a intentar");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada Invalida, Por favor Igrese un Numero");
                in.nextLine();
            } catch (Exception e) {
                System.out.println("Ocurrio un Error Inesperado: ");
                System.out.println(e.getMessage());
            }
        }while (menuP!=8);
    }

    public static void imprimirDatos(Implementacion imp){
        System.out.println("-----Estados Registrados-------");
        if (imp.lista.size() > 0){
            for (int i= 0; i < imp.lista.size(); i++){
                System.out.println("El Estado [" + i + "] de Nombre: " + imp.lista.get(i).getNombre());
            }
        }else{
            System.out.println("No hay Estados Registrados");
        }
    }
}

//1. alta
//2. Buscar por atributo
//3. Editar
//4. eliminar por atributo
//6. mostrar
//7. contar
//8. Eliminar todo

//agregar validaciiones: Si no existe no se puede eliminar y lo mismo con Eliminar
// *Preguntar antes Si esta seguro que desea eliminar
// Preguntar si esta seguro que desea salir del menu editar
//Preguntar si esta seguro que desea salir del menu principal
