package com.application;

import java.io.File;

import trng.imcs.jaxb.Address;
import trng.imcs.jaxb.Marks;
import trng.imcs.jaxb.Student;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
public class JAXBApplication {

	public static void main(String[] args) {
		
		Student student = new Student();
		Address address = new Address();
		Marks marks = new Marks();
		student.setStudentName("Sandeep");
		student.setStudentId(10);
		address.setAdressline("1452 Bell");
		address.setCity("Hyd");
		address.setZipCode(45314);
		address.setAdressType("HOME");
		marks.setMarks(10);
		marks.setMaxMarks(100);
		marks.setSubject("Maths");
		student.getMarks().add(marks);
		student.getAddress().add(address);
		
		try{
			File file = new File("D:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			jaxbMarshaller.marshal(student, file);
			jaxbMarshaller.marshal(student, System.out);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
