package chapterSeven;

public class InsertionSort {
	
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
			
			int minValue = a[index];
			int minIndex = index;
			for(int i = index+1; i < a.length; ++i){
				if(a[i] < minValue){
					minValue = a[i];
					minIndex = i;
				}
			}
			
			for(int i = minIndex; i > index; --i){
				a[i] = a[i-1];	
			}
			
			a[index] = minValue;
			
		}
		
		printArray(a);
	}

}
