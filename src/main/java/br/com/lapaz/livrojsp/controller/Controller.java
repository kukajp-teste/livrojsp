package br.com.lapaz.livrojsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Controller() {
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
		String email = request.getParameter("email");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Projeto 01</title>");
		out.println("</head>");
		out.println("<body bgcolor='#CCC00' text='000044'>");
		out.println("<h1>Dados Recebidos</h1>");
		out.println("Nome: <b><u>"+nome+"</u></b><br>");
		out.println("E-mail: <b><u>"+email+"</u></b><br>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}
	public String getServletInfo() {
		return "Meu primeiro Servlet";
	}
}
