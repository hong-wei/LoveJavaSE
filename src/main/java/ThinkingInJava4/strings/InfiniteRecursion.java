package ThinkingInJava4.strings;

//: strings/InfiniteRecursion.java
// Accidental recursion.
// {RunByHand}
import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion
{
	@Override
	public String toString()
	{
		// return " InfiniteRecursion address: " + super.toString() + "\n";
		return " InfiniteRecursion address: " + this + "\n";
	}

	public static void main(String[] args)
	{
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++)
		{
			v.add(new InfiniteRecursion());
		}
		System.out.println(v);
	}
} /// :~
