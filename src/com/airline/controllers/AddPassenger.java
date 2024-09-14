package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPassenger
 */
@WebServlet("/AddPassenger")
public class AddPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public AddPassenger() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request
				.getRequestDispatcher("WEB-INF/views/add_passenger.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		request.setAttribute("errors", false);
		Passenger p = new Passenger();
		String firstName = request.getParameter("first-name");
		// Form field first-name validation
		if (firstName.length() == 0) {
			request.setAttribute("errors", true);
			request.setAttribute("firstname_error", true);
			System.out.println("empty first name error");
		} else {
			System.out.print(firstName);
			p.setFirstName(firstName);
		}
		String lastName = request.getParameter("last-name");
		// Form field last-name validation
		if (lastName.length() == 0) {
			request.setAttribute("errors", true);
			request.setAttribute("lastname_error", true);
			System.out.println("empty last name error");

		} else {
			System.out.println(lastName);
			p.setLastName(lastName);
		}
		// dob
		String dob_raw = request.getParameter("dob");
		// Form field dob validation
		String pattern = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(dob_raw);
		if(m.find()) {
			String dobArray[] = dob_raw.split("\\/");
			String month = dobArray[0];
			String day = dobArray[1];
			String year = dobArray[2];

			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, Integer.parseInt(year));
			cal.set(Calendar.MONTH, Integer.parseInt(month)-1);
			cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));

			Date dob = cal.getTime();
			System.out.println(dob);
			p.setDob(dob);
		} else {
			System.out.println("Invalid date of birth");
			request.setAttribute("errors", true);
			request.setAttribute("date_format_error", true);
		}
		

		String gender = request.getParameter("gender");
		System.out.println(gender);
		p.setGender(Gender.valueOf(gender));

		if((Boolean)request.getAttribute("errors")){
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/add_passenger.jsp");
			view.forward(request, response);
		} else {
			ArrayList<Passenger> pList = new ArrayList<Passenger>();
			pList.add(p);
			response.sendRedirect("");
		}

	}

}
