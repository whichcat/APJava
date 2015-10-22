package banner;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Banner {
	private List<BannerLine> lines = new ArrayList<BannerLine>();

	/**
	 * Print the banner that is computed earlier
	 * 
	 * @param ps
	 *            - File/Stream into which output is to be written
	 */
	public void printBannerText(PrintStream ps) {

	}

	
	/**
	 * Create a raster of the banner lines that are added so far. Any existing
	 * raster will be removed automatically.
	 */
	public char[][] rasterize() {
		/*
		 * HOW to rasterize
		 * 
		 * Step 1. Find the height of the banner by finding the largest banner
		 * line Step 2. Find the width of the banner by adding all sizes and
		 * multiply by 8. Step 3. Create the new bannerText Step 4. For each
		 * banner line compute the offset to be used (calculateOffset) Step 5.
		 * For each banner line, get the text to be printed Step 5.1 Start at
		 * the offset for the line. Step 5.2 Iterate over each character Step
		 * 5.2.1 Get the PixelArray to be used for each char Step 5.2.2 For each
		 * pixel in the array add to the raster sizexsize times at appropriate
		 * position
		 * 
		 */
		
		BannerLine firstLine = lines.get(0);
		int n = 0;
		for(char x : firstLine.getLine().toCharArray()){
			Font font = firstLine.getFont();
			int width = font.getCharWidth(x);
			n += width + 1;
		}
		char[][] raster = new char[n][8];
		
		int last = n-1;
		
		for(char x : firstLine.getLine().toCharArray()){
			char[][] character = firstLine.getFont().getPixelArray(x);
			for(int r = 0; r < character.length; ++r){
				for(int c = 0; c < 8; ++c){
					 raster[last - ( character.length - r)][c] = character[r][c];
				}
			}
			Font font = firstLine.getFont();
			int width = font.getCharWidth(x);
			last = last - (1 + width);
		}
		
		return raster;
		
	}

	/**
	 * Add a new banner line into the list
	 * 
	 * @param text
	 * @param size
	 * @param f
	 */
	public void addBannerLine(String text, int size, Font f) {
		BannerLine bannerLine = new BannerLine(text, size, f);
		lines.add(bannerLine);
	}

	// public char[][] getPixelArray(char c, Font f) {
	// Font font = f;
	// return font.getPixelArray(c);
	// }

}
