package es.studium.PracticaTema3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hola")
public class HolaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HolaServlet() {
		super();
// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// Establecer el tipo MIME del mensaje de respuesta
		response.setContentType("text/html");
// Crear un flujo de salida para escribir la respuesta a la petición del cliente
		PrintWriter out = response.getWriter();
// Escribir el mensaje de respuesta en formato HTML
		try {
			out.println("<html>");
			out.println("<head><title>Servlet Práctica Tema 3</title></head>");
			out.println("<body>");
			out.println("<h1>Hola, me llamo Jorge Rodríguez</h1>");
// Mostraremos información de la petición del cliente
			out.println("<p>Request UI: " + request.getRequestURI() + "</p>");
			out.println("<p>Protocolo: " + request.getProtocol() + "</p>");
			out.println("<p>Dirección remota: " + request.getRemoteAddr() + "</p>");
// Generar un número aleatorio para cada petición
			out.println("Número aleatorio: <strong>" + Math.random() + "</strong></p>");
			out.println("<a href='index.html'>Volver</a>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// TODO Auto-generated method stub
		doGet(request, response);
	}
}