package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 此例子证明了通过反射，依然可以破解单利class，生成多个实例
 * 
 * @author jay
 *
 */
public class ReflectionSingleton
{

	public static void main(String[] args)
			throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{

		Class<?>[] clsType =
			{ DoubleCheckedSingleton.class, SynchronizedSingleton.class, SimpleSingleton.class,
					EagerlySinleton.class };
		for (int i = 0; i < clsType.length; i++)
		{
			Constructor<?> constructor = clsType[i].getDeclaredConstructor(null);
			constructor.setAccessible(true);
			switch (i) {
			case 0:
				DoubleCheckedSingleton d1 = (DoubleCheckedSingleton) constructor.newInstance();
				DoubleCheckedSingleton d2 = (DoubleCheckedSingleton) constructor.newInstance();
				// Check the result, you can see that there are two different
				// instance
				System.out.println("d1 = " + d1 + ", d2=" + d2);
				break;
			case 1:
				SynchronizedSingleton d3 = (SynchronizedSingleton) constructor.newInstance();
				SynchronizedSingleton d4 = (SynchronizedSingleton) constructor.newInstance();
				System.out.println("d3 = " + d3 + ", d4=" + d4);
				break;
			case 2:
				SimpleSingleton d5 = (SimpleSingleton) constructor.newInstance();
				SimpleSingleton d6 = (SimpleSingleton) constructor.newInstance();
				System.out.println("d5 = " + d5 + ", d6=" + d6);
				break;
			case 3:
				EagerlySinleton d7 = (EagerlySinleton) constructor.newInstance();
				EagerlySinleton d8 = (EagerlySinleton) constructor.newInstance();
				System.out.println("d7 = " + d7 + ", d8=" + d8);
				break;
			}

		}

	}

}
