package banner;

public class Test {
	public static void main(String[] args) {
		Font a = new Font("/Users/vineelavandanapu/git/Home/src/banner/Font.txt");
		Banner b = new Banner();
		b.addBannerLine("cat", 0, a);
	}

}
