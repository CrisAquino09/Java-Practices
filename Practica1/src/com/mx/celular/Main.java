package com.mx.celular;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        celular celular1=new celular("Samsung","Z FLIP","Blanco", 20000,64,512);
        celular celular2=new celular("Xiaomi","Note 15","Azul", 10000,24,512);
        celular celular3=new celular("Iphone","16 Pro","Negro", 25000,12,512);
        celular celular4=new celular("Huawei","Mate 20","Verde", 17000,32,512);
        celular celular5=new celular("Motorola","X60","Gris", 6000,8,512);
        celular celular6=new celular("Realme","15+","Blanco", 9000,16,512);

        celular celaux=null;

        List <celular> lista= new ArrayList<celular>();
        lista.add(celular1);
        lista.add(celular2);
        lista.add(celular3);
        lista.add(celular4);
        lista.add(celular5);
        lista.add(celular6);

        //visualizar
        /*
        System.out.println("Elementos de la lista:\n" + lista);
        System.out.println("");

        //modificar
        celaux=lista.get(0);
        celaux.setColor("Gris");
        celaux.setPrecio(18000);
        System.out.println("Elemento modificado: \n" + lista.get(0));

        //eliminar elementos
        System.out.println();
        System.out.println("Elementos Actuales de la lista: " + lista.size());

        lista.remove(5);
        System.out.println("Elemenetos eliminados");
        System.out.println("Elementos actuales de la lista: " +lista.size());

        //ordenar Alfabeticamente

        //Ordenar por precio

        //vaciar lista
        System.out.println();
        lista.clear();

        //comprobar si esta vacia
        if(lista.isEmpty()){
            System.out.println("No hay productos en existencia");
        }else{
            System.out.println("Productos en existencia: \n" + lista);
        }
         */

        Scanner scan=null;
        int menuPrincipal=0,menuSecundario=0,index=0;
        String marca,modelo, color;
        int ram,rom;
        double precio;

        do {
            System.out.println("------------------MENU-------------");
            System.out.println("1. Agrgar nuevo registro");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Editar elemento");
            System.out.println("4. Buscar elemento");
            System.out.println("5. Eliminar elemento");
            System.out.println("6. Contar elementos");
            System.out.println("7. Eliminar todo");
            System.out.println("8. Salir");
            System.out.println();
            System.out.println("***********Elige una Opcion***********");
            System.out.println();
            scan =new Scanner(System.in);
            menuPrincipal=scan.nextInt();

            switch (menuPrincipal){
                case 1:
                    System.out.println("1. AGREGAR NUEVO REGISTRO");
                    System.out.println();

                    System.out.println("Ingrese la marca");
                    scan=new Scanner(System.in);
                    marca=scan.nextLine();

                    System.out.println("Ingrese el modelo");
                    scan=new Scanner(System.in);
                    modelo=scan.nextLine();

                    System.out.println("Ingrese el color");
                    scan=new Scanner(System.in);
                    color=scan.nextLine();

                    System.out.println("Ingrese el precio");
                    scan=new Scanner(System.in);
                    precio=scan.nextDouble();

                    System.out.println("Ingrese la memoria ram");
                    scan=new Scanner(System.in);
                    ram=scan.nextInt();

                    System.out.println("Ingrese la memoria rom");
                    scan=new Scanner(System.in);
                    rom=scan.nextInt();

                    celaux=new celular(marca,modelo,color,precio,ram,rom);

                    /*if(lista.contains(celaux) == false){
                        lista.add(celaux);
                        System.out.println("Registro agregado exitosamente");
                    }else {
                        System.out.println("Ya hay un elemento con las mismas caracteristicas,");
                    }*/
                    boolean guardado=false;
                    for (int i=0; i<lista.size(); i++){
                        if(lista.get(i).equals(celaux)){
                            System.out.println("Ya hay un elemento agregado con las mismas caracteristicas");
                            i=lista.size();
                            guardado=true;
                        }
                    }
                    if(guardado==false){
                        lista.add(celaux);
                        System.out.println("Elemento guardado exitosamente");
                    }
                    break;
                case 2:
                    System.out.println("2. MOSTRAR LISTA");
                    System.out.println();
                    System.out.println("Los telefonos en existencia son: ");
                    System.out.println(lista);
                    break;
                case 3:
                    System.out.println("3. EDITAR ELEMENTO");
                    System.out.println();
                    System.out.println("Ingrese el indice del elemento que sesea editar");
                    scan = new Scanner(System.in);
                    index=scan.nextInt();

                    if (index >=0 && index < lista.size()){
                        celaux=lista.get(index);
                        do {
                            System.out.println("---------MENU DE EDICION-------------");
                            System.out.println("1. Editar Marca");
                            System.out.println("2. Editar Modelo");
                            System.out.println("3. Editar Color");
                            System.out.println("4. Editar Precio");
                            System.out.println("5. Editar Ram");
                            System.out.println("6. Editar Rom");
                            System.out.println("7. Regresar al menu principal");
                            System.out.println("***********Elige una opcion************");
                            System.out.println();
                            scan=new Scanner(System.in);
                            menuSecundario=scan.nextInt();

                            switch (menuSecundario){
                                case 1:
                                    System.out.println("1.EDITAR MARCA");
                                    System.out.println("Escribe la nueva marca del dispositivo: ");
                                    scan=new Scanner(System.in);
                                    marca=scan.nextLine();

                                    celaux.setMarca(marca);
                                    lista.set(index,celaux);
                                    System.out.println("Se editor la marca correctamente");
                                    break;
                                case 2:
                                    System.out.println("2. EDITAR MODELO");
                                    System.out.println("Escribe el nuevo modelo del dispositivo: ");
                                    scan=new Scanner(System.in);
                                    modelo = scan.nextLine();

                                    celaux.setModelo(modelo);
                                    lista.set(index,celaux);
                                    System.out.println("Se edito el modelo correctamente");
                                    break;
                                case 3:
                                    System.out.println("3. EDITAR COLOR");
                                    System.out.println("Ingrese el nuevo color del modelo: ");
                                    scan=new Scanner(System.in);
                                    color=scan.nextLine();

                                    celaux.setColor(color);
                                    lista.set(index,celaux);
                                    System.out.println("Se edito el color correctamente");
                                    break;
                                case 4:
                                    System.out.println("4. EDITAR PRECIO");
                                    System.out.println("Ingrese el nuevo precio del dispositivo: ");
                                    scan=new Scanner(System.in);
                                    precio=scan.nextDouble();

                                    celaux.setPrecio(precio);
                                    lista.set(index,celaux);
                                    System.out.println("Se edito el precio correctamente");
                                    break;
                                case 5:
                                    System.out.println("5. EDITAR RAM");
                                    System.out.println("Ingrese la nueva cantidad de ram: ");
                                    scan=new Scanner(System.in);
                                    ram=scan.nextInt();

                                    celaux.setRam(ram);
                                    lista.set(index,celaux);
                                    System.out.println("Se edito la cantidad de ram correctamente");
                                    break;
                                case 6:
                                    System.out.println("6. EDITAR ROM");
                                    System.out.println("Ingrese la nueva cantidad de rom: ");
                                    scan=new Scanner(System.in);
                                    rom=scan.nextInt();

                                    celaux.setRom(rom);
                                    lista.set(index,celaux);
                                    System.out.println("Se edito la cantidad de memoria ram correctamente");
                                    break;
                                case 7:
                                    System.out.println("REGRESANDO AL MENU PRINCIPAL");
                                    break;
                                default:
                                    System.out.println("Ingresa una opcion valida, reintenta de nuevo");

                            }

                        }while (menuSecundario!=7);
                    }else{
                        System.out.println("El indice de ese dispositivo no existe intenta con otro");
                    }

                    break;
                case 4:
                    System.out.println("4. BUSCAR ELEMENTO");
                    System.out.println();
                    System.out.println("Ingresa el indice del elemento que deseas buscar");
                    scan = new Scanner(System.in);
                    index= scan.nextInt();

                    if(index < lista.size() && index >= 0){
                        System.out.println("La informacion del elemento es: ");
                        System.out.println(lista.get(index));
                    }else{
                        System.out.println("El indice del elemento ingresado no existe intenta con otro");
                    }
                    break;
                case 5:
                    System.out.println("5. ELIMINAR ELEMENTO");
                    System.out.println();
                    System.out.println("Ingresa el indice del elemento que deseas eliminar");
                    scan = new Scanner(System.in);
                    index= scan.nextInt();

                    if(index < lista.size() && index >= 0){
                        lista.remove(index);
                        System.out.println("Elemento eliminado exitosamente");
                    }else{
                        System.out.println("El indice del elemento ingresado no existe intenta con otro");
                    }

                    break;
                case 6:
                    System.out.println("6. CONTAR ELEMENTOS");
                    System.out.println();
                    System.out.println("La cantidad de telefono en existencia son: " + lista.size());
                    System.out.println("Los elementos son: \n" + lista);
                    break;
                case 7:
                    System.out.println("7. ELIMINAR TODO");
                    do {
                        System.out.println("Estas seguro de que deseas eliminar todos los registros?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        scan=new Scanner(System.in);
                        menuSecundario=scan.nextInt();

                        switch (menuSecundario){
                            case 1:
                                if (lista.isEmpty()){
                                    System.out.println("No hay datos por eliminar");
                                }else{
                                    lista.clear();
                                    System.out.println("Registros eliminados exitosamente");
                                }
                                break;
                            case 2:
                                System.out.println("Los registros no se eliminaron: \n" +lista);
                                break;
                            default:
                                System.out.println("Eige una opcion valida");
                                break;
                        }
                    }while (menuSecundario < 1 || menuSecundario > 2);
                    break;
                case 8:
                    System.out.println("******SALIENDO DEL MENU********");
                    break;
                default:
                    System.out.println("Opccion invalida, ingresa un valor dentro del rango");
                    break;
            }
        }while (menuPrincipal!=8);


    }
}