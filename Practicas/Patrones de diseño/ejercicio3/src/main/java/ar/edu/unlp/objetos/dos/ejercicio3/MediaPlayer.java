package ar.edu.unlp.objetos.dos.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	private List<Media> medias;
	
	public MediaPlayer() {
        this.medias = new ArrayList<>();
    }
	
	public void agregarMedia(Media media) {
		medias.add(media);
	}
	
	public void play() {
		medias.stream().forEach(media -> media.play());
	}
}
