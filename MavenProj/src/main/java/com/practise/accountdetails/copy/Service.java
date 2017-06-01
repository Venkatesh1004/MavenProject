package com.practise.accountdetails.copy;

public class Service {

	public boolean checkData(String uname, String pswd){
		
		DB data = new DB();
		String password = data.getPassword(uname);
		
		if(password!= null && password.equals(pswd))
		{
			return true;
		}
		 return false;
	}
}
