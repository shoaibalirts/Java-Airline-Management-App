package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.FlightLocal;

/**
 * Servlet implementation class FlightDetails
 */
@WebServlet("/FlightDetails")
public class FlightDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB (beanName="flightStateless")
	private FlightLocal fs;
	
	@EJB (beanName="flightStateless")
	private FlightLocal fs2;
	
	@EJB(beanName="flightStateful")
	private FlightLocal fsStateful;
	
	@EJB(beanName="flightStateful")
	private FlightLocal fsStateful2;
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("The flight details servlet has been called...");

		out.println("Stateless nature of EJB.........");
		out.println("Flight Details: " + fs.getFrom() + " to " + fs.getTo());
		fs2.setFrom("Paris");
		fs2.setFrom("Rom");
		out.println("Flight Details: " + fs.getFrom() + " to " + fs.getTo());
		
		out.println("Stateful nature of EJB.........");
		out.println("Flight Details: " + fsStateful.getFrom() + " to " + fsStateful.getTo());

		fsStateful2.setFrom("Paris");
		fsStateful2.setFrom("Rom");
		out.println("Flight Details: " + fsStateful.getFrom() + " to " + fsStateful.getTo());
		out.println("Flight Details: " + fsStateful2.getFrom() + " to " + fsStateful2.getTo());



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
