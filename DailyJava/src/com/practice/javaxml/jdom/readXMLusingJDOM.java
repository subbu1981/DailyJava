package com.practice.javaxml.jdom;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class readXMLusingJDOM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXBuilder saxbuilder = new SAXBuilder();
		File f1 = new File("G:/workspace/DailyJava/DailyJava/Files/staff1.xml");
		
		try {
			Document doc = (Document)saxbuilder.build(f1);
			Element rootnode = doc.getRootElement();
			List<Element> list = rootnode.getChildren("staff");
			
			for(Element e1:list)
			{
				System.out.println(e1.getChildText("firstname"));
			}
			
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
