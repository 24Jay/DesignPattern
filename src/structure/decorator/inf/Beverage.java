package structure.decorator.inf;

public abstract class Beverage
{
	public String description = "Unknow beverage";
	
	public String getDescription()
	{
		return description;
	}
	
	public abstract double cost();
}
