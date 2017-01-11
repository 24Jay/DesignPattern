package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator
{
	public static void main(String []args)
	{
		String[] sList = {"Hello","This","is","Iterator","!"};
		List<String> aList = Arrays.asList(sList);
		System.out.println("#################################");
		Iterator<String> iterator = aList.iterator();
		while(iterator.hasNext())
			System.out.println("Element = "+iterator.next());
	}
}
	
