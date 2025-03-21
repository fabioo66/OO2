package ar.edu.unlp.objetos.dos.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Post> posts;

	public Usuario(String screenName) {
		this.screenName = screenName;
		this.posts = new ArrayList<>();
	}
	
	public List<Post> getPosts() {
		return this.posts;
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	private void agregarPost(Post post) {
		this.posts.add(post);
	}
	
	private boolean cumpleFormato(String text) {
		return text.length() >= 1 && text.length() <= 180; 
	}
	
	public Tweet tweetear(String text) {
	    if (!cumpleFormato(text)) {
	        throw new IllegalArgumentException("El tweet debe tener entre 1 y 180 caracteres");
	    }
	    Tweet tweet = new Tweet(this, text);
	    this.agregarPost(tweet);
	    return tweet;
	}
	
	public Retweet retweetear(Post post) {
		Retweet retweet = new Retweet(this, post);
		this.agregarPost(retweet);
		post.agregarRetweet(retweet);
		// para testear
		return retweet;
	}


	public void eliminarRetweet(Post retweet) {
		this.posts.remove(retweet);
	}

	/*elimina los retweets de las personas que le dieron retweet a mi post */
	private void eliminarRetweetsDeMisPosts() {
		this.posts.stream().
			forEach(post -> post.eliminarReferencias());
	}

	public void eliminarPosts() {
		this.eliminarRetweetsDeMisPosts();
		this.posts.clear();
	}
}
