package modelo;

import java.sql.Date;

public class Agenda {
	
	int idMascota;
	String rutDueno, nombreMascota;
	Date fecha, hora;
	public Agenda() {
		
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String getRutDueno() {
		return rutDueno;
	}
	public void setRutDueno(String rutDueno) {
		this.rutDueno = rutDueno;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	

	
	
	
	
	
}
