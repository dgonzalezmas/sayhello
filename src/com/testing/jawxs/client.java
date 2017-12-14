package com.testing.jawxs;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import javax.swing.*;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldImplServiceLocator l=new HelloWorldImplServiceLocator();
		try {
			HelloWorld h = l.getHelloWorldImplPort();
		    String name = JOptionPane.showInputDialog(null, "What's your name?");
		    if (name!=null)
		    {
		    	String message=h.getHelloWorldAsString(name);
		    	System.out.println(message);
		    	JOptionPane.showMessageDialog(null, message);
		    }
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
