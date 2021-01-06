//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.01.05 at 10:41:47 AM GMT
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * &lt;p&gt;Java class for ActivityCommentType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="ActivityCommentType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AssignmentObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CommentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CommentText" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="4000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="DeleteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DeleteUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="IsRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PersonalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReadFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RejectionComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimeDiff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ActivityCommentType", propOrder =
{
   "activityObjectId",
   "assignmentObjectId",
   "commentDate",
   "commentText",
   "createDate",
   "createUser",
   "deleteDate",
   "deleteUser",
   "isRejected",
   "lastUpdateDate",
   "lastUpdateUser",
   "objectId",
   "personalName",
   "readFlag",
   "rejectionComments",
   "timeDiff",
   "userObjectId"
}) public class ActivityCommentType
{

   @XmlElement(name = "ActivityObjectId") protected Integer activityObjectId;
   @XmlElement(name = "AssignmentObjectId") protected Integer assignmentObjectId;
   @XmlElement(name = "CommentDate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date commentDate;
   @XmlElement(name = "CommentText") protected String commentText;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "DeleteDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date deleteDate;
   @XmlElement(name = "DeleteUser") protected String deleteUser;
   @XmlElement(name = "IsRejected") protected Boolean isRejected;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "PersonalName") protected String personalName;
   @XmlElement(name = "ReadFlag") protected Boolean readFlag;
   @XmlElement(name = "RejectionComments") protected String rejectionComments;
   @XmlElement(name = "TimeDiff") protected String timeDiff;
   @XmlElement(name = "UserObjectId") protected Integer userObjectId;

   /**
    * Gets the value of the activityObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getActivityObjectId()
   {
      return activityObjectId;
   }

   /**
    * Sets the value of the activityObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setActivityObjectId(Integer value)
   {
      this.activityObjectId = value;
   }

   /**
    * Gets the value of the assignmentObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getAssignmentObjectId()
   {
      return assignmentObjectId;
   }

   /**
    * Sets the value of the assignmentObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setAssignmentObjectId(Integer value)
   {
      this.assignmentObjectId = value;
   }

   /**
    * Gets the value of the commentDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getCommentDate()
   {
      return commentDate;
   }

   /**
    * Sets the value of the commentDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCommentDate(Date value)
   {
      this.commentDate = value;
   }

   /**
    * Gets the value of the commentText property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCommentText()
   {
      return commentText;
   }

   /**
    * Sets the value of the commentText property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCommentText(String value)
   {
      this.commentText = value;
   }

   /**
    * Gets the value of the createDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateDate(Date value)
   {
      this.createDate = value;
   }

   /**
    * Gets the value of the createUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the deleteDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getDeleteDate()
   {
      return deleteDate;
   }

   /**
    * Sets the value of the deleteDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDeleteDate(Date value)
   {
      this.deleteDate = value;
   }

   /**
    * Gets the value of the deleteUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDeleteUser()
   {
      return deleteUser;
   }

   /**
    * Sets the value of the deleteUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDeleteUser(String value)
   {
      this.deleteUser = value;
   }

   /**
    * Gets the value of the isRejected property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isIsRejected()
   {
      return isRejected;
   }

   /**
    * Sets the value of the isRejected property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setIsRejected(Boolean value)
   {
      this.isRejected = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateDate(Date value)
   {
      this.lastUpdateDate = value;
   }

   /**
    * Gets the value of the lastUpdateUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the objectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the personalName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPersonalName()
   {
      return personalName;
   }

   /**
    * Sets the value of the personalName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPersonalName(String value)
   {
      this.personalName = value;
   }

   /**
    * Gets the value of the readFlag property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isReadFlag()
   {
      return readFlag;
   }

   /**
    * Sets the value of the readFlag property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setReadFlag(Boolean value)
   {
      this.readFlag = value;
   }

   /**
    * Gets the value of the rejectionComments property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRejectionComments()
   {
      return rejectionComments;
   }

   /**
    * Sets the value of the rejectionComments property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRejectionComments(String value)
   {
      this.rejectionComments = value;
   }

   /**
    * Gets the value of the timeDiff property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTimeDiff()
   {
      return timeDiff;
   }

   /**
    * Sets the value of the timeDiff property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimeDiff(String value)
   {
      this.timeDiff = value;
   }

   /**
    * Gets the value of the userObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getUserObjectId()
   {
      return userObjectId;
   }

   /**
    * Sets the value of the userObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setUserObjectId(Integer value)
   {
      this.userObjectId = value;
   }

}
