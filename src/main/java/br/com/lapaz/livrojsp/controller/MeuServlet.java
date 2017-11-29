package br.com.lapaz.livrojsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MeuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MeuServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String sexo = request.getParameter("sexo");
		String idade = request.getParameter("idade");
		String [] musica = request.getParameterValues("musica");
		if(musica == null) musica = new String[0];
		String descricao = request.getParameter("descricao");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Projeto 3.2</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h2>Seu Perfil</h2>");
		out.println("<table border='1'>");
		out.println("<tr><td>Nome:</td><td>"+nome+"</td></tr>");
		out.println("<tr><td>Sexo:</td><td>"+sexo+"</td></tr>");
		out.println("<tr><td>Idade:</td><td>"+idade+"</td></tr>");
		out.println("<tr><td>Preferencias Musicais:</td><td><ul>");
		for(int i = 0;i<musica.length;i++) {
			out.println("<li>"+musica[i]);
		}
		out.println("</ul></td></tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
	}

}
