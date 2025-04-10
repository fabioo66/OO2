package ar.edu.unlp.objetos.dos.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaPlayerTest {
	private MediaPlayer mediaPlayer;
	private Audio audio;
	private VideoFile videoFile;
	private VideoStreamAdapter videoStreamAdapter;
	
	@BeforeEach
	public void setUp() {
		audio = new Audio();
		videoFile = new VideoFile();
		videoStreamAdapter = new VideoStreamAdapter(new VideoStream());
		mediaPlayer = new MediaPlayer();
		
		mediaPlayer.agregarMedia(audio);
		mediaPlayer.agregarMedia(videoFile);
		mediaPlayer.agregarMedia(videoStreamAdapter);
	}
	
	@Test
	public void play() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));

		mediaPlayer.play();
		
		System.setOut(originalOut);

		String salida = outContent.toString();

		assertTrue(salida.contains("Reproduciendo audio..."));
		assertTrue(salida.contains("Reproduciendo video..."));
		assertTrue(salida.contains("Reproduciendo video streaming..."));
	}
}
