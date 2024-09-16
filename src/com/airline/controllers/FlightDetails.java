package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.FlightService;

/**
 * Servlet implementation class FlightDetails
 */
@WebServlet("/FlightDetails")
public class FlightDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private FlightService fs;

	@EJB
	private FlightService fs2;
	
	@EJB
	private FlightService fs3;
	
	@EJB
	private FlightService fs4;
	
	@EJB
	private FlightService fs5;
	
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
		
		fs.setFrom("London");
		out.println(fs.getFrom());
		
		fs2.setFrom("Rom");
		out.println(fs.getFrom());
		
		fs3.setFrom("New York");
		out.println(fs.getFrom());
		
		fs4.setFrom("Paris");
		out.println(fs.getFrom());
		
		fs5.setFrom("San Francisco");
		out.println(fs.getFrom());
	
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
