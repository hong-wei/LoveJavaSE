//: polymorphism/PrivateOverride.java
// Trying to override a private method.
package ThinkingInJava4.polymorphism;

import static ThinkingInJava4.net.mindview.util.Print.print;

public class PrivateOverride
{
	private void f()
	{
		print("private f()");
	}

	public static void main(String[] args)
	{
		PrivateOverride po = new Derived();
		po.f();
	}
}

class Derived extends PrivateOverride
{
	public void f()
	{
		print("public f()");
	}

	public static void main(String[] args)
	{
		PrivateOverride po = new Derived();
		// po.f();
	}
} /*
	 * Output: private f()
	 */// :~
