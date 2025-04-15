package ar.edu.unlp.objetos.dos.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	private ToDoItem tareaPendiente;
	private ToDoItem tareaEnProgreso;
	private ToDoItem tareaPausada;
	private ToDoItem tareaFinalizada;
	
	@BeforeEach
	public void setUp() {
		this.tareaPendiente = new ToDoItem("tareaPendiente");
		
		this.tareaEnProgreso = new ToDoItem("tareaEnProgreso");
		this.tareaEnProgreso.start();
		
		this.tareaPausada = new ToDoItem("tareaPausada");
		this.tareaPausada.start();
		this.tareaPausada.togglePaused();
		
		this.tareaFinalizada = new ToDoItem("tareaFinalizada");
		this.tareaFinalizada.start();
		this.tareaFinalizada.finish();
	}
	
	@Test
	public void startTest() {
		this.tareaPendiente.start();
		assertTrue(this.tareaPendiente.getState() instanceof InProgress);
		
		this.tareaEnProgreso.start();
		assertTrue(this.tareaEnProgreso.getState() instanceof InProgress);
		
		this.tareaPausada.start();
		assertTrue(this.tareaPausada.getState() instanceof Paused);
		
		this.tareaFinalizada.start();
		assertTrue(this.tareaFinalizada.getState() instanceof Finished);
	}
	
	@Test
	public void togglePausedTest() {
		assertThrows(RuntimeException.class, () -> { this.tareaPendiente.togglePaused();});
		
		this.tareaEnProgreso.togglePaused();
		assertTrue(this.tareaEnProgreso.getState() instanceof Paused);
		
		this.tareaPausada.togglePaused();
		assertTrue(this.tareaPausada.getState() instanceof InProgress);
		
		assertThrows(RuntimeException.class, () -> { this.tareaFinalizada.togglePaused();});
	}
	
	@Test
	public void finishTest() {
		this.tareaPendiente.finish();
		assertTrue(this.tareaPendiente.getState() instanceof Pending);
		
		this.tareaEnProgreso.finish();
		assertTrue(this.tareaEnProgreso.getState() instanceof Finished);
		
		this.tareaPausada.finish();
		assertTrue(this.tareaPausada.getState() instanceof Finished);
		
		this.tareaFinalizada.finish();
		assertTrue(this.tareaFinalizada.getState() instanceof Finished);
	}
	
	@Test
	public void workedTimeTest() {
		assertThrows(RuntimeException.class, () -> { this.tareaPendiente.workedTime();});
		
		this.tareaEnProgreso.workedTime();
		assertTrue(this.tareaEnProgreso.getFin() == null);
		
		this.tareaPausada.workedTime();
		assertTrue(this.tareaPausada.getFin() == null);
		
		this.tareaFinalizada.workedTime();
		assertTrue(this.tareaFinalizada.getFin() != null);
	}
	
	@Test
	public void addCommentTest() {
		this.tareaPendiente.addComment("SOY UN COMENTARIO");
		assertEquals(1, this.tareaPendiente.getComments().size());
		
		this.tareaEnProgreso.addComment("SOY UN COMENTARIO");
		assertEquals(1, this.tareaEnProgreso.getComments().size());
		
		this.tareaPausada.addComment("SOY UN COMENTARIO");
		assertEquals(1, this.tareaPausada.getComments().size());
		
		this.tareaFinalizada.addComment("SOY UN COMENTARIO");
		assertEquals(0, this.tareaFinalizada.getComments().size());
	}
}
