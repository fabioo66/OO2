package ar.edu.unlp.objetos.dos.ejercicio4;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class State {

	public void start(ToDoItem toDoItem) {
	}

	public void togglePaused(ToDoItem toDoItem) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en paused o in-progress");	
	}

	public void finish(ToDoItem toDoItem) {
		toDoItem.setState(new Finished());
	}

	public Duration workedTime(ToDoItem toDoItem) {
		Duration duracion = Duration.between(toDoItem.getInicio(), LocalDateTime.now());
		return duracion;
	}
	
	public void addComment(ToDoItem toDoItem, String comment) {
		toDoItem.addToComments(comment);
	}
}
