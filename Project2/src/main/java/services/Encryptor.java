package services;

public class Encryptor 
{
	
	public String Encrypt(String Password)
	{
		char[] x = Password.toCharArray();
		char[] y = new char[x.length];
		for(int i = 0;i<x.length;i++)
		{
			y[i]=(char) (x[i]+100);
		}
		
		String string = new String(y);
		return string;
	}
}