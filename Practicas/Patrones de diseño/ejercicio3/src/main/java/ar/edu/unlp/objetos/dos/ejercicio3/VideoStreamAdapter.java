package ar.edu.unlp.objetos.dos.ejercicio3;

public class VideoStreamAdapter implements Media{
	private VideoStream stream;
	
	public VideoStreamAdapter(VideoStream stream) {
		this.stream = stream;
	}
	
	@Override
	public void play() {
		this.stream.reproduce();
	}
}
