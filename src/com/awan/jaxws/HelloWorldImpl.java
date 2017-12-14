package com.awan.jaxws;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.awan.jaxws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}