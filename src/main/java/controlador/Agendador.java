package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;

import dao.daoAgenda;

/**
 * Servlet implementation class Agendador
 */
public class Agendador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Agendador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");

        String rutDueno, nombreMascota, hora, fecha,  msg = null;
        int idMascota;

        //1: recibir parámetro
        idMascota = Integer.parseInt(request.getParameter("idMascota"));
        rutDueno  = request.getParameter("rutDueno");
        nombreMascota  = request.getParameter("nombreMascota");
        hora = request.getParameter("hora");
        fecha = request.getParameter("fecha");
      
        //2: agendar
        try {
			if(daoAgenda.agregar(idMascota,rutDueno,nombreMascota,hora,fecha)>0) {
				msg = "Reserva Agendada";
			}else {
				msg = "No se pudo registrarAgenda";
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

        //3: ejecutar lógica de negocio
        msg = msg.toUpperCase();

        //4: seleccionar próxima vista
        RequestDispatcher despachador = request.getRequestDispatcher("/mensaje.jsp");

        //5: preparar los datos para vista seleccionada
        request.setAttribute("mensaje", msg);

        //6: despachar
        despachador.forward(request, response);
	}

}
