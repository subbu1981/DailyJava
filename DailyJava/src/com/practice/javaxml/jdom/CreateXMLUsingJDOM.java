package com.practice.javaxml.jdom;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class CreateXMLUsingJDOM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		try {
			Element company = new Element("company");
			Document doc = new Document(company);
			
			Element staff = new Element("staff");
			Element firstname = new Element("firstname");
			Element lastname = new Element("lastname");
			Element nickname = new Element("nickname");
			Element salary = new Element("salary");
			staff.addContent(firstname.setText("c1"));
			staff.addContent(lastname.setText("c2"));
			staff.addContent(nickname.setText("c"));
			staff.addContent(salary.setText("30000"));
			company.addContent(staff);
			
			XMLOutputter output = new XMLOutputter();
			output.setFormat(Format.getPrettyFormat());
			output.output(doc, new FileWriter("G:/workspace/DailyJava/DailyJava/Files/staff4.xml"));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	

}
