package status;


/**
 * 糖果机的状态转换
 * @author jay
 *
 */
public class TestState
{
	public static void main(String[] args)
	{
		GambleMachine machine = new GambleMachine(10);
		machine.insertQuarter();
		machine.ejectQuarter();

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		machine.insertQuarter();
		machine.turnCrank();
		machine.dispense();

		for (int i = 0; i < 12; i++)
		{
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			machine.insertQuarter();
			machine.turnCrank();
			machine.ejectQuarter();
			machine.dispense();
		}
	}

}
