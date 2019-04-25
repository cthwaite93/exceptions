
public class ColourRGB {
	
	private int r;
	private int g;
	private int b;
	
	public ColourRGB(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public void setColour(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public int[] getColour() {
		return new int[] {this.r, this.g, this.b};
	}
	
	public int getB() {
		return b;
	}
	
	public int getG() {
		return g;
	}
	
	public int getR() {
		return r;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void setG(int g) {
		this.g = g;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
}
