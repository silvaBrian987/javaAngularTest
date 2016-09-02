package net.bgs.javaAngular.web.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.bgs.javaAngular.services.MessageDigestService;

@Controller
@RequestMapping("/password")
public class PasswordController {
	private static final Logger log = Logger.getLogger(PasswordController.class);
	
	@Autowired
	private MessageDigestService messageDigestService;

	@RequestMapping("/")
	public ModelAndView ejemplo() {
		return new ModelAndView("password");
	}

	@RequestMapping(value = "/encriptar", method = RequestMethod.POST)
	public @ResponseBody String encriptar(@RequestParam("mensaje") String mensaje, @RequestParam("hash") String hash) throws Exception {
		String encriptedMessage = messageDigestService.getMD5Hash(mensaje);
		//log.info(hash);
		//log.info(encriptedMessage);
		return hash;
	}
}
