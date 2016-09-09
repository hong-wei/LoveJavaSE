package ThinkingInJava4.holding;

//: holding/AdapterMethodIdiom.java
// The "Adapter Method" idiom allows you to use foreach
// with additional kinds of Iterables.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T>
{
	private static final long serialVersionUID = 1L;

	public ReversibleArrayList(Collection<T> c)
	{
		super(c);
	}

	public Iterable<T> reversed()
	{
		return new Iterable<T>()
		{
			@Override
			public Iterator<T> iterator()
			{
				return new Iterator<T>()
				{
					int current = size() - 1;

					@Override
					public boolean hasNext()
					{
						return current > -1;
					}

					@Override
					public T next()
					{
						return get(current--);
					}

					@Override
					public void remove()
					{ // Not implemented
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}

public class AdapterMethodIdiom
{
	public static void main(String[] args)
	{
		ReversibleArrayList<String> ral = new ReversibleArrayList<String>(Arrays.asList("To be or not to be".split(" ")));
		// Grabs the ordinary iterator via iterator():
		for (String s : ral)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		// Hand it the Iterable of your choice
		for (String s : ral.reversed())
		{
			System.out.print(s + " ");
		}
	}
} /*
	 * Output: To be or not to be be to not or be To
	 */// :~
