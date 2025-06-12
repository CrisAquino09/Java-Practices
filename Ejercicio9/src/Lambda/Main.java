package Lambda;

import Entidad.Alumno;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instanciar Objetos

        Alumno al1= new Alumno(9837,"Jose", "Gonzales", "Jimenez", 22, "Psicologia", "BUAP");
        Alumno al2= new Alumno(123,"Cristal", "Santaigo", "Jimenez", 27, "Contabilidad", "IPN");
        Alumno al3= new Alumno(453,"Patricia", "Morales", "Jimenez", 21, "Administracio", "UABJO");
        Alumno al4= new Alumno(1679,"Rosa", "Orozco", "Jimenez", 30, "Software", "UNAM");
        Alumno al5= new Alumno(682,"Uriel", "Martinez", "Jimenez", 33, "Arquitectura", "UPN");
        Alumno al6= new Alumno(342,"Juan", "Ordaz", "Jimenez", 19, "Pedagogia", "TECNM");

        List<Alumno> alumnos= new ArrayList<Alumno>();
        Scanner in = new Scanner(System.in);

        alumnos.add(al1);
        alumnos.add(al2);
        alumnos.add(al3);
        alumnos.add(al4);
        alumnos.add(al5);
        alumnos.add(al6);


        /*
        *Sintaxis de lambda
        * (arg1)->(cuerpo)
        *               (tipo1,tipo2,arg1)->(cuerpo)
         */
        //MOSTRAR DATOS
        alumnos.forEach(
                //Expresion lambda
                (alumno) -> {
                    System.out.println("Nombre del alumno: " + alumno.getNombre()
                            + " De: " + alumno.getEdad() + " Años" +
                            " En la " + alumno.getUniversidad()+
                            " de la carrera en "  + alumno.getCarrera());
                }
        );
        /*
        //Detalle del alumno
        System.out.println("\n-------------Detalle Del Alumno---------------\n");

        //Imprimir la informacion usando filtros
        alumnos.stream().filter(
                arq -> arq.getUniversidad().equalsIgnoreCase("buap")
        ).forEach(
                alumno -> System.out.println("Nombre: " + alumno.getNombre() + " "+alumno.getaPaterno()
                +" "+ alumno.getaMaterno() + "\nEstudia: " + alumno.getCarrera() + "\nEn la Universidad: " + alumno.getUniversidad() + "\n")
        );

        ISaludo mensaje = (saludo, despedida) -> saludo + " y " + despedida;
        System.out.println("Expresiones lambda con 1 parametro: \n" + mensaje.saludar("Hola con expresiones lambda", "Hasta luego"));
        */

        int menu;

        try {
            do {
                System.out.println("Elige una opcion");
                menu();
                menu= in.nextInt();
                in.nextLine();
                switch (menu){
                    case 1:
                        //Filtrar Por Edad
                        System.out.println("<<<<<<<<<<<<<<<Filtrar Por Edad>>>>>>>>>>>>>>>");
                        System.out.print("Ingresa la edad de los alumnos que desea vrificar: ");
                        int edad=in.nextInt();
                        in.nextLine();

                        alumnos.stream().filter(
                                arq -> arq.getEdad()==edad
                        ).forEach(
                                alumno -> System.out.println("Nombre: " + alumno.getNombre() + " "+alumno.getaPaterno()
                                        +" "+ alumno.getaMaterno() + "\nEstudia: " + alumno.getCarrera() + "\nEn la Universidad: "
                                        + alumno.getUniversidad() + "\nEdad: " + alumno.getEdad() + "\n")
                        );
                        break;
                    case 2:
                        //Filtrar Por la primera Letra del nombre
                        System.out.println("<<<<<<<<<<<<<<<<<<Filtrar Por Inicial>>>>>>>>>>>>>>>>>>");
                        System.out.println("Ingresa la inicial Que estas buscando");
                        String inicial =in.nextLine().toUpperCase();

                        alumnos.stream().filter(
                                arq -> arq.getNombre().toUpperCase().startsWith(inicial)
                        ).forEach(
                                alumno -> System.out.println("Nombre: " + alumno.getNombre() + " "+alumno.getaPaterno()
                                        +" "+ alumno.getaMaterno() + "\nEstudia: " + alumno.getCarrera() + "\nEn la Universidad: " + alumno.getUniversidad() + "\n")
                        );
                        break;
                    case 3:
                        //ORDENAR POR NOMBRE
                        System.out.println("<<<<<<<<<<<<<<<<<<POR NOMBRE>>>>>>>>>>>>>>>>>>");
                        System.out.println("Alumnos Ordenados Alfabeticamente");
                        alumnos.sort((a1, a2) -> a1.getNombre().compareTo(a2.getNombre()));
                        alumnos.forEach(arq -> System.out.println(arq.getNombre() + " " + arq.getaPaterno() + " de la carrera " + arq.getCarrera()));

                        break;
                    case 4:
                        //Contar Por Carrera
                        System.out.println("<<<<<<<<<<<<<<<<<<Contar Por Carrera>>>>>>>>>>>>>>>>>>");
                        System.out.println("Ingresa la carrera que estas buscando");
                        String carreraAlumno=in.nextLine();
                        int cantidad;

                        cantidad= (int) alumnos.stream().filter(
                                arq -> arq.getCarrera().equalsIgnoreCase(carreraAlumno)
                        ).count();
                        System.out.println("Hay " + cantidad + " de alumnos en la carrera de " + carreraAlumno.toUpperCase());

                        break;
                    case 5:
                        //Mapear los nombres de los alumnos en mayuscula
                        System.out.println();
                        System.out.println("<<<<<<<<<<<<<<<<<<Mapear nombres a Mayuscula>>>>>>>>>>>>>>>>>>");

                        alumnos.stream().map(arg -> arg.getNombre().toUpperCase()).forEach(
                                System.out::println
                        );
                       break;
                    case 6:
                        //Calcular el promedio de las edades de todos los alumnos
                        System.out.println();
                        System.out.println("<<<<<<<<<<<<<<Promedio De Edades>>>>>>>>>>>>>>");
                        int totaledades=0;
                        //totaledades= alumnos.stream().mapToInt(Alumno -> Alumno.getEdad()).sum();
                        totaledades= alumnos.stream().mapToInt(Alumno::getEdad).sum();

                        System.out.println("El promedio de las edades es: " + (totaledades/alumnos.size()));
                        break;
                    case 7:
                        //Verificar si existe un alumno en una carrera en especifica
                        System.out.println();
                        System.out.println("<<<<<<<<<<<<<<<<<Verificar Alumno en una Carrera>>>>>>>>>>>>>>>>>");
                        System.out.println("Ingrese el nombre del alumno que desea buscar;");
                        String auxnomb=in.nextLine();
                        System.out.println("Ingresa la carrera del alumno: ");
                        String auxCarrera=in.nextLine();

                        alumnos.stream().filter(
                                arq -> arq.getNombre().equalsIgnoreCase(auxnomb)
                        ).filter(
                                arq -> arq.getCarrera().equalsIgnoreCase(auxCarrera)
                        ).forEach(
                                alumno -> System.out.println("Nombre: " + alumno.getNombre() + " "+alumno.getaPaterno()
                                        +" "+ alumno.getaMaterno() + "\nEstudia: " + alumno.getCarrera() + "\nEn la Universidad: " + alumno.getUniversidad() + "\n")
                        );
                        break;
                    case 8:
                        //Filtrar por universidad y carrera
                        System.out.println();
                        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Filtrar por Universidad y Carrera>>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println("Ingrese la universidad que desea buscar;");
                        String auxuni=in.nextLine();
                        System.out.println("Ingresa la carrera del alumno: ");
                        String auxcarr=in.nextLine();

                        alumnos.stream().filter(
                                arq -> arq.getNombre().equalsIgnoreCase(auxuni)
                        ).filter(
                                arq -> arq.getCarrera().equalsIgnoreCase(auxcarr)
                        ).forEach(
                                alumno -> System.out.println("Nombre: " + alumno.getNombre() + " "+alumno.getaPaterno()
                                        +" "+ alumno.getaMaterno() + "\nEstudia: " + alumno.getCarrera() + "\nEn la Universidad: " + alumno.getUniversidad() + "\n")
                        );

                        break;
                    case 9:
                        System.out.println("Saliendo del menu");
                        break;
                    default:
                        System.out.println("Ingresa una opcion valida del menu");
                        break;
                }

            }while (menu!=9);
        }catch (InputMismatchException e){
            System.out.println("Error Al ingresar datos");
        }catch (Exception e){
            System.out.println("Hubo un error inesperado, Vuelve a internar");
        }










        /*Realizar los siguientes Ejercicios
        * Filtrar a los alumnos que tengan mas de 22 años
        * Filtrar los alumnos cuyo  nombre comienza con la letra ¨A¨
        * Ordenar a los alumnos por su nombre
        * Contar a los alumnos de la carrera de medicina
        * Mapear los nombres de los alumnos en mayusculas
        * Calcular el promedio de las edades de todos los alumnos
        * Verificar si existe un alumno en la carrera de ¨Ing. Software¨
        * Filtrar alumnos por universidad ¨Buap¨ y por la carrera de ¨lic. Psicologia¨
        */
    }

    private static void menu(){
        System.out.println("1. FILTRAR POR EDAD ");
        System.out.println("2. FILTRAR POR INICIAL");
        System.out.println("3. ORDENAR POR NOMBRE");
        System.out.println("4. CONTAR POR CARRERA");
        System.out.println("5. MAPEAR NOMBRE A MAYUSCULA");
        System.out.println("6. CALCULAR PROMEIDO DE EDADES");
        System.out.println("7. VERIFICAR EXISTENCIA POR ALUMNO Y CARRERA");
        System.out.println("8. VERIFICAR EXISTENCIA POR UNIVERSIDAD Y CARRERA");
        System.out.println("9. SALIR");
        System.out.println("Selecciona una de las opciones a editar");
    }
}
