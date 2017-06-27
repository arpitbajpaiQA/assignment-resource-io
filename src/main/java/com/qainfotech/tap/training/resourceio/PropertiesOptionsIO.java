package com.qainfotech.tap.training.resourceio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Ramandeep RamandeepSingh AT QAInfoTech.com
 */
public class PropertiesOptionsIO{
	Properties prop = new Properties();

	public Object getOptionValue(String optionKey) throws IOException {

	InputStream input = null;

	input = getClass().getClassLoader().getResourceAsStream("options.properties");
	prop.load(input);
	Object a=prop.getProperty(optionKey);

	return a;
	}

	public void addOption(String optionKey, Object optionValue) throws IOException {
	OutputStream output = null; 
	output = new FileOutputStream("C:\\Users\\arpitbajpai\\Downloads\\assignment-resource-io-master\\src\\main\\resources\\options.properties");
	prop.setProperty(optionKey, optionValue.toString());
    prop.store(output,null);
	output.close();
	}
}
