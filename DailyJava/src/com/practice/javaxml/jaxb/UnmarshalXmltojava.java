package com.practice.javaxml.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshalXmltojava {

	/**
	 * @param args
	 */
	
//This will be done by using a StreamReaderDelegate.  This delegate lets us filter the output from an XMLStreamReader.  We will leverage this delegate to return all element and attribute names as lower case.
	/* XMLInputFactory xif = XMLInputFactory.newInstance();
     XMLStreamReader xsr = xif.createXMLStreamReader(new FileInputStream("src/blog/caseinsensitive/input2.xml"));
     xsr = new MyStreamReaderDelegate(xsr);*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("G:/workspace/DailyJava/DailyJava/Files/staff1.xml");
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Company.class);
			Unmarshaller jaxbunmarshal = jaxbContext.createUnmarshaller();
			Company comp = (Company)jaxbunmarshal.unmarshal(f1);
			System.out.println(comp.getStaff().getFirstname());
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
