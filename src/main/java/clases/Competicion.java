package clases;

import java.util.ArrayList;
import java.util.Random;

public class Competicion {
	private short participantes;
	private ArrayList<Equipo> equipos;
	
	public Competicion (short participantes, ArrayList<Equipo> equipos) {
		this.participantes = participantes;
		this.equipos = equipos;
	}

	public short getParticipantes() {
		return participantes;
	}

	public void setParticipantes(byte participantes) {
		this.participantes = participantes;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	
	public void eliminar(Equipo eliminado) {
		this.equipos.remove(eliminado);
	}
	
	public String toString() {
		return "Participantes: " + equipos.toString();
	}

}
