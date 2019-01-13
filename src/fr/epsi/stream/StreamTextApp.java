package fr.epsi.stream;

/**
 * Sujet : Manipuler un flux de texte depuis un fichier.<br/>
 * Indications :
 * <ul>
 * <li>Extraire toutes les lignes du fichier commençant par "Lorem".</li>
 * <li>Compter et affficher le nombre de ligne trouvée</li>
 * </ul>
 * Résultat attendu : <br/>
 * Lorem iconsectetur adipiscin [...]<br/>
 * Lorem ipsum dolor sit amet, [...]<br/>
 * Lorem ipsum lacus quis pulvi [...]<br/>
 * Lorem sed lobortis non lacus [...]<br/>
 * Lorem ut enim mi. Ut in mi e [...]<br/>
 * Lorem cras porttitor sed nib [...]<br/>
 * <br/>
 * Nombre de lignes trouvées : 6
 */

public class StreamTextApp {
	
	private static final String FILE_NAME = "resources/lorem.txt";
	private static final String PATTERN = "Lorem";
	private static int count = 0;
	
	public static void main( String... args ) {
	
	}
}
