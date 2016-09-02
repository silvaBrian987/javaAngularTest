package net.bgs.javaAngular.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.bgs.javaAngular.services.MessageDigestService;

public class PasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private MessageDigestService messageDigestService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
