package com.login.usuarios.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.login.usuarios.service.UserService;

@Controller
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.OPTIONS}, allowedHeaders = {"Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method", "Access-Control-Request-Headers"}, exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
public class HomeController {
	
	private static final Logger logger =  LogManager.getLogger(HomeController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String principal() {
		logger.info("******************** INICIALIZACION DEL PROYECTO ********************");
		return "redirect:/login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView home(@RequestParam(value= "token", required= false)String token) {
		ModelAndView view = new ModelAndView("login2");
		return view;
	}

	@RequestMapping(value="/exit", method = RequestMethod.GET)
	public String failure(HttpServletRequest request) {
		request.getSession().invalidate();
		logger.info("********************** CERRO SESSION *******************************");
		return "login2";
	}
	
	@RequestMapping(value="/denied", method = RequestMethod.GET)
	public String sinPermiso() {
		logger.info("No tiene permiso para acceder");
		return "denied";
	}
	
	@RequestMapping(value="/adminSistemas", method = RequestMethod.GET)
	public ModelAndView adminSistemas(Model model) {
		logger.info("********************** ENTRO A LA PAGINA ADMIN SISTEMAS ********************");
		ModelAndView modelAndView = new ModelAndView("adminSistemas/adminSistemas");
		return modelAndView;
	}
}
