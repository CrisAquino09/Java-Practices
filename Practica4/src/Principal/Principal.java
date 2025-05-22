package Principal;

import Entidades.Administrativos;
import Entidades.Docentes;
import Entidades.Estudiantes;
import Implementacion.ImpAdministrativos;
import Implementacion.ImpDocentes;
import Implementacion.ImpEstudiantes;

import javax.print.Doc;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Instanciar Objetos
        Estudiantes e1 = new Estudiantes(19190631,"Cristian", "Santiago Aquino", "Sistemas", 8,9);
        Estudiantes e2 = new Estudiantes(19200123, "María", "González Pérez", "Informática", 7, 8);
        Estudiantes e3 = new Estudiantes(19200234, "Juan", "López Martínez", "Sistemas", 9, 7);
        Estudiantes e4 = new Estudiantes(19200345, "Ana", "Rodríguez García", "Computación", 8, 9);
        Estudiantes e5 = new Estudiantes(19200456, "Carlos", "Hernández Sánchez", "Informática", 6, 8);
        Estudiantes e6 = new Estudiantes(19200567, "Laura", "Martín Fernández", "Sistemas", 9, 9);
        Estudiantes e7 = new Estudiantes(19200678, "Pedro", "Gómez Díaz", "Computación", 7, 7);
        Estudiantes e8 = new Estudiantes(19200789, "Sofía", "Pérez Ruiz", "Informática", 8, 8);
        Estudiantes e9 = new Estudiantes(19200890, "Diego", "Sanz Jiménez", "Sistemas", 9, 10);

        Docentes d1 = new Docentes(8683,"Alberto", "Ramirez", 7,"Contabilidad",12000.0);
        Docentes d2 = new Docentes(9245, "María", "González", 5, "Matemáticas", 11500.0);
        Docentes d3 = new Docentes(1023, "Carlos", "Martínez", 10, "Física", 15000.0);
        Docentes d4 = new Docentes(7568, "Laura", "Fernández", 3, "Literatura", 9800.0);
        Docentes d5 = new Docentes(6892, "Juan", "Pérez", 8, "Informática", 12500.0);
        Docentes d6 = new Docentes(4521, "Ana", "Sánchez", 12, "Biología", 16000.0);
        Docentes d7 = new Docentes(3356, "Pedro", "Rodríguez", 6, "Química", 11000.0);
        Docentes d8 = new Docentes(7894, "Sofía", "López", 4, "Historia", 10500.0);
        Docentes d9 = new Docentes(9012, "Diego", "Gómez", 9, "Economía", 14000.0);

        Administrativos a1=new Administrativos(69123,"Maria", "Morales" ,"Secretaria", "Servicio Social", 120000.0, 9);
        Administrativos a2 = new Administrativos(69124, "Juan", "Pérez", "Asistente", "Recursos Humanos", 110000.0, 7);
        Administrativos a3 = new Administrativos(69125, "Carlos", "Gómez", "Jefe", "Contabilidad", 150000.0, 12);
        Administrativos a4 = new Administrativos(69126, "Ana", "López", "Coordinadora", "Académico", 130000.0, 10);
        Administrativos a5 = new Administrativos(69127, "Pedro", "Martínez", "Analista", "Sistemas", 125000.0, 8);
        Administrativos a6 = new Administrativos(69128, "Laura", "Rodríguez", "Directora", "Administración", 180000.0, 15);
        Administrativos a7 = new Administrativos(69129, "Diego", "Sánchez", "Subdirector", "Planeación", 160000.0, 11);
        Administrativos a8 = new Administrativos(69130, "Sofía", "Fernández", "Supervisora", "Calidad", 140000.0, 9);
        Administrativos a9 = new Administrativos(69131, "Luis", "Díaz", "Técnico", "Mantenimiento", 100000.0, 6);

        //Variables Auxiliares
        Estudiantes auxEstudiantes=null;
        ImpEstudiantes impEstudiantes= new ImpEstudiantes();

        Docentes auxDocentes=null;
        ImpDocentes impDocentes= new ImpDocentes();

        Administrativos auxAdministrativos=null;
        ImpAdministrativos impAdministrativos=new ImpAdministrativos();

        //Guardar Datos
        impEstudiantes.guardar(e1);
        impEstudiantes.guardar(e2);
        impEstudiantes.guardar(e3);
        impEstudiantes.guardar(e4);
        impEstudiantes.guardar(e5);
        impEstudiantes.guardar(e6);
        impEstudiantes.guardar(e7);
        impEstudiantes.guardar(e8);
        impEstudiantes.guardar(e9);

        impDocentes.guardar(d1);
        impDocentes.guardar(d2);
        impDocentes.guardar(d3);
        impDocentes.guardar(d4);
        impDocentes.guardar(d5);
        impDocentes.guardar(d6);
        impDocentes.guardar(d7);
        impDocentes.guardar(d8);
        impDocentes.guardar(d9);

        impAdministrativos.guardar(a1);
        impAdministrativos.guardar(a2);
        impAdministrativos.guardar(a3);
        impAdministrativos.guardar(a4);
        impAdministrativos.guardar(a5);
        impAdministrativos.guardar(a6);
        impAdministrativos.guardar(a7);
        impAdministrativos.guardar(a8);
        impAdministrativos.guardar(a9);

        //Mostrar Datos
        impEstudiantes.mostrar();
        impDocentes.mostrar();
        impAdministrativos.mostrar();
        /*
        //Buscar Datos
        System.out.println("Datos del Estudiante");
        auxEstudiantes= (Estudiantes) impEstudiantes.buscar(1);
        System.out.println(auxEstudiantes);

        System.out.println("Datos del Docente");
        auxDocentes= (Docentes) impDocentes.buscar(1);
        System.out.println(auxDocentes);

        System.out.println("Datos del Administrativo");
        auxAdministrativos= (Administrativos) impAdministrativos.buscar(1);
        System.out.println(auxAdministrativos);

        //Eliminar Elemento
        System.out.println();
        impEstudiantes.eliminar(0);
        System.out.println("Estudiante Eliminado Exitosamente");

        impDocentes.eliminar(0);
        System.out.println("Docente Eliminado Exitosamente");

        impAdministrativos.eliminar(0);
        System.out.println("Administrativo Eliminado Exitosamente");

        //Contar Elementos
        System.out.println();
        impEstudiantes.contar();
        impDocentes.contar();
        impAdministrativos.contar();
        /*
         */

        //Auxiliares
        Scanner in =new Scanner(System.in);
        int menuT=0,menuP=0,menuS=0,indice=0;

        //Estudiantes
        int numEstudiante, numMaterias, semestre;
        String nombreEstudiante,apellidoEstudiante,especialidadEstudiante;

        //Docentes
        int numDocente, horasAsignadas;
        String nombreDocente,apellidoDocente,departamentoDocente;
        double sueldoDocente;

        //Administrativos
        int numAdministrativo, antiguedad;
        String nombreAdministrativo, apellidoAdministrativo, puestoAdministrativo, departamentoAdministrativo;
        double sueldoAdministrativo;


        try {
            do {
                menuTipo();
                menuT=in.nextInt();
                in.nextLine();

                switch (menuT){
                    case 1:
                        //MENU DE ESTUDIANTES
                        mostrarMenu();
                        menuP=in.nextInt();
                        in.nextLine();

                        do {
                            switch (menuP){
                                case 1:
                                    System.out.println("<<<<<<<<<<A G R E G A R>>>>>>>>>>>>>");
                                    break;
                                case 2:
                                    System.out.println("<<<<<<<<<<<MOSTRAR LISTA>>>>>>>>>>>>>>");
                                    if(impEstudiantes.list.isEmpty()){
                                        System.out.println("Noy hay ningun registro en la lista");
                                    }else{
                                        impEstudiantes.mostrar();
                                    }
                                    break;
                                case 3:
                                    System.out.println("<<<<<<<<<<<<<<<E D I T A R>>>>>>>>>>>>>>");
                                    break;
                                case 4:
                                    System.out.println("<<<<<<<<<<<<<<<B U S C A R>>>>>>>>>>>>>>");
                                    if(impEstudiantes.list.isEmpty()){
                                        System.out.println("No hay ningun elemento en la lista");
                                    }else{
                                        imprimirDatosEstudiantes(impEstudiantes);
                                        System.out.println("Ingresa el indice del usuario que deseas buscar: ");
                                        indice=in.nextInt();
                                        in.nextLine();
                                        if(indice<0 && indice >= impEstudiantes.list.size()){
                                            System.out.println("Ingresa un indice valido, Vuelve a intentar");
                                        }else{
                                            auxEstudiantes= (Estudiantes) impEstudiantes.buscar(indice);
                                            System.out.println(auxEstudiantes);
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("<<<<<<<<<<<<<<<E L I M I N A R>>>>>>>>>>>>>>");
                                    if(impEstudiantes.list.isEmpty()){
                                        System.out.println("No hay ningun elemento en la lista");
                                    }else{
                                        imprimirDatosEstudiantes(impEstudiantes);
                                        System.out.println("Ingresa el indice del usuario que deseas eliminar: ");
                                        indice=in.nextInt();
                                        in.nextLine();
                                        if(indice<0 && indice >= impEstudiantes.list.size()){
                                            System.out.println("Ingresa un indice valido, Vuelve a intentar");
                                        }else{
                                            auxEstudiantes= (Estudiantes) impEstudiantes.buscar(indice);
                                            impEstudiantes.eliminar(indice);
                                            System.out.println("El elemento: " + auxEstudiantes.getNombre() + " " + auxEstudiantes.getApellido() + "Fue eliminado");
                                        }
                                    }

                                    break;
                                case 6:
                                    System.out.println("<<<<<<<<<<<<<<<C O N T A R>>>>>>>>>>>>>>>>");
                                    impEstudiantes.contar();
                                    break;
                                case 7:
                                    System.out.println("<<<<<<<<<<<<<<<ELIMINAR TODO>>>>>>>>>>>>>>>");
                                    System.out.println("Estas seguro que deseas Eliminat todo el contenido de la lista? s/n");
                                    if(confirmar(in.next().charAt(0))){
                                        System.out.println("Eliminacion de registros exitosa");
                                        impEstudiantes.list.clear();
                                        impEstudiantes.contar();
                                    }else{
                                        System.out.println("Los registros no fueron eliminados: ");
                                        impEstudiantes.mostrar();
                                    }
                                    break;
                                case 8:
                                    System.out.println("Estas seguro que deseas salir del menu? s/n");
                                    if(confirmar(in.next().charAt(0))){
                                        System.out.println("Saliendo del Menu Estudiante");
                                        System.out.println("Vuelva Pronto");
                                    }else{
                                        System.out.println("Volviendo al Menu Estudiante");
                                        menuP=0;
                                    }
                                    break;
                                default:
                                    System.out.println("Ingresa una opcion valida dentro del menu");
                                    break;
                            }
                        }while (menuP!=8);

                        break;
                    case 2:
                        //MENU DE DOCENTES
                        mostrarMenu();
                        menuP=in.nextInt();
                        in.nextLine();

                        do {
                            switch (menuP){
                                case 1:
                                    System.out.println("<<<<<<<<<<A G R E G A R>>>>>>>>>>>>>");
                                    break;
                                case 2:
                                    System.out.println("<<<<<<<<<<<MOSTRAR LISTA>>>>>>>>>>>>>>");
                                    if(impDocentes.list.isEmpty()){
                                        System.out.println("Noy hay ningun registro en la lista");
                                    }else{
                                        impDocentes.mostrar();
                                    }
                                    break;
                                case 3:
                                    System.out.println("<<<<<<<<<<<<<<<E D I T A R>>>>>>>>>>>>>>");
                                    break;
                                case 4:
                                    System.out.println("<<<<<<<<<<<<<<<B U S C A R>>>>>>>>>>>>>>");
                                    if(impDocentes.list.isEmpty()){
                                        System.out.println("No hay ningun elemento en la lista");
                                    }else{
                                        imprimirDatosDocentes(impDocentes);
                                        System.out.println("Ingresa el indice del usuario que deseas buscar: ");
                                        indice=in.nextInt();
                                        in.nextLine();
                                        if(indice<0 && indice >= impDocentes.list.size()){
                                            System.out.println("Ingresa un indice valido, Vuelve a intentar");
                                        }else{
                                            auxDocentes= (Docentes) impDocentes.buscar(indice);
                                            System.out.println(auxDocentes);
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("<<<<<<<<<<<<<<<E L I M I N A R>>>>>>>>>>>>>>");
                                    if(impDocentes.list.isEmpty()){
                                        System.out.println("No hay ningun elemento en la lista");
                                    }else{
                                        imprimirDatosDocentes(impDocentes);
                                        System.out.println("Ingresa el indice del usuario que deseas eliminar: ");
                                        indice=in.nextInt();
                                        in.nextLine();
                                        if(indice<0 && indice >= impDocentes.list.size()){
                                            System.out.println("Ingresa un indice valido, Vuelve a intentar");
                                        }else{
                                            auxDocentes= (Docentes) impDocentes.buscar(indice);
                                            impDocentes.eliminar(indice);
                                            System.out.println("El elemento: " + auxDocentes.getNombre() + " " + auxDocentes.getApellido() + "Fue eliminado");
                                        }
                                    }
                                    break;
                                case 6:
                                    System.out.println("<<<<<<<<<<<<<<<C O N T A R>>>>>>>>>>>>>>>>");
                                    impDocentes.contar();
                                    break;
                                case 7:
                                    System.out.println("<<<<<<<<<<<<<<<ELIMINAR TODO>>>>>>>>>>>>>>>");
                                    System.out.println("Estas seguro que deseas Eliminar todo el contenido de la lista? s/n");
                                    if(confirmar(in.next().charAt(0))){
                                        System.out.println("Eliminacion de registros exitosa");
                                        impDocentes.list.clear();
                                        impDocentes.contar();
                                    }else{
                                        System.out.println("Los registros no fueron eliminados: ");
                                        impDocentes.mostrar();
                                    }
                                    break;
                                case 8:
                                    System.out.println("Estas seguro que deseas salir del menu? s/n");
                                    if(confirmar(in.next().charAt(0))){
                                        System.out.println("Saliendo del Menu Docente");
                                        System.out.println("Vuelva Pronto");
                                    }else{
                                        System.out.println("Volviendo al Menu Docente");
                                        menuP=0;
                                    }
                                    break;
                                default:
                                    System.out.println("Ingresa una opcion valida dentro del menu");
                                    break;
                            }
                        }while (menuP!=8);

                        break;
                    case 3:
                        //MENU DE ADMINISRTATIVOS
                        mostrarMenu();
                        menuP=in.nextInt();
                        in.nextLine();

                        do {
                            switch (menuP){
                                case 1:
                                    System.out.println("<<<<<<<<<<A G R E G A R>>>>>>>>>>>>>");
                                    break;
                                case 2:
                                    System.out.println("<<<<<<<<<<<MOSTRAR LISTA>>>>>>>>>>>>>>");
                                    if(impAdministrativos.list.isEmpty()){
                                        System.out.println("Noy hay ningun registro en la lista");
                                    }else{
                                        impAdministrativos.mostrar();
                                    }
                                    break;
                                case 3:
                                    System.out.println("<<<<<<<<<<<<<<<E D I T A R>>>>>>>>>>>>>>");
                                    break;
                                case 4:
                                    System.out.println("<<<<<<<<<<<<<<<B U S C A R>>>>>>>>>>>>>>");
                                    if(impAdministrativos.list.isEmpty()){
                                        System.out.println("No hay ningun elemento en la lista");
                                    }else{
                                        imprimirDatosAdministrativo(impAdministrativos);
                                        System.out.println("Ingresa el indice del usuario que deseas buscar: ");
                                        indice=in.nextInt();
                                        in.nextLine();
                                        if(indice<0 && indice >= impAdministrativos.list.size()){
                                            System.out.println("Ingresa un indice valido, Vuelve a intentar");
                                        }else{
                                            auxAdministrativos= (Administrativos) impAdministrativos.buscar(indice);
                                            System.out.println(auxAdministrativos);
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("<<<<<<<<<<<<<<<E L I M I N A R>>>>>>>>>>>>>>");
                                    if(impAdministrativos.list.isEmpty()){
                                        System.out.println("No hay ningun elemento en la lista");
                                    }else{
                                        imprimirDatosAdministrativo(impAdministrativos);
                                        System.out.println("Ingresa el indice del usuario que deseas eliminar: ");
                                        indice=in.nextInt();
                                        in.nextLine();
                                        if(indice<0 && indice >= impAdministrativos.list.size()){
                                            System.out.println("Ingresa un indice valido, Vuelve a intentar");
                                        }else{
                                            auxAdministrativos= (Administrativos) impAdministrativos.buscar(indice);
                                            impAdministrativos.eliminar(indice);
                                            System.out.println("El elemento: " + auxAdministrativos.getNombre() + " " + auxAdministrativos.getApellido() + "Fue eliminado");
                                        }
                                    }
                                    break;
                                case 6:
                                    System.out.println("<<<<<<<<<<<<<<<C O N T A R>>>>>>>>>>>>>>>>");
                                    impAdministrativos.contar();
                                    break;
                                case 7:
                                    System.out.println("<<<<<<<<<<<<<<<ELIMINAR TODO>>>>>>>>>>>>>>>");
                                    System.out.println("Estas seguro que deseas Eliminat todo el contenido de la lista? s/n");
                                    if(confirmar(in.next().charAt(0))){
                                        System.out.println("Eliminacion de registros exitosa");
                                        impAdministrativos.list.clear();
                                        impAdministrativos.contar();
                                    }else{
                                        System.out.println("Los registros no fueron eliminados: ");
                                        impAdministrativos.mostrar();
                                    }
                                    break;
                                case 8:
                                    System.out.println("Estas seguro que deseas salir del menu? s/n");
                                    if(confirmar(in.next().charAt(0))){
                                        System.out.println("Saliendo del Menu Administrativo");
                                        System.out.println("Vuelva Pronto");
                                    }else{
                                        System.out.println("Volviendo al Menu Administrativo");
                                        menuP=0;
                                    }
                                    break;
                                default:
                                    System.out.println("Ingresa una opcion valida dentro del menu");
                                    break;
                            }
                        }while (menuP!=8);

                        break;
                    default:
                        System.out.println("Ingresa una opcion dentro de rango");
                        break;
                }
            }while (menuT!=3);
        }catch (InputMismatchException e){
            System.out.println("Ingresa una entrada valida");
        } catch (Exception e) {
            System.out.println("Hubo un error inesperado: " + e);
        }

    }
    private static void menuTipo(){
        System.out.println("<<<<<<<<<<<<<<<<<<<<SELECCIONA EL TIPO DE USUARIO>>>>>>>>>>>>>>>>>>>");
        System.out.println("1. ESTUDIANTES");
        System.out.println("2. DOCENTES");
        System.out.println("3. ADMINISTRATIVOS");
        System.out.println("Elige una opcion");
    }
    private static void mostrarMenu(){
        System.out.println("\n-------------------M E N U------------------\n");
        System.out.println("1. Agregar Registro");
        System.out.println("2. Mostrar La Lista");
        System.out.println("3. Editar");
        System.out.println("4. Buscar");
        System.out.println("5. Eliminar");
        System.out.println("6. Contar Elementos");
        System.out.println("7. Eliminar Todo");
        System.out.println("8. Salir");
        System.out.println("SELECCIONA UNA OPCION");
    }

    private static void menuEstudiante(){
        System.out.println("1. NUMERO DE ESTUDIANTE ");
        System.out.println("2. NOMBRE");
        System.out.println("3. APELLIDO");
        System.out.println("4. ESPECIALIDAD");
        System.out.println("5. NUMERO DE MATERIAS");
        System.out.println("6. SEMESTRE");
        System.out.println("7. SALIR AL MENU PRINCIPAL");
        System.out.println("Selecciona una de las opciones a editar");
    }

    private static void menuDocente(){
        System.out.println("1. NUMERO DE DOCENTE ");
        System.out.println("2. NOMBRE");
        System.out.println("3. APELLIDO");
        System.out.println("4. HORAS ASIGNADAS");
        System.out.println("5. DEPARTAMENTO");
        System.out.println("6. SUELDO");
        System.out.println("7. SALIR AL MENU PRINCIPAL");
        System.out.println("Selecciona una de las opciones a editar");
    }

    private static void menuAdministrativo(){
        System.out.println("1. NUMERO DE ADMINISTRATIVO ");
        System.out.println("2. NOMBRE");
        System.out.println("3. APELLIDO");
        System.out.println("4. PUESTO");
        System.out.println("5. DEPARTAMENTO");
        System.out.println("6. SUELDO");
        System.out.println("7. ANTIGUEDAD");
        System.out.println("8. SALIR AL MENU PRINCIPAL");
        System.out.println("Selecciona una de las opciones a editar");
    }

    public static void imprimirDatosEstudiantes(ImpEstudiantes imp){
        System.out.println("-----Alumnos Registrados-------");
        if (!imp.list.isEmpty()){
            for (int i= 0; i < imp.list.size(); i++){
                System.out.println("Estuadiante [" + i + "] de Nombre: " + imp.list.get(i));
            }
        }else{
            System.out.println("No hay Alumnos Registrados");
        }
    }

    public static void imprimirDatosDocentes(ImpDocentes imp){
        System.out.println("-----Docentes Registrados-------");
        if (!imp.list.isEmpty()){
            for (int i= 0; i < imp.list.size(); i++){
                System.out.println("Docentes [" + i + "] de Nombre: " + imp.list.get(i));
            }
        }else{
            System.out.println("No hay Docentes Registrados");
        }
    }

    public static void imprimirDatosAdministrativo(ImpAdministrativos imp){
        System.out.println("-----Administrativos Registrados-------");
        if (!imp.list.isEmpty()){
            for (int i= 0; i < imp.list.size(); i++){
                System.out.println("Administrativo [" + i + "] de Nombre: " + imp.list.get(i));
            }
        }else{
            System.out.println("No hay Administrativos Registrados");
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
