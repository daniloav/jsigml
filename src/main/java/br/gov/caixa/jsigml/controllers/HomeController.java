package br.gov.caixa.jsigml.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/index.html")
	public String home() {
	return "index";
	}
	
	@RequestMapping("/login.html")
	public String login() {
	return "login";
	}
	
	@RequestMapping("/404.html")
	public String notFound() {
	return "404";
	}
	
	@RequestMapping("/blank.html")
	public String blank() {
	return "blank";
	}
	
	@RequestMapping("/charts.html")
	public String charts() {
	return "charts";
	}
	
	@RequestMapping("/forgot-password.html")
	public String forgot() {
	return "forgot-password";
	}
	
	@RequestMapping("/register.html")
	public String register() {
	return "register";
	}
	
	@RequestMapping("/tables.html")
	public String tables() {
	return "tables";
	}
	
	@RequestMapping("/manutencao.html")
	public String manutencao() {
	return "manutencao";
	}


}
