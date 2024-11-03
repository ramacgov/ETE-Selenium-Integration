package Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties properties;
	String propertyFilePath= "C:\\Users\\dell\\Hybrid Framework\\Framework\\src\\main\\resources\\Configs\\Configuration.properties";
		
	public ConfigFileReader()
	{
		try {
			BufferedReader  reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
		
	}
	
	public String getURL(){
		String URLPath = properties.getProperty("url");
		if(URLPath!= null) 
			return URLPath;
		else throw new RuntimeException("URLPath not specified in the Configuration.properties file.");		
	}
	
	public String getURL1(){
		String URLPath1 = properties.getProperty("url2");
		if(URLPath1!= null) 
			return URLPath1;
		else throw new RuntimeException("URLPath not specified in the Configuration.properties file.");		
	}
	
	public String getUsername(){
		String Uname = properties.getProperty("username");
		if(Uname!= null) 
			return Uname;
		else throw new RuntimeException("Uname not specified in the Configuration.properties file.");		
	}
	
	public String getPassword(){
		String pwd = properties.getProperty("password");
		if(pwd!= null) 
			return pwd;
		else throw new RuntimeException("password not specified in the Configuration.properties file.");		
	}
	
	public String getbrowsername(){
		String Bname = properties.getProperty("Browsername");
		if(Bname!= null) 
			return Bname;
		else throw new RuntimeException("password not specified in the Configuration.properties file.");		
	}

}


