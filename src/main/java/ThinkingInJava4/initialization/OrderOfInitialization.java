package ThinkingInJava4.initialization;

import ThinkingInJava4.net.mindview.util.Print;

// When the constructor is called to create a
// Window object, you'll see a message:
class Window
{
	Window(int marker)
	{
		Print.print("Window(" + marker + ")");
	}
}

class House
{
	Window w1 = new Window(1); // Before constructor

	House()
	{
		// Show that we're in the constructor:
		Print.print("House()");
		w3 = new Window(33); // Reinitialize w3
	}

	Window w2 = new Window(2); // After constructor

	void f()
	{
		Print.print("f()");
	}

	Window w3 = new Window(3); // At end
}

public class OrderOfInitialization
{
	public static void main(String[] args)
	{
		House h = new House();
		h.f(); // Shows that construction is done
	}
} /*
	 * Output: Window(1) Window(2) Window(3) House() Window(33) f()
	 */// :~
