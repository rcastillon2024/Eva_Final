package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Agenda;
import utils.Conexion;

public class daoAgenda {

public static int agregar(int idMascota, String rutDueno, String nombreMascota,String hora, String fecha ) {
		
		Connection con;
				
		PreparedStatement ps;
		ResultSet rs;
		String us = "";
		int agregado = 0;
		
		try {
			Conexion cn=new Conexion();
			con = cn.conectar();
			ps = con.prepareStatement("INSERT INTO agenda VALUES(null,?,?,?,?,?)");
			ps.setLong(1,idMascota);
			ps.setString(2,rutDueno);
			ps.setString(3,nombreMascota);
			ps.setString(4,hora);
			ps.setString(5,fecha);
			ps.executeUpdate();
			cn.desconectar();
			agregado = 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
	
		}
		
		return agregado;
		
	}
	  
	
}
