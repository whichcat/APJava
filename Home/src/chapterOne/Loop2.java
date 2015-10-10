package chapterOne;

public class Loop2 {
    public static void main(String[] args){
        int i;
        int count = 0;
        for(i = 12; count < 10 ; i += 3){
            if (i%5 == 0){
                
            }else{
                System.out.println(i);
                count += 1;
            }
        }
        System.out.println(count+" multiples have been printed.");
    }
    
}
