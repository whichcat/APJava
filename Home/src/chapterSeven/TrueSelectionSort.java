package chapterSeven;

public class TrueSelectionSort {
	
	public static void printArray(int a[]){
		System.out.print("[ ");
		for(int index = 0; index < a.length; ++index){
			System.out.print(a[index]+" ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args){
		
		int a[] = {7,3,1,4};
		
		int index = 0;
		for(index = 0; index < a.length-1;++index) {
			for(int i = index+1; i < a.length; ++i){
				if(a[i] < a[index]){
					int temp = a[i];
					a[i] = a[index];
					a[index] = temp;
				}
			}
		}
		printArray(a);
	}

}
