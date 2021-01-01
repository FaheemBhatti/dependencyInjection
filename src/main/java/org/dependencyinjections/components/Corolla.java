package org.dependencyinjections.components;

import org.dependencyinjections.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;

public class Corolla implements Car 
{
	@Autowired
	Engine engine;
	
	public String spcs()
	{
		return "Sedan from Toyota and the engine type is " + engine.getType();
	}
}
