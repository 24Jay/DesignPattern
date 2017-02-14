package behavior.command;

import behavior.command.inf.ICommand;
import behavior.command.light.Light;
import behavior.command.light.LightOffCommand;
import behavior.command.light.LightOnCommand;
import behavior.command.stereo.Stereo;
import behavior.command.stereo.StereoOffCommand;
import behavior.command.stereo.StereoOnWithCDCommand;

/***
 * 命令模式 ：将请求封装成对象，以便于使用不同的请求，队列或者日志来参数化其他对象，命令模式也支持可撤销的操作。 一个简单的命令模式实例：
 * 我们有一个遥控器，上面有若干个插槽，可以用于控制其他电器设备
 * 
 * @author jay
 *
 */
public class TestRemoteController
{
	private ICommand[] commands;

	public TestRemoteController()
	{
		commands = new ICommand[4];

		for (int i = 0; i < 4; i++)
		{
			commands[i] = new NoCommand();
		}
	}

	public void setCommand(int i, ICommand command)
	{
		commands[i] = command;
	}

	public void onButtonPressed(int i)
	{
		commands[i].execute();
	}

	public static void main(String[] args)
	{
		TestRemoteController controller = new TestRemoteController();

		Light light = new Light();
		ICommand lightOn = new LightOnCommand(light);
		ICommand lightOff = new LightOffCommand(light);
		controller.setCommand(0, lightOn);
		controller.setCommand(1, lightOff);

		Stereo stereo = new Stereo();
		ICommand stereoOn = new StereoOnWithCDCommand(stereo);
		ICommand stereOff = new StereoOffCommand(stereo);
		controller.setCommand(2, stereoOn);
		controller.setCommand(3, stereOff);

		for (int i = 0; i < 4; i++)
			controller.onButtonPressed(i);
	}
}
