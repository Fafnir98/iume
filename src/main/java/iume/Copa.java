package iume;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import clases.Competicion;
import clases.Equipo;

public class Copa {
	public static byte primera() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte equipo = 0;
		byte dado = (byte) (rd.nextInt(100) + 1);
		if (dado < 16) {
			equipo += 0;
		}
		else if (dado < 40) {
			equipo += 1;
		}
		else if (dado < 60) {
		equipo += 2;
		}
		else if (dado < 80) {
			equipo += 3;
		}
		else if (dado < 91) {
			equipo += 4;
		}
		else if (dado < 95) {
			byte bonus = (byte) (rd.nextInt(4) + 1);
			equipo += (byte) (4 + bonus);
		}
		else {
			byte bonus = (byte) (rd.nextInt(4) + 1);
			equipo += (byte) (5 + bonus);
		}
		return equipo;
	}
	public static byte segunda() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte equipo = 0;
		byte dado = (byte) (rd.nextInt(100) + 1);
		if (dado < 30) {
			equipo += 0;
		}
		else if (dado < 65) {
			equipo += 1;
		}
		else if (dado < 95) {
		equipo += 2;
		}
		else if (dado < 100) {
			equipo += 3;
		}
		else {
			equipo += 4;
		}
		return equipo;
	}
	public static byte tercera() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte equipo = 0;
		byte dado = (byte) (rd.nextInt(100) + 1);
		if (dado < 36) {
			equipo += 0;
		}
		else if (dado < 90) {
			equipo += 1;
		}
		else if (dado < 100) {
			equipo += 2;
		}
		else {
			equipo += 3;
		}
		return equipo;
	}
	public static byte cuarta() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		byte equipo = 0;
		byte dado = (byte) (rd.nextInt(100) + 1);
		if (dado < 46) {
			equipo += 0;
		}
		else if (dado < 95) {
			equipo += 1;
		}
		else if (dado < 100) {
			equipo += 2;
		}
		else {
			equipo += 3;
		}
		return equipo;
	}
	
	
	public static void copaEntera(ArrayList<Equipo> participantes) {
		ArrayList<Equipo> ganadores = new ArrayList<Equipo>();
		Competicion copa = new Competicion((short) participantes.size(), participantes);
		if (participantes.size() == 1) {
			System.out.println("El ganador del torneo es " + participantes.get(0));
		}
		else {
		if (participantes.size() % 2 == 1) {
			participantes.add(new Equipo("Bye", (byte) 5));
		}
		short iteraciones = (short) (participantes.size()/2);
		Random rd = new Random();
		Equipo local;
		Equipo visitante;
		short aux;
		Scanner sc = new Scanner(System.in);
		
		for (short i=0; i<(iteraciones); i++) {
			aux = (short) rd.nextInt(participantes.size());
			local = participantes.get(aux);
			participantes.remove(local);
			aux = (short) rd.nextInt(participantes.size());
			visitante = participantes.get(aux);
			participantes.remove(visitante);
			
			if (local.getNombre() == "Bye") {
				ganadores.add(visitante);
				System.out.println(visitante.getNombre() + " descansa");
			}
			
			else if (visitante.getNombre() == "Bye") {
				ganadores.add(local);
				System.out.println(local.getNombre() + " descansa");
			}
			
			else {
			byte diferencia = (byte) (local.getCategoria() - visitante.getCategoria());
			byte rlocal;
			byte rvisitante;
			
			switch (diferencia) {
			case 0:
				rlocal = primera();
				rvisitante = primera();
				break;
				
			case -1:
				rlocal = primera();
				rvisitante = segunda();
				break;
				
			case -2:
				rlocal = primera();
				rvisitante = tercera();
				break;
				
			case 1:
				rvisitante = primera();
				rlocal = segunda();
				break;
				
			case 2:
				rvisitante = primera();
				rlocal = tercera();
				break;
				
			default:
				if (diferencia > 0) {
					rvisitante = primera();
					rlocal = cuarta();
				}
				else {
					rlocal = primera();
					rvisitante = cuarta();
				}
				break;
				
			}
			
			System.out.println(local + " " + rlocal + "-" + rvisitante + " " + visitante);
			if (rlocal > rvisitante) {
				ganadores.add(local);
			}
			else if (rvisitante > rlocal) {
				ganadores.add(visitante);
			}
			else {
				byte eleccion;
				do {
				System.out.println("Este programa aún no ha implementado las tandas de penaltis");
				System.out.println("Tendrás que introducir manualmente qué equipo pasa :C");
				System.out.println("(1 para el primer equipo, 2 para el segundo equipo)");
				eleccion = Byte.parseByte(sc.nextLine());
				if (eleccion == 1) {
					ganadores.add(local);
				}
				else {
					ganadores.add(visitante);
				}
				} while (eleccion != 1 && eleccion != 2);
				
			}
			}
			
		}
		System.out.println("--------------------------");
		copaEntera(ganadores);
		}
		
	}

}
