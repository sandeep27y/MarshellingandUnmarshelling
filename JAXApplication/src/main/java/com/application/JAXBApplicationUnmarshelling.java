package com.application;

import trng.imcs.jaxb.Student;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class JAXBApplicationUnmarshelling {

	public static void main(String[] args) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Student student = (Student) jaxbUnmarshaller.unmarshal(new File("D:/file.xml"));
			System.out.println(student);
			System.out.println(student.getAddress().get(0));
		  } catch (JAXBException e) {
			e.printStackTrace();
		  }

	}

}
