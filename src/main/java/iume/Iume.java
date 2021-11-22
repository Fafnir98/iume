package iume;

import java.util.Scanner;
import java.util.Random;

public class Iume {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte respuesta;
		do {
		System.out.println("Bienvenido a Iume, versión alpha 0.0.3\n\t"
				+ "¿Qué quieres simular? (introduce el número)\n\t"
				+ "0- Nada\n\t"
				+ "1- Partido en campo neutral\n\t"
				+ "2- Partido con local y visitante\n\t"
				+ "3- Reportar algún bug\n\t"
				+ "4- Insultar a Fafnir");
		respuesta = Byte.parseByte(sc.nextLine());
		switch (respuesta) {
		case 0:
			System.out.println("Espero que te haya servido el programa :)");
			break;
		case 1:
			Neutral.resultado();
			break;
		case 2:
			byte nlocal;
			byte rlocal;
			byte rvisitante;
			do {
				rlocal = 0;
				System.out.println("¿Qué nivel tiene el equipo local?\n\t"
			
					+ "1- Top\n\t"
					+ "2- Alto\n\t"
					+ "3- Medio\n\t"
					+ "4- Bajo\n\t");
			nlocal = Byte.parseByte(sc.nextLine());
			 
			switch (nlocal) {
			case 1:
				rlocal += NivelTop.local();
				break;
			case 2:
				rlocal += NivelAlto.local();
				break;
			case 3:
				rlocal += NivelMedio.local();
				break;
			case 4:
				rlocal += NivelBajo.local();
				break;
			default:
				System.out.println("Esa no es una opción válida");
				break;
			}
			} while (nlocal > 4 || nlocal < 0);
			byte nvisitante;
			do {
				rvisitante = 0;
				System.out.println("¿Qué nivel tiene el equipo visitante?\n\t"
			
					+ "1- Top\n\t"
					+ "2- Alto\n\t"
					+ "3- Medio\n\t"
					+ "4- Bajo\n\t");
			nvisitante = Byte.parseByte(sc.nextLine());
			 
			switch (nvisitante) {
			case 1:
				rvisitante += NivelTop.visitante();
				break;
			case 2:
				rvisitante += NivelAlto.visitante();
				break;
			case 3:
				rvisitante += NivelMedio.visitante();
				break;
			case 4:
				rvisitante += NivelBajo.visitante();
				break;
			default:
				System.out.println("Esa no es una opción válida");
				break;
				}
			} while (nvisitante > 4 || nlocal < 0);
			System.out.println("El resultado es " + rlocal + "-" + rvisitante);
			break;
		case 3:
			System.out.println("Si has encontrado algún bug por favor avisa al creador por Twitter en @Fafnir98");
			break;
		case 4:
			System.out.println("Tu puta madre por si acaso");
			break;
		default:
			System.out.println("¡Esa opción no es válida! Por favor inténtalo de nuevo");
			break;
		}
		} while (respuesta != 0);
		
		
	}

}
