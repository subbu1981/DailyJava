package com.practice.javaxml.dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class CreateNewXmlUsingDom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder;
		try {
			dbBuilder = dbFactory.newDocumentBuilder();
			Document doc = dbBuilder.newDocument();
			
			Node companyNode = doc.createElement("company");
			Node staffnode = doc.createElement("staff");
			companyNode.appendChild(staffnode);
			doc.appendChild(companyNode);
			Element firstName = doc.createElement("firstname");
			firstName.setTextContent("a3");
			staffnode.appendChild(firstName);
			
			Element lastName = doc.createElement("lastname");
			lastName.setTextContent("a4");
			staffnode.appendChild(lastName);
			
			Element nickName = doc.createElement("nickname");
			nickName.setTextContent("a");
			staffnode.appendChild(nickName);
			
			Element salary = doc.createElement("salary");
			salary.setTextContent("10000");
			staffnode.appendChild(salary);
			
			
			TransformerFactory trFactory = TransformerFactory.newInstance();
			Transformer transformer = trFactory.newTransformer();
			StreamResult stResult = new StreamResult("G:/workspace/DailyJava/DailyJava/Files/staff3.xml");
			DOMSource source = new DOMSource(doc);
			transformer.transform(source, stResult);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
