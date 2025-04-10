package ar.edu.unlp.objetos.dos.ejercicio1.b;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.*;

public class JsonSimpleAdapter extends VoorheesExporter{
	
	private JSONObject crearJSONSocio(Socio socio) {
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("nombre", socio.getNombre());
		jsonObject.put("email", socio.getEmail());
		jsonObject.put("legajo", socio.getLegajo());
		
		return jsonObject;
	}
	
	@Override
	public String exportar(List<Socio> socios) {
		JSONArray arrayJSON = new JSONArray();
		socios.stream().forEach(socio -> arrayJSON.add(this.crearJSONSocio(socio)));
		return arrayJSON.toJSONString();
	}
}
