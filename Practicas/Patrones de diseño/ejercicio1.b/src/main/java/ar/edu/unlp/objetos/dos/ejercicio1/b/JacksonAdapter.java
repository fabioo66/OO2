package ar.edu.unlp.objetos.dos.ejercicio1.b;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter extends VoorheesExporter {

	@Override
	public String exportar(List<Socio> socios) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			throw new RuntimeException("Error serializando con Jackson", e);
		}
	}
}