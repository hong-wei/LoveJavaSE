package ThinkingInJava4.arrays;

//: arrays/ArrayOfGenerics.java
// It is possible to create arrays of generics.
import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		List<String>[] ls;
		List[] la = new List[10];
		ls = la; // "Unchecked" warning
		ls[0] = new ArrayList<String>();
		// Compile-time checking produces an error:
		// ! ls[1] = new ArrayList<Integer>();

		// The problem: List<String> is a subtype of Object
		Object[] objects = ls; // So assignment is OK
		// Compiles and runs without complaint:
		objects[1] = new ArrayList<Integer>();

		// However, if your needs are straightforward it is
		// possible to create an array of generics, albeit
		// with an "unchecked" warning:
		List<BerylliumSphere>[] spheres = new List[10];
		for (int i = 0; i < spheres.length; i++)
		{
			spheres[i] = new ArrayList<BerylliumSphere>();
		}
	}
} /// :~