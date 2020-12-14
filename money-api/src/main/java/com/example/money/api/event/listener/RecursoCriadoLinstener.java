package com.example.money.api.event.listener;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.money.api.event.RecursoCriadoEvent;

@Component
public class RecursoCriadoLinstener implements ApplicationListener<RecursoCriadoEvent> {

	@Override
	public void onApplicationEvent(RecursoCriadoEvent recursoCriadoEvent) {
		@SuppressWarnings("unused")
		HttpServletResponse response = recursoCriadoEvent.getResponse();
		@SuppressWarnings("unused")
		Long codigo = recursoCriadoEvent.getCodigo();

	}

	@SuppressWarnings("unused")
	private void adicionarHeaderLocation(HttpServletResponse response, Long codigo) {

		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}").buildAndExpand(codigo).toUri();
		response.setHeader("Location", uri.toASCIIString());
	}
}
