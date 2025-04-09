# Ejercicio 3

Dado el siguiente código implementado en la clase Document y que calcula algunas estadísticas del mismo:

```java
public class Document {
    List<String> words;
  
    public long characterCount() {
		 	long count = this.words
					.stream()
					.mapToLong(w -> w.length())
					.sum();
			return count;
		}
		
    public long calculateAvg() {
    	long avgLength = this.words
						.stream()
						.mapToLong(w -> w.length())
						.sum() / this.words.size();
		 	return avgLength;
		}
// Resto del código que no importa
}

```

### Code smells

- La variable “words” es publica. Rompe el encapsulamiento
- En el metodo calculateAvg() se repite la logica del metodo characterCount()

### Solucion

- Extract method

```java
public class Document {
    private List<String> words;
  
    public long characterCount() {
		 	long count = this.words
					.stream()
					.mapToLong(w -> w.length())
					.sum();
			return count;
		}
		
    public long calculateAvg() {
    	long avgLength = this.words.characterCount() / this.words.size();
		 	return avgLength;
		}
		
		public List<String> getWords() {
        return new ArrayList<>(this.words); 
    }

    public void setWords(List<String> words) {
        this.words = new ArrayList<>(words);
    }
// Resto del código que no importa
}
```

### Code smells

- Variables innecesarias en los metodos characterCount() y calculateAvg()

### Solucion

- Replace temp with query

```java
public class Document {
    private List<String> words;
  
    public long characterCount() {
		 	return this.words
					.stream()
					.mapToLong(w -> w.length())
					.sum();
		}
		
    public long calculateAvg() {
    	return this.words.characterCount() / this.words.size();
		}
		
		public List<String> getWords() {
        return new ArrayList<>(this.words); 
    }

    public void setWords(List<String> words) {
        this.words = new ArrayList<>(words);
    }
// Resto del código que no importa
}
```

### Code smells

- Comments

### Solucion

- Eliminar comentarios que no aportan nada al codigo

```java
public class Document {
    private List<String> words;
  
    public long characterCount() {
		 	return this.words
					.stream()
					.mapToLong(w -> w.length())
					.sum();
		}
		
    public long calculateAvg() {
    	return this.words.characterCount() / this.words.size();
		}
		
		public List<String> getWords() {
        return new ArrayList<>(this.words); 
    }

    public void setWords(List<String> words) {
        this.words = new ArrayList<>(words);
    }
}
```

3_ Si, existe un problema en el metodo calculateAvg(). El problema esta cuando se realiza “.mapToLong(w -> w.length()).sum() / this.words.size();” si el tamaño de la lista es = 0, ocurriria un error de division. No lo podemos solucionar ya que estamos haciendo refactoring. En refactoring solo cambiamos el codigo sin afectar su comportamiento