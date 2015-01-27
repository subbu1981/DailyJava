package com.practice.javaxml.dom;

import java.io.File;
import java.io.IOException;

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
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ModifyXmlUsingDom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File xmlFile = new File("G:/workspace/DailyJava/DailyJava/Files/staff1.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
			Document document = dbBuilder.parse(xmlFile);
			Node companyNode = document.getFirstChild();
			Node staffNode = document.getElementsByTagName("staff").item(0);
			
			NamedNodeMap attr = staffNode.getAttributes();
			Node attrNode = attr.getNamedItem("id");
			attrNode.setTextContent("100");
			System.out.println(attrNode.getTextContent());
			
			Element age = document.createElement("age");
			age.setTextContent("33");
			staffNode.appendChild(age);
			
			NodeList nlist = staffNode.getChildNodes();
			for(int i=0;i<nlist.getLength();i++){
				Node tempNode = nlist.item(i);
				if (tempNode.getNodeName().equals("salary")){
					tempNode.setTextContent("100000");
				}
			}
			
			TransformerFactory transformFactory = TransformerFactory.newInstance();
			Transformer transformer = transformFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(new File("G:/workspace/DailyJava/DailyJava/Files/staff2.xml"));
			transformer.transform(source, result);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
