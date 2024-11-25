package integercontainers;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in); 
	static int select = -1; 
	static int num1 = 0;
	
	public static void main(String[] args) {
		 
		while(select != 0){
			
			System.out.println("Introduce la implementación que quieres probar\n");
			System.out.println("1 - PILA");
			System.out.println("2 - COLA");
			System.out.println("0 - Salir");
			System.out.println();
			select = Integer.parseInt(scanner.nextLine());
			switch(select){
			case 1: 
				IntegerStack pila = new IntegerStack();
				System.out.println("Operaciones a realizar con la Pila :");
				while(select != 0){
					System.out.println("1 - Apilar");
					System.out.println("2 - Desapilar");
					System.out.println("3 - Obtener Top");
					System.out.println("4 - Contar elementos de la Pila");
					System.out.println("5 - Comprobar si un elemento se encuentra en la pila");
					System.out.println("6 - Mostrar el contenido de la pila");
					System.out.println("0 - Salir");
					System.out.println();
					select = Integer.parseInt(scanner.nextLine());
					switch(select){
					case 1: 			
						System.out.println("Introduce entero a apilar: ");
						num1 = Integer.parseInt(scanner.nextLine());
						pila.push(num1);
						break;
					case 2: 			
						System.out.println("Elemento desapilado: " +pila.pop());
						break;
					case 3: 			
						System.out.println("El ultimo elemento de la pila es : "+pila.top());
						break;
					case 4: 			
						System.out.println("El numero de elementos de la pila es : "+pila.size());
						break;
					case 5: 			
						System.out.println("Introduce entero a buscar en la pila: ");
						num1 = Integer.parseInt(scanner.nextLine());
						System.out.println("Se encuentra "+num1 + " en la pila: " +pila.search(num1));
						break;
					case 6: 			
						System.out.println("El contenido de la pila es:  "+pila.toString());
						break;
					case 0: 
						System.out.println("Saliendo del programa...");
						break;
					
					}
				}
				System.out.println();
				break;
			case 2: 			
				IntegerQueue cola = new IntegerQueue();
				System.out.println("Operaciones a realizar con la Cola :");
				while(select != 0){
					System.out.println("1 - Insertar");
					System.out.println("2 - Extraer");
					System.out.println("3 - Obtener elemento cabecera");
					System.out.println("4 - Contar elementos de la Cola");
					System.out.println("5 - Comprobar si un elemento se encuentra en la cola");
					System.out.println("6 - Mostrar el contenido de la cola");
					System.out.println("0 - Salir");
					System.out.println();
					select = Integer.parseInt(scanner.nextLine());
					switch(select){
					case 1: 			
						System.out.println("Introduce entero a insertar: ");
						num1 = Integer.parseInt(scanner.nextLine());
						cola.insert(num1);
						break;
					case 2: 			
						//System.out.println("Elemento desapilado: " +pila.pop());
						break;
					case 3: 			
						//System.out.println("El ultimo elemento de la pila es : "+pila.top());
						break;
					case 4: 			
						//System.out.println("El numero de elementos de la pila es : "+pila.size());
						break;
					case 5: 			
						/*System.out.println("Introduce entero a buscar en la pila: ");
						num1 = Integer.parseInt(scanner.nextLine());
						System.out.println("Se encuentra "+num1 + " en la pila: " +pila.search(num1));*/
						break;
					case 6: 			
						System.out.println("El contenido de la cola es:  "+cola.toString());
						break;
					case 0: 
						System.out.println("Saliendo del programa...");
						break;
					
					}
				}
				System.out.println();
				break;
			case 0: 
				System.out.println("Saliendo del programa...");
				break;
			}
		}
		
	}

}
