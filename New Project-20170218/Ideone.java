import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Work m = new Work();
	}
}

class Work{
	String predloj = "Text";
	
	Work(){
		Menu();
	}
	
	void Menu(){
		
		Helper help = new Helper();
		String action = null;
		
		System.out.println("\n\n\nText: " + predloj);
		System.out.println("Enter");
		System.out.println("Run");
		System.out.print("\nterminal <");
		action = help.UI();
		
		switch(action){
			case "$sudo Enter": Enter(); break;
			case "$sudo Run"  : Run()  ; break;
		}
		
	}
	
	void Enter(){
		Helper help = new Helper();
		
		System.out.print("\n\n\n");
		System.out.print("Enter text: ");
		predloj = help.UI();
		
		Menu();
	}
	
	void Run(){
		String []word = predloj.split(" ");
		
		int MaxLength = 0;
		int Longest = 0;
		for(int i = 0; i < word.length; i++){
			int longs = word[i].length();
			
			if(longs > MaxLength){
				MaxLength = longs;
				Longest = i;
			}
		}
		
		System.out.println("\n\n\nWord: " + word[Longest]);
		System.out.println("ABC: " + MaxLength);
		
		Helper help = new Helper();
		String action = help.UI();
		
		if(action.equals("")){
			Menu();
		}
	}
}

class Helper{
	public String UI(){
		String input = null;
		try{
			BufferedReader b = new BufferedReader(new
								InputStreamReader(System.in));
			input = b.readLine();
		} catch(IOException e){
			System.out.print("\n\nERROR");
		}
		return input;
	}
}