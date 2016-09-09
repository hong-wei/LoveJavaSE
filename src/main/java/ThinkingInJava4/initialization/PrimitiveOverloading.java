package ThinkingInJava4.initialization;

import ThinkingInJava4.net.mindview.util.Print;

public class PrimitiveOverloading
{
	void f1(char x)
	{
		Print.printnb("f1(char) ");
	}

	void f1(byte x)
	{
		Print.printnb("f1(byte) ");
	}

	void f1(short x)
	{
		Print.printnb("f1(short) ");
	}

	void f1(int x)
	{
		Print.printnb("f1(int) ");
	}

	void f1(long x)
	{
		Print.printnb("f1(long) ");
	}

	void f1(float x)
	{
		Print.printnb("f1(float) ");
	}

	void f1(double x)
	{
		Print.printnb("f1(double) ");
	}

	void f2(byte x)
	{
		Print.printnb("f2(byte) ");
	}

	void f2(short x)
	{
		Print.printnb("f2(short) ");
	}

	void f2(int x)
	{
		Print.printnb("f2(int) ");
	}

	void f2(long x)
	{
		Print.printnb("f2(long) ");
	}

	void f2(float x)
	{
		Print.printnb("f2(float) ");
	}

	void f2(double x)
	{
		Print.printnb("f2(double) ");
	}

	void f3(short x)
	{
		Print.printnb("f3(short) ");
	}

	void f3(int x)
	{
		Print.printnb("f3(int) ");
	}

	void f3(long x)
	{
		Print.printnb("f3(long) ");
	}

	void f3(float x)
	{
		Print.printnb("f3(float) ");
	}

	void f3(double x)
	{
		Print.printnb("f3(double) ");
	}

	void f4(int x)
	{
		Print.printnb("f4(int) ");
	}

	void f4(long x)
	{
		Print.printnb("f4(long) ");
	}

	void f4(float x)
	{
		Print.printnb("f4(float) ");
	}

	void f4(double x)
	{
		Print.printnb("f4(double) ");
	}

	void f5(long x)
	{
		Print.printnb("f5(long) ");
	}

	void f5(float x)
	{
		Print.printnb("f5(float) ");
	}

	void f5(double x)
	{
		Print.printnb("f5(double) ");
	}

	void f6(float x)
	{
		Print.printnb("f6(float) ");
	}

	void f6(double x)
	{
		Print.printnb("f6(double) ");
	}

	void f7(double x)
	{
		Print.printnb("f7(double) ");
	}

	void testConstVal()
	{
		Print.printnb("5: ");
		this.f1(5);
		this.f2(5);
		this.f3(5);
		this.f4(5);
		this.f5(5);
		this.f6(5);
		f7(5);
		Print.print();
	}

	void testChar()
	{
		char x = 'x';
		Print.printnb("char: ");
		this.f1(x);
		this.f2(x);
		this.f3(x);
		this.f4(x);
		this.f5(x);
		this.f6(x);
		f7(x);
		Print.print();
	}

	void testByte()
	{
		byte x = 0;
		Print.printnb("byte: ");
		this.f1(x);
		this.f2(x);
		this.f3(x);
		this.f4(x);
		this.f5(x);
		this.f6(x);
		f7(x);
		Print.print();
	}

	void testShort()
	{
		short x = 0;
		Print.printnb("short: ");
		this.f1(x);
		this.f2(x);
		this.f3(x);
		this.f4(x);
		this.f5(x);
		this.f6(x);
		f7(x);
		Print.print();
	}

	void testInt()
	{
		int x = 0;
		Print.printnb("int: ");
		this.f1(x);
		this.f2(x);
		this.f3(x);
		this.f4(x);
		this.f5(x);
		this.f6(x);
		f7(x);
		Print.print();
	}

	void testLong()
	{
		long x = 0;
		Print.printnb("long: ");
		this.f1(x);
		this.f2(x);
		this.f3(x);
		this.f4(x);
		this.f5(x);
		this.f6(x);
		f7(x);
		Print.print();
	}

	void testFloat()
	{
		float x = 0;
		Print.printnb("float: ");
		this.f1(x);
		this.f2(x);
		this.f3(x);
		this.f4(x);
		this.f5(x);
		this.f6(x);
		f7(x);
		Print.print();
	}

	void testDouble()
	{
		double x = 0;
		Print.printnb("double: ");
		this.f1(x);
		this.f2(x);
		this.f3(x);
		this.f4(x);
		this.f5(x);
		this.f6(x);
		f7(x);
		Print.print();
	}

	public static void main(String[] args)
	{
		PrimitiveOverloading p = new PrimitiveOverloading();
		p.testConstVal();
		p.testChar();
		p.testByte();
		p.testShort();
		p.testInt();
		p.testLong();
		p.testFloat();
		p.testDouble();
	}
} /*
	 * Output: 5: f1(int) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double) char: f1(char) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double) byte:
	 * f1(byte) f2(byte) f3(short) f4(int) f5(long) f6(float) f7(double) short: f1(short) f2(short) f3(short) f4(int) f5(long) f6(float) f7(double) int: f1(int)
	 * f2(int) f3(int) f4(int) f5(long) f6(float) f7(double) long: f1(long) f2(long) f3(long) f4(long) f5(long) f6(float) f7(double) float: f1(float) f2(float)
	 * f3(float) f4(float) f5(float) f6(float) f7(double) double: f1(double) f2(double) f3(double) f4(double) f5(double) f6(double) f7(double)
	 */// :~
