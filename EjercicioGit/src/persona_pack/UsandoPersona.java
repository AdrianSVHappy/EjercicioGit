package persona_pack;

import java.util.Scanner;

public class UsandoPersona {

	public static void main(String[] args) {
		//Constantes
		final float S = 10.5f;
		// Atributos
		Persona personita;
		Scanner sn = new Scanner(System.in);

		String nom;
		int menu, hora, contador=0;
		float gasto;
		boolean heComprado;

		// Body

		System.out.print("Vas a nacer, cual quieres que sea tu nombre?\n>");
		nom = sn.nextLine();
		personita = new Persona(nom);

		do {
				System.out.print("\nSeleccione una acción para hacer:\n"
						+ personita.toString()
						+ "\n1.- Cumple años."
						+ "\n2.- Trabajar."
						+ "\n3.- Comprar."
						+ "\n4.- Salir"
						+ "\n>");
				menu = sn.nextInt();
				switch(menu) {
				case 1:
					personita.cumple();
					System.out.println("Feliz "+personita.getEdad()+"º cumpleaños, "+personita.getNombre());
					break;
				case 2:
					System.out.print("Voy a trabajar, ¿cuanto tiempo tendria que estar hoy?\n>");
					hora = sn.nextInt();
					personita.trabajar(S*hora);
					break;
				case 3:
					if(personita.getSaldo()<=0) 
						System.out.println("No voy a poder comprar nada, mejor iré a trabajar.");
					else {
						do {
							System.out.print("Veamos, tengo "+personita.getSaldo()+"€ en la cartera, cuanto me voy a gastar?\n>");
							gasto = sn.nextFloat();
							heComprado = personita.comprar(gasto);			
							System.out.println();
						}while(!heComprado);
					}
					break;
				case 4:
					System.out.println("Has muerto....");
					break;
				default:
					contador++;
					if(contador>=5) {
						System.out.println("A la carcel!");
						menu = 4;
					}else
						System.out.println("Hacer eso es ilegal, ten cuidado...");
				}
		} while (menu != 4);
	}

}
