package command;

import command.inf.ICommand;
import command.light.Light;
import command.light.LightOffCommand;
import command.light.LightOnCommand;
import command.stereo.Stereo;
import command.stereo.StereoOffCommand;
import command.stereo.StereoOnWithCDCommand;

/***
 * 命令模式将请求封装成对象，比便于使用不同的请求，队列或者日志来参数化其他对象
 * 
 * 一个简单的命令模式实例：
 * 我们有一个遥控器，上面有若干个插槽，可以用于控制其他电器设备
 * @author jay
 *
 */
public class RemoteController
{
	private ICommand[] commands;
	
	public RemoteController()
	{
		commands = new ICommand[4];
		
		for(int i=0; i<4;i++)
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
	
	public static void main(String []args)
	{
		RemoteController controller = new RemoteController();
		
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
		
		for(int i =0;i<4;i++)
			controller.onButtonPressed(i);
	}
}
