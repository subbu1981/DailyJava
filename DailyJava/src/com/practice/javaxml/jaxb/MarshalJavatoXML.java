package com.practice.javaxml.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshalJavatoXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("G:/workspace/DailyJava/DailyJava/Files/staff5.xml");
		Company comp = new Company();
		Staff staff = new Staff();
		staff.setFirstname("a");
		staff.setLastname("b");
		staff.setNickname("c");
		staff.setSalary(100000);
		staff.setId(100);
		comp.setStaff(staff);
		
		try {
			JAXBContext jaxbcontext =JAXBContext.newInstance(Company.class);
			Marshaller marsh = jaxbcontext.createMarshaller();
			marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marsh.marshal(comp, file);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
