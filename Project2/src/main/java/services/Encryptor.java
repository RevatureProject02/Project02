package services;

public class Encryptor 
{
	
	public String Encrypt(String Password)
	{
		char[] x = Password.toCharArray();
		for(char c: x)
		{
			c+=100;
		}
		String string = new String(x);
		return string;
	}
}
