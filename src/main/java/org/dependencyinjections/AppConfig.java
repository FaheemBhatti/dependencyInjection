package org.dependencyinjections;

import org.dependencyinjections.components.Corolla;
import org.dependencyinjections.components.Engine;
import org.dependencyinjections.components.Swift;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.dependencyinjections")

public class AppConfig 
{
	@Bean("swift")
	public Swift swift()
	{
		return new Swift();
	}
	
	@Bean("corolla")
	public Corolla corolla()
	{
		return new Corolla();
	}
	
	@Bean("engine")
	public Engine engine()
	{
		return new Engine();
	}
}
