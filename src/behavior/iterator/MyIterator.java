package behavior.iterator;

import java.util.Iterator;



public class MyIterator<E> implements Iterator<E>
{

	@Override
	public boolean hasNext()
	{
		return false;
	}

	@Override
	public E next()
	{
		return null;
	}

}
