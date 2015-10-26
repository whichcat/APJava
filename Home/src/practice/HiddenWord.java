package practice;

public class HiddenWord {
	
	private String actualWord;
	
	public HiddenWord(String word){
		actualWord = word;
	}
	
	public String getHint(String guess){
		String hint = "";
		for (int i = 0; i < guess.length(); ++i){
			char presentChar = guess.charAt(i);
			if( presentChar == actualWord.charAt(i)){
				hint += guess.charAt(i);
			}else {
				
				boolean found = false;
				
				for (int j = 0; j < actualWord.length(); ++j){
					if (presentChar == actualWord.charAt(j)){
						hint += "+";
						found = true;
						break;
					}
				}
				if (found == false){
					hint += "*";
				}
			}
		}
		
		return hint;
	}

}
