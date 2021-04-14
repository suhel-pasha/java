package com.xworkz.it.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlett extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Servlett() {
		// TODO Auto-generated constructor stub
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("method invoked");
		System.out.println(req);
		String colorFromReq = req.getParameter("color");
		String priceFromReq = req.getParameter("price");
		System.out.println(colorFromReq);
		System.out.println(priceFromReq);
		
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("This is my first response");
		writer.println("</h1>");
		writer.println("</br>");
		writer.println("<b>");
		writer.println("The Price is "+priceFromReq+" and the color is "+colorFromReq);
		writer.println("</b>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
		
	}
}
