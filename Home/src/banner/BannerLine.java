package banner;

public class BannerLine {
	
	public enum Alignment {
		LEFT, RIGHT, CENTER
	};
	
	private String line;
	private Font font;
	private int size;
	private int offset;
	private int alignment;
	private int spacing = 2;
	
	BannerLine(String text, int size, Font f){
		this.line = text;
		this.size = size;
		this.font = f;
		this.offset = 0;
	}
	
	public String getLine(){
		return this.line;
	}
	
	public Font getFont(){
		return this.font;
	}
	
	
	public int getSize() {
		return size;
	}

	/**
	 * When this method is called, each line is expected to compute an offset for itself
	 * based on the total length
	 * 
	 * @param totalLength
	 */
	private int calculateOffset(int totalLength) {
		return 0;
	}

	
}
