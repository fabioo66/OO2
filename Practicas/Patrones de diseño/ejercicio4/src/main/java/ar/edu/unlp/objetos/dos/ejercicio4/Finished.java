package ar.edu.unlp.objetos.dos.ejercicio4;

import java.time.Duration;
import java.time.LocalDateTime;

public class Finished extends State{

	@Override
	public void finish(ToDoItem toDoItem) {
	}

	@Override
	public Duration workedTime(ToDoItem toDoItem) {
		toDoItem.setFin(LocalDateTime.now());
		Duration duracion = Duration.between(toDoItem.getInicio(), toDoItem.getFin());
		return duracion;
	}

	@Override
	public void addComment(ToDoItem toDoItem, String comment) {
	}
	
}
