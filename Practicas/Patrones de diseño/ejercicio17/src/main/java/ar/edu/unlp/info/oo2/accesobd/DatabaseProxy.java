package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
	private DatabaseAccess databaseAccess;
	private boolean estaAutenticado;
	private String password;
	
	public DatabaseProxy(DatabaseAccess databaseAccess, String password) {
		this.databaseAccess = databaseAccess;
		this.password = password;
		this.estaAutenticado = false;
	}
	
	public void login(String password) {
		if (this.password.equals(password)) {
			this.estaAutenticado = true;
		}
	}
	
	public void logout() {
		this.estaAutenticado = false;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.estaAutenticado) {
			return this.databaseAccess.getSearchResults(queryString);
		}else {
			throw new IllegalStateException("Acceso denegado: usuario no autenticado");
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.estaAutenticado) {
			return this.databaseAccess.insertNewRow(rowData);
		}else {
			throw new IllegalStateException("Acceso denegado: usuario no autenticado");
		}
	}
}
