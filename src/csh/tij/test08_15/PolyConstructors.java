package csh.tij.test08_15;

public class PolyConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoundGlyph(5);
		new RectangularGlyph(3, 7);
	}

}
class Glyph{
	void draw(){
		System.out.println("Glyph.draw()");
	}
	public Glyph() {
		System.out.println("before draw");
		draw();
		System.out.println("after draw");
	}
}
class RoundGlyph extends Glyph{
	private int radius=1;
	public RoundGlyph(int r) {
		radius=r;
		System.out.println("RoundGlyph.RoundGlyph(),radius="+radius);
	}
	@Override
	void draw() {
		System.out.println("RoundGlyph.draw()="+radius);
	}
}
class RectangularGlyph extends Glyph{
	private int l=2;
	private int w=1;
	public RectangularGlyph(int l, int w) {
		this.l=l;
		this.w=w;
		System.out.println("before draw Rectangular");
		draw();
		System.out.println("after draw Rectangular");
	}
	@Override
	void draw() {
		System.out.println("draw a Rectangular with \nl="+l+"\nw="+w);
	}
}