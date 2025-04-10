package ar.edu.unlp.objetos.dos.ejercicio1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario cape, bigote, fabio;
	private Tweet bigoteTweet, bigoteTweet1, fabioTweet, fabioTweetInvalido;
	
	@BeforeEach
	public void setUp() {
		cape = new Usuario("valentincapelli");
		bigote = new Usuario("exBigote");
		fabio = new Usuario("fabioooo66");
		
		bigoteTweet = bigote.tweetear("No es serio");
		bigoteTweet1 = bigote.tweetear("10 palos salio Velasco, andate polentelme");
	}
	
	@Test
	public void tweetearTest() {
		assertEquals(0, cape.getPosts().size());
		
		cape.tweetear("Poco se habla del nivel de SOLANKE actualmente");
		assertEquals(1, cape.getPosts().size());
		
		assertThrows(IllegalArgumentException.class, () -> {
            cape.tweetear(""); // 
        });

        assertThrows(IllegalArgumentException.class, () -> {
            cape.tweetear("a".repeat(200)); 
        });
        
        assertEquals(1, cape.getPosts().size());
	}
	
	@Test
	public void retweetearTest() {
		assertEquals(0, cape.getPosts().size());
		
		cape.retweetear(bigoteTweet);
		fabio.retweetear(bigoteTweet);
		
		assertEquals(1, cape.getPosts().size());
		assertEquals(2, bigoteTweet.getRetweets().size());
	}
	
	@Test
	public void eliminarRetweetTest() {
		assertEquals(0, fabio.getPosts().size());
		
		Retweet fabioRetweet = fabio.retweetear(bigoteTweet);
		fabio.retweetear(bigoteTweet1);
		
		assertEquals(2, fabio.getPosts().size());
		
		fabio.eliminarRetweet(fabioRetweet);
		
		assertEquals(1, fabio.getPosts().size());
	}
	
	@Test
	public void eliminarPostsTest() {
		assertEquals(2, bigote.getPosts().size());
		
		bigote.eliminarPosts();
		
		assertEquals(0, bigote.getPosts().size());
	}
}
