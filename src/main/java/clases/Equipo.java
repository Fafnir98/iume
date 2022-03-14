package clases;

public class Equipo {
	private String nombre;
	private short nivel;
	private byte categoria;
	private byte golesMarcados;
	private byte golesRecibidos;
	
	public Equipo (String nombre, short nivel, byte categoria){
		this.nombre = nombre;
		this.nivel = nivel;
		this.categoria = categoria;
	}
	
	public Equipo (String nombre, short nivel) {
		this.nombre = nombre;
		this.nivel = nivel;
	}
	
	public Equipo (String nombre, byte categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public short getNivel() {
		return nivel;
	}

	public void setNivel(byte nivel) {
		this.nivel = nivel;
	}

	public byte getCategoria() {
		return categoria;
	}

	public void setCategoria(byte categoria) {
		this.categoria = categoria;
	}

	public byte getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(byte golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public byte getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(byte golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	
	public String toString() {
		return nombre;
	}

}
