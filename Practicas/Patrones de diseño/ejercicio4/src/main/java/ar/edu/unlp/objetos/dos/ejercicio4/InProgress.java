package ar.edu.unlp.objetos.dos.ejercicio4;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress extends State{

	@Override
	public void togglePaused(ToDoItem toDoItem) {
		toDoItem.setState(new Paused());
	}
}
