//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.15 at 07:33:52 PM GMT-05:00 
//


package trng.imcs.jaxb;



import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Student"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StudentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StudentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Address" type="{http://www.example.org/Student}Address" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Marks" type="{http://www.example.org/Student}Marks" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = {
    "studentName",
    "studentId",
    "address",
    "marks"
})
@XmlRootElement
public class Student {

    @XmlElement(name = "StudentName", required = true)
    protected String studentName;
    @XmlElement(name = "StudentId")
    protected int studentId;
    @XmlElement(name = "Address", required = true)
    protected List<Address> address;
    @XmlElement(name = "Marks", required = true)
    protected List<Marks> marks;
    
    

    @Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", address=" + address + ", marks="
				+ marks + "]";
	}

	/**
     * Gets the value of the studentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Sets the value of the studentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentName(String value) {
        this.studentName = value;
    }

    /**
     * Gets the value of the studentId property.
     * 
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Sets the value of the studentId property.
     * 
     */
    public void setStudentId(int value) {
        this.studentId = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the marks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Marks }
     * 
     * 
     */
    public List<Marks> getMarks() {
        if (marks == null) {
            marks = new ArrayList<Marks>();
        }
        return this.marks;
    }

}
