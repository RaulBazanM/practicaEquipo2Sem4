package com.everis.equipo2semana4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo2semana4.service.CorreoService;



@RestController
@RequestMapping("/notificacion")
public class NotificacionesController {
	@Autowired
	private CorreoService correo;

}
