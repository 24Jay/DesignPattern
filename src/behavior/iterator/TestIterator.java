package behavior.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/**
 * 提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示
 * @author jay
 *
 */
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
	
