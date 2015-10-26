package practice;

public class Expansion {
	
	public static void main (String[] args){
		
		char condition = '-';
		
		//String[] uppercaseLetters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
			//	"O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		//String[] lowercaseLetters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
			//	"o","p","q","r","s","t","u","v","w","x","y","z",};
		
		//int[] numbers = {0,1,2,3,4,5,6,7,8,9};
		
		String input = "a-f";
		
		String output = "";
		
		for (int c = 0; c < input.length()-1; ++c){
			if(input.charAt(c+1) == condition){
				
				char target = input.charAt(c);
				char end = input.charAt(c + 2);
				
				if(target >= 'a' && target <= 'z' && end >= 'a' && end <= 'z'){
					for(char x = target; x <= end; ++x){
						output = output + x;
					}
					
				}else if(target >= 'A' && target <= 'Z' && end >= 'A' && end <= 'Z'){
					for(char x = target; x <= end; ++x){
						output = output + x;
					}
					
				}else if(target >= '0' && target <= '9' && end >= '0' && end <= '9'){
					for(char x = target; x <= end; ++x){
						output = output + x;
					}
					
				}else{
					
					output = output + c;
					
				}
				
			}
			
		}
			System.out.println(output);
	}

}
