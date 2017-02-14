package structure.proxy.gumball.inf;

import java.io.Serializable;

public interface IState extends Serializable
{
	// 插入25美分
	void insertQuarter();

	// 弹出美分
	void ejectQuarter();

	// 转动手柄
	void turnCrank();

	// 发放糖果
	void dispense();
}
