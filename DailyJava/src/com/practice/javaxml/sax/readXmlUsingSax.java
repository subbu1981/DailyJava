package com.practice.javaxml.sax;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class readXmlUsingSax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXParserFactory saxFactory = SAXParserFactory.newInstance();
		
		try {
			SAXParser saxparser = saxFactory.newSAXParser();
			DefaultHandler handler = new DefaultHandler(){
				boolean fname = false;
				boolean lname = false;
				boolean nname = false;
				boolean salary = false;
				
				public void startDocument() throws SAXException{
					System.out.println("start documemt");
				}
				
				public void endDocument() throws SAXException{
					System.out.println("End Document");
				}
				
				public void startElement(String uri, String localname, String qName, Attributes attr) throws SAXException{
					System.out.println("startElement"+qName);
				}
				
				public void endElement(String uri, String localname, String qName){
					System.out.println("endElement"+qName);
				}
				
				public void characters( char ch[],int start, int length){
					System.out.println("characters"+new String(ch,start,length));
				}
			};
			
			File f1 = new File ("G:/workspace/DailyJava/DailyJava/Files/staff.xml");
			InputStream is = new FileInputStream(f1);
			Reader isr = new InputStreamReader(is,"UTF-8");
			InputSource iss = new InputSource(isr);
			iss.setEncoding("UTF-8");
			
			saxparser.parse(iss,handler);
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
