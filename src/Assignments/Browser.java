package Assignments;

public class Browser 
{
	private String name;
	private double version;
	private String[] plugin;
	
	public Browser(String name,double version,String[] plugin)
	{
		this.name=name;
		this.version=version;
		this.plugin=plugin;
	}
	public void setName(String name) 
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	public void setVersion(double version)
	{
		this.version=version;
	}
	public double getVersion()
	{
		return version;
	}
	public void setPlugin(String[]plugin)
	{
		plugin=new String[2];
		this.plugin=plugin;
	}
	public String[] getPlugin()
	{
		return plugin;
	}
}
