package com.practice.javaxml.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class readXmlusingDOM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File xmlFile = new File("G:/workspace/DailyJava/DailyJava/Files/staff.xml");
		try {
			System.out.println(!xmlFile.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
		try {
			DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
			Document doc = dbBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println(doc.getDocumentElement().getNodeName());
			NodeList nlist = doc.getElementsByTagName("staff");
			for(int i=0; i<nlist.getLength(); i++){
				Node node = nlist.item(i);
				
				System.out.println(node.getNodeType());
				
				if(node.getNodeType() == Node.ELEMENT_NODE){
					Element element = (Element) node;
					System.out.println(element.getAttribute("id"));
					System.out.println(element.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println(element.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println(element.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println(element.getElementsByTagName("salary").item(0).getTextContent());
					System.out.println(element.getElementsByTagName("utf").item(0).getTextContent());
				}
				
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}catch (SAXException sae){
			sae.printStackTrace();
		}

	}

}
