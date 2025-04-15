package ar.edu.unlp.objetos.dos.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private State state;
	private List<String> comments;
	private LocalDateTime inicio;
	private LocalDateTime fin;
	
	public ToDoItem(String name) {
		this.name = name;
		this.comments = new ArrayList<>();
		this.state = new Pending();
	}
	
	protected void setState(State state) {
		this.state = state;
	}
	
	public void start() {
		this.state.start(this);
		this.inicio = LocalDateTime.now();
		
	}
	
	public void togglePaused() {
		this.state.togglePaused(this);
	}
	
	public void finish() {
		this.state.finish(this);
	}
	
	public Duration workedTime() {
		return this.state.workedTime(this);
	}
	
	public void addComment(String comment) {
		this.state.addComment(this, comment);
	}	
	
	public LocalDateTime getInicio() {
		return this.inicio;
	}
	
	public LocalDateTime getFin() {
		return this.fin;
	}
	
	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}
	
	public void addToComments(String comment) {
		this.comments.add(comment);
	}
	
	public State getState() {
		return this.state;
	}
	
	public List<String> getComments(){
		return this.comments;
	}
}
