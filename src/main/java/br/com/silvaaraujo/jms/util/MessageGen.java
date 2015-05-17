package br.com.silvaaraujo.jms.util;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.silvaaraujo.jms.ProducerTest;


@WebServlet(urlPatterns="/messageGen")
public class MessageGen extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProducerTest producer;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		gerarMensagem();
	}
	
	private void gerarMensagem() {
		producer.produzirMensagem();
	}
	
}