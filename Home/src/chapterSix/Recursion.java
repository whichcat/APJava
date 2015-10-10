package chapterSix;

public class Recursion {
	
	public static void catastrophe(int n){
		if(n==0){
			System.out.println(n);
		}else{
			System.out.println(n);
			catastrophe(n-1);
		}
		
	}
	
	public static void main(String[] args){
		
		int n = 10;
		catastrophe(n);
		
		
	}

}

