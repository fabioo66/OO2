package ar.edu.unlp.objetos.dos.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetweetTest {
	private Usuario cape;
	private Usuario valen;
	private Usuario fabio;
	private Usuario frabigol;
	private Retweet capeRetweet;
	private Tweet tweetFrabigol;
	
	@BeforeEach
	public void setUp() {
		cape = new Usuario("valentincapelli");
		valen = new Usuario("valenaruanno");
		fabio = new Usuario("fabiooo66");
		frabigol = new Usuario("frabigol");
		
		tweetFrabigol = new Tweet(frabigol, "asdadasd");
		
		capeRetweet = cape.retweetear(tweetFrabigol);
		fabio.retweetear(capeRetweet);
		valen.retweetear(capeRetweet);
		
		fabio.tweetear("CAPEEEEE");
		valen.tweetear("AGUANTE CRISTINA");
	}
	
	@Test
	public void eliminarReferenciasTest() {
		assertEquals(2, this.fabio.getPosts().size());
		assertEquals(2, this.valen.getPosts().size());
		assertEquals(1, this.cape.getPosts().size());
		this.cape.eliminarPosts();
		assertEquals(1, this.fabio.getPosts().size());
		assertEquals(1, this.valen.getPosts().size());
		assertEquals(0, this.cape.getPosts().size());
	}
}
