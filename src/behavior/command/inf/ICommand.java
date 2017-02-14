package behavior.command.inf;

/**
 * 命令模式解耦动作请求者和命令执行者;
 * 命令模式　：将请求封装成对象，以便于使用不同的请求，队列或者日志来参数化其他对象，命令模式也支持可撤销的操作。
 * @author jay
 *
 */
public interface ICommand
{
	public void execute();
}
