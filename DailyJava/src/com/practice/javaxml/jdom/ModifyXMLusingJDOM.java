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

public class ModifyXMLusingJDOM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXBuilder builder = new SAXBuilder();
		File f1 = new File("G:/workspace/DailyJava/DailyJava/Files/staff1.xml");
		
		try {
			Document doc = builder.build(f1);
			Element root = doc.getRootElement();
			root.getChild("staff").setAttribute("id","105");
			Element staff = root.getChild("staff");
			staff.removeChild("nickname");
			staff.getChild("salary").setText("20000");
			XMLOutputter output = new XMLOutputter();
			output.setFormat(Format.getPrettyFormat());
			output.output(doc, new FileWriter("G:/workspace/DailyJava/DailyJava/Files/staff3.xml"));
			
			
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
