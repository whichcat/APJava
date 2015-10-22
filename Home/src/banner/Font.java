package banner;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Font {

	private FontChar[] chars = new FontChar[128];

	/**
	 * Read the font from the file and construct the font chars
	 * 
	 * Read 8 lines at a time, to create the FontChar.
	 * 
	 * @param filename
	 */
	public Font(String filename) {
		try {
			int i = 0; // counts the line number
			int n = 0; // counts the index for eight_lines
			int f = 0; // counts the index for chars
			int longest = 0; //saves the longest length of the character

			FileReader fileReader;
			fileReader = new FileReader(filename);
			BufferedReader reader = new BufferedReader(fileReader);
			
			String[] eight_lines = new String[8];

			while (true) {
				eight_lines[n] = reader.readLine();
				if (eight_lines[n] == null) {
					break;
				}
				if (eight_lines[n].length() > longest){
					longest = eight_lines[n].length();
				}
				
				i++;
				n++;
				if (i % 8 == 0) {
					
					// Convert the eight_lines into a matrix
					char[][] arrayobj = new char[8][longest];
					
					//System.out.println("Longest is "+longest);
					
					for(int row = 0; row < 8; ++row){
						for(int col=0; col < longest; ++col) {
							
							if(col >= eight_lines[row].length())
								arrayobj[row][col] = ' ';
							else 
								arrayobj[row][col] = eight_lines[row].charAt(col);
						}
					}
					// -- End of conversion
							
					chars[f] = new FontChar(arrayobj);
					eight_lines = new String[8];
					f++;
					n = 0;
					longest = 0;
				}

			}
			reader.close();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public int getCharWidth(char c) {
		int asciiValueofC = (int)c;
		FontChar fc = chars[asciiValueofC];
		return fc.getWidth();
	}

	public char[][] getPixelArray(char c) {
		int asciiValueofC = (int)c;
		FontChar fc = chars[asciiValueofC];
		return fc.getPixelArray();
	}
}
