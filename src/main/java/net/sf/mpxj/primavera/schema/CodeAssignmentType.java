//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.08.22 at 05:45:05 PM BST
//

package net.sf.mpxj.primavera.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * &lt;p&gt;Java class for CodeAssignmentType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="CodeAssignmentType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="ValueObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "CodeAssignmentType", propOrder =
{
   "typeObjectId",
   "valueObjectId"
}) public class CodeAssignmentType
{

   @XmlElement(name = "TypeObjectId") protected int typeObjectId;
   @XmlElement(name = "ValueObjectId") protected int valueObjectId;

   /**
    * Gets the value of the typeObjectId property.
    *
    */
   public int getTypeObjectId()
   {
      return typeObjectId;
   }

   /**
    * Sets the value of the typeObjectId property.
    *
    */
   public void setTypeObjectId(int value)
   {
      this.typeObjectId = value;
   }

   /**
    * Gets the value of the valueObjectId property.
    *
    */
   public int getValueObjectId()
   {
      return valueObjectId;
   }

   /**
    * Sets the value of the valueObjectId property.
    *
    */
   public void setValueObjectId(int value)
   {
      this.valueObjectId = value;
   }

}
