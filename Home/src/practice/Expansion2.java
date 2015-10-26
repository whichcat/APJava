package practice;

public class Expansion2 {
	public final static char HYPHEN = '-';
	
	public static String giveExpansion(char target, char end) {
		String output = "";
		if (target < end)
			for(char x = (char)(target + 1); x <= end - 1; ++x){
				output = output + x;
			}
		else
			for(char x = (char)(target - 1); x >= end + 1; --x){
				output = output + x;
			}
		return output;
	}
	
	public static void main (String[] args){
		
		String input = "a-f0-5A-FG-A";	
		String output = ""+input.charAt(0);
		
		for (int c = 1; c < input.length() - 1; ++c){
			if(input.charAt(c) == HYPHEN){
				
				char target = input.charAt(c - 1);
				char end = input.charAt(c + 1);
				
				if((target >= 'a' && target <= 'z' && end >= 'a' && end <= 'z') || 
				   (target >= 'A' && target <= 'Z' && end >= 'A' && end <= 'Z') ||
				   (target >= '0' && target <= '9' && end >= '0' && end <= '9'))
				{
					output += giveExpansion(target, end);
				} else {
					output = output + c;
				}
			} else {
				output += input.charAt(c);
			}
		}
		output += input.charAt(input.length()-1);
		System.out.println(output);
	}

}
