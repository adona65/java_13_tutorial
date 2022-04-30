package tutorial_000.languageNewFeatures;

public class _001_TextBlocks {
		/*
		 * Java 13 introduced a preview feature called "Text Blocks". The goal of this feature is to easily handle complex multiline 
		 * strings like JSON/XML/HTML :
		 *   - It allow to write multiline strings without using line breakers like \r\n, or need to escape chars.
		 *   - Text Block string have the same methods as other strings like contains(), indexOf(), length() (it's still a String object).
		 *  
		 * Lets assume we would like to write a string that contains JSon formated text. We would write :
		 */
		   String stringJSON = "{\r\n" 
         		+ "\"Name\" : \"Toto\",\r\n" 
         		+ "\"Registration_number\" : \"32\"\r\n" 
         		+ "}";
		 /*  
		 * With Text Blocks, we just would have to normally type our string (without line breakers or char to escape), and surround 
		 * it with """ (triple double-quote) :
		 	// Commented in order to avoid compilation error with more recent versions of JDK.	
		   	String textBlockJSON = """
	         {
	            "name" : "Toto",
	            "Registration_number" : "32"
	         }
         	""";
		 * 
		 * New methods were also added to String for working with Text Blocks :
		 *   - stripIndent() : removes incidental white spaces from the start and end of the string.
		 *   - translateEscapes() : translate the escape sequences as per the string syntax.
		 *   - formatted() : similar to String format() method to support formatting in text block strings.
		 *   
		 * For example, we may write the previous code snippet like this :
		 	String textBlockJSON = """
	         {
	            "name" : "%s",
	            "Registration_number" : "%s"
	         }
	        """.formatted("Toto", "32");
		 */
}
