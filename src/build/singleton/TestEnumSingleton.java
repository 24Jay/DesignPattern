package build.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestEnumSingleton
{

	public static void main(String []ar) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		
		
		Class<?> cl = EnumSingleton.class;
		Constructor<EnumSingleton> con = (Constructor<EnumSingleton>) cl.getDeclaredConstructor(null);
		con.setAccessible(true);
		EnumSingleton a = con.newInstance();
		EnumSingleton b = con.newInstance();
		System.out.println("a==b"+(a==b));
	}
}
