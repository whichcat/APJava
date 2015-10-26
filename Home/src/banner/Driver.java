package banner;

public class Driver {

	/**
	 * Driver program is expected to do the following: 
	 * 
	 * Main Task
	 * 
	 * 1. Create a new banner object and font.
	 * 2. Add banner lines based on the arguments.
	 * 3. Request the Banner to be drawn (rasterized)
	 * 4. Print the banner on screen. 
	 * 
	 * Follow-up tasks
	 * 
	 * 1. Allow setting a different font for each line.
	 * 2. Ability to write to a file instead of output.
	 * 3. Anti-aliasing the output (Super advanced and requires graphics context)
	 *    and requires more math
	 *    
	 * @param args
	 */
	public static void main(String[] args) {
		
		Font a = new Font("/Users/vineelavandanapu/git/Home/src/banner/Font.txt");
		Banner b = new Banner();
		b.addBannerLine("Madhuri+Eswar", 3, a);
		char[][] charArray = b.rasterize();
		
		for (int i=0;i<charArray.length; ++i) {
			for(int j=0;j<charArray[i].length; ++j) {
				System.out.print(charArray[i][j]);
			}
			System.out.println();
		}
		
		// System.out.println(a.getCharWidth('a'));

	}

}
