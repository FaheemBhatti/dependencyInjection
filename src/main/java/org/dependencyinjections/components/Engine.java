package org.dependencyinjections.components;

public class Engine 
{
	private String type;
	
	public Engine()
	{
		this.type = "V8";
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}
}
