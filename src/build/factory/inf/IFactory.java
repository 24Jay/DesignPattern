package build.factory.inf;

import java.util.List;

public interface IFactory<T>
{
	public T create();
	
	public List<T> createList();
}
