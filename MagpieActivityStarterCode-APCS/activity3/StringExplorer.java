package activity3;

/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White; Edited by Sammy Jia
 * @version April 2012; Revised 1/14/16
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int notFoundPsn = sample.indexOf("slow");
		System.out.println ("sample.indexOf(\"slow\") = " + notFoundPsn);
		int firstIndexOf = sample.indexOf("h");
		System.out.println ("sample.indexOf(\"h\") = " + firstIndexOf);
		int secondIndexOf = sample.indexOf("h", 2);
		System.out.println ("sample.indexOf(\"h\", 2) = " + secondIndexOf);

	}

}
