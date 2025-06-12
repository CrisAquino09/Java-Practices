package com.mx.Celular;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar el objeto
		Celular celular1= new Celular("Samsung", "A50", 12, "Blanco", 512, 18000);
		Celular celular2= new Celular("Xiaomi", "Note 15", 12, "Verde", 512, 18000);
		Celular celular3= new Celular("Iphone", "13 Pro", 12, "negro", 512, 18000);
		Celular celular4= new Celular("Motorola", "Moto G", 12, "Azul", 512, 18000);
		Celular celular5= new Celular("ZTE", "Blade", 12, "Gris", 512, 18000);
		
		//Objeto Auxiliar
		Celular cel=null;
		
		//Mandar a llamar a mi clase implementacion para usar sus metodos
		Implementacion imp= new Implementacion();

		//Guardar
		
		imp.guardar(celular1);
		imp.guardar(celular2);
		imp.guardar(celular3);
		imp.guardar(celular4);
		imp.guardar(celular5);
		/*
		//Mostrar
		imp.mostrar();

		//Buscar
		cel= imp.buscar(0);
		System.out.println("Elemento encontrado: " + cel);

		//Editar
		cel= imp.buscar(1);
		cel.setModelo("Moto G60");
		cel.setPrecio(2400);
		imp.editar(1,celular2);
		imp.mostrar();

		//Eliminar
		imp.eliminar(3);
		imp.mostrar();

		//Contar
		imp.contar();
		*/

		//Crear un Menu Interactivo
		Scanner scan = new Scanner(System.in);
		int menuP=0, menuS=0, indice=0;
		String marca,modelo,color;
		int ram,almacenamiento;
		double precio;

		do {
			System.out.println("**************MENU****************");
			System.out.println("1. ALTA");
			System.out.println("2. BUSCAR");
			System.out.println("3. EDITAR");
			System.out.println("4. ELIMINAR");
			System.out.println("5. MOSTRAR");
			System.out.println("6. CONTAR");
			System.out.println("7. SALIR");
			System.out.println("---Elige una opcion validad del menu");

			//declaracion de un bloque try catch para evitar que el programa se detenga cuando se ingresen
			//valores diferentes a los delcarados por las variables

			try {
				menuP= scan.nextInt();
				scan.nextLine();

				//iniciar el bloque swithc
				switch (menuP){
					case 1:
						System.out.println("<<<<<<<<<<<<<< A L T A >>>>>>>>>>>>>>>>>");
						System.out.println("Rellena los siguientes datos sobre el celular: \n");

						System.out.println("Marca: ");
						marca=scan.nextLine();

						System.out.println("Modelo: ");
						modelo=scan.nextLine();

						System.out.println("RAM: ");
						ram=scan.nextInt();
						scan.nextLine();

						System.out.println("Color: ");
						color=scan.nextLine();

						System.out.println("Almacenamiento: ");
						almacenamiento=scan.nextInt();
						scan.nextLine();

						System.out.println("Precio: ");
						precio=scan.nextDouble();
						scan.nextLine();

						cel= new Celular(marca,modelo,ram,color,almacenamiento,precio);

						if (imp.existeDuplicado(cel)){
							System.out.println("Este registro ya existe en la lista");
							System.out.println("NO SE PUEDEN AGREGAR DUPLICADOS");
						}else {
							imp.guardar(cel);
							System.out.println("Registro guardado exitosamente: " + cel.getMarca() + " En la lista");
						}
						break;
					case 2:
						System.out.println("<<<<<<<<<<<<B U S C A R>>>>>>>>>>>>>>>");
						imprimirDatos(imp);

						if (imp.lista.size() >0 ){
							System.out.println("Indica el indice del dispositivo que desea visualizar: ");
							indice= scan.nextInt();
							scan.nextLine();

							if(indice>=0 && indice < imp.lista.size()){
								cel=imp.buscar(indice);
								System.out.println("Esta es la informacion completa del celular: \n" + cel);
							}else{
								System.out.println("Indice Fuerade Rango, Intenta Nuevamente");
							}
						}
						break;
					case 3:
						System.out.println("<<<<<<<<<<<<E D I T A R>>>>>>>>>>>>>>>");
						imprimirDatos(imp);
						if (imp.lista.size()>=0){
							System.out.println("Elige El dispositivo que desea editar: ");
							indice=scan.nextInt();
							scan.nextLine();

							if (indice>=0 && indice < imp.lista.size()){
								do {
									System.out.println("<<<<<<<<< MENU EDITAR>>>>>>>>");
									System.out.println("1. Marca");
									System.out.println("2. Modelo");
									System.out.println("3. RAM");
									System.out.println("4. Color");
									System.out.println("5. Almacenamiento");
									System.out.println("6. Precio");
									System.out.println("7. Regresar al Menu Principal");
									System.out.println("Elige la opcion que desea editar");
									menuS= scan.nextInt();
									scan.nextLine();
									cel = imp.buscar(indice);

									switch (menuS){
										case 1:
											System.out.println("Ingrese la nueva Marca: ");
											marca=scan.nextLine();
											cel.setMarca(marca);
											break;
										case 2:
											System.out.println("Ingrese el nuevo Modelo: ");
											modelo= scan.nextLine();
											cel.setModelo(modelo);
											break;
										case 3:
											System.out.println("Ingrese la nueva RAM:");
											ram=scan.nextInt();
											scan.nextLine();
											cel.setRam(ram);
											break;
										case 4:
											System.out.println("Ingrese el nuevo color");
											color=scan.nextLine();
											cel.setColor(color);
											break;
										case 5:
											System.out.println("Ingrese el nuevo Almacenamiento");
											almacenamiento=scan.nextInt();
											scan.nextLine();
											cel.setAlmacenamiento(almacenamiento);
											break;
										case 6:
											System.out.println("Ingrese el nuevo precio");
											precio=scan.nextDouble();
											scan.nextLine();
											cel.setPrecio(precio);
											break;
										case 7:
											System.out.println("Regresando al menu principal");
											break;
										default:
											System.out.println("Opcion invalida, intenta de nuevo");
											break;

									}
								}while (menuS !=7);
							}else{
								System.out.println("Indice Fuera de rango intente de nueo");
							}
						}
						break;
					case 4:
						System.out.println("<<<<<<<<<<<<E L I M I N A R>>>>>>>>>>>>");
						imprimirDatos(imp);
						if(imp.lista.size() > 0){
							System.out.println("Indica el indice del elemento que desea eliminar: ");
							indice=scan.nextInt();
							scan.nextLine();
							if(indice >= 0 && indice < imp.lista.size()){
								imp.eliminar(indice);
								System.out.println("Elemento eliminado correctamente");
							}else{
								System.out.println("Elemento Fuera de Rango");
							}

						}
						break;
					case 5:
						System.out.println("<<<<<<<<<<<<M O S T R A R>>>>>>>>>>>>>>");
						if(imp.lista.size() > 0){
							imp.mostrar();
						}else{
							System.out.println("No hay registros disponibles");
						}
						break;
					case 6:
						System.out.println("<<<<<<<<<<<<C O N T A R>>>>>>>>>>>>>>>");
						imp.contar();
						break;
					case 7:
						System.out.println("******Saliendo del menu*******");
						break;
					default:
						System.out.println("Opcion Fuera De Rango");
						System.out.println("Intenta de nuevo");
						break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada Invalida, Por favor Igrese un Numero");
				scan.nextLine();
			} catch (Exception e) {
				System.out.println("Ocurrio un Error Inesperado: ");
				System.out.println(e.getMessage());
			}
		}while (menuP!=7);
	}

	//Metodo estatico para imprimir un menu de opciones para el usuario
	public static void imprimirDatos(Implementacion imp){
		System.out.println("-----Celulares Registrados-------");
		if (imp.lista.size() > 0){
			for (int i= 0; i < imp.lista.size(); i++){
				System.out.println("El celular [" + i + "] de marca: " + imp.lista.get(i).getMarca());
			}
		}else{
			System.out.println("No hay Celulares registrados");
		}
	}
}