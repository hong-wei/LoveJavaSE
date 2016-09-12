package ThinkingInJava4.polymorphism;

//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.
import static ThinkingInJava4.net.mindview.util.Print.print;

class Glyph
{
	void draw()
	{
		print("Glyph.draw()");
	}

	Glyph()
	{
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph
{
	private int radius = 1;

	RoundGlyph(int r)
	{
		radius = r;
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	@Override
	void draw()
	{
		print("RoundGlyph.draw(), radius = " + radius);
	}
}

public class PolyConstructors
{
	public static void main(String[] args)
	{
		new RoundGlyph(5);
	}
} /*
	 * Output: Glyph() before draw() RoundGlyph.draw(), radius = 0 Glyph() after draw() RoundGlyph.RoundGlyph(), radius = 5
	 */// :~