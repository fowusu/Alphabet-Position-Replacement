package alphabet.alphabet;
import java.io.PrintStream;
import java.util.stream.*;

public class abc {
	


	
	    public static void main( String[] args )
	    {
	    	
	    	String abc ="This NETbuilder assessment is way too easy.";
	    	
	    	abc.chars()
	    	          .filter(Character::isAlphabetic)
	    			  .mapToObj(c -> (char) c)
	    			  .map(c -> Character.toLowerCase(c) - 96)
	    			  .map(c -> c.hashCode() )
	    			  .forEach(System.out::println);
	    	
	    }
	

}
