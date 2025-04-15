package ar.edu.unlp.objetos.dos.ejercicio4;

import java.time.Duration;

public class Pending extends State{

	@Override
	public void start(ToDoItem toDoItem) {
		toDoItem.setState(new InProgress());
	}

	@Override
	public void finish(ToDoItem toDoItem) {
	}

	@Override
	public Duration workedTime(ToDoItem toDoItem) {
		throw new RuntimeException("El objeto ToDoItem no se inicio aun");
	}
}
