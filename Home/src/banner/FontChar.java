package banner;

public class FontChar {
	private char[][] pixelArray;
	
	/**
	 * Transpose and save the pixel array
	 * 
	 * @param horizontalPixelArray
	 */
	public FontChar(char[][] horizontalPixelArray) {
		int transposedRowCount = horizontalPixelArray[0].length;
		pixelArray = new char[transposedRowCount][horizontalPixelArray.length];
		for(int r = 0; r < horizontalPixelArray.length; ++r){
			for(int c = 0; c < horizontalPixelArray[0].length; ++c){
				pixelArray[(transposedRowCount - 1) - c][r] = horizontalPixelArray[r][c];
			}
		}
	}
	
	public int getSize() {
		return pixelArray.length;
	}
	
	public char[][] getPixelArray(){
		return pixelArray;
	}
	
	public int getWidth(){
		return pixelArray[0].length;
	}
	
}
