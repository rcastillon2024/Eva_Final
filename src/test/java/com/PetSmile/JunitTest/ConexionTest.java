package com.PetSmile.JunitTest;

import static org.junit.Assert.fail;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import utils.Conexion;

public class ConexionTest {
	
	public ConexionTest() {}
	
	@BeforeClass
	public static void setUpClass() {}
	
	@AfterClass
	public static void tearDownClass() {}
	
	@Before
	public void setUp() {}
	
	@After
	public void tearDown() {}
	
	@Test
	public void testConexion() {
		
		System.out.println("Prueba coneccion DB");
		
		try {
		Conexion con=new Conexion();
		con.conectar();
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}

}
