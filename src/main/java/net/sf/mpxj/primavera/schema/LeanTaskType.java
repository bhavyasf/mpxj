//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.08.22 at 05:45:05 PM BST
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
 * &lt;p&gt;Java class for LeanTaskType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="LeanTaskType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ActivityId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ActivityName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="120"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CompletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Duration" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Flag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsOverdue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsUseOnlyWorkDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="LeanTaskId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="120"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Name" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="120"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProposedDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Status" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="NEW"/&amp;gt;
 *               &amp;lt;enumeration value="PENDING"/&amp;gt;
 *               &amp;lt;enumeration value="COMMITTED"/&amp;gt;
 *               &amp;lt;enumeration value="COMPLETED"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="StatusCompletion" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="BOTH_NOT_COMPLETE"/&amp;gt;
 *               &amp;lt;enumeration value="TASK_COMPLETE_ACTIVITY_NOT"/&amp;gt;
 *               &amp;lt;enumeration value="ACTIVITY_COMPLETE_TASK_NOT"/&amp;gt;
 *               &amp;lt;enumeration value="BOTH_COMPLETE"/&amp;gt;
 *               &amp;lt;enumeration value="NO_ACTIVITY"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="StatusDates" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="OUTSIDE_ACTIVITY"/&amp;gt;
 *               &amp;lt;enumeration value="INSIDE_ACTIVITY"/&amp;gt;
 *               &amp;lt;enumeration value="NO_ACTIVITY"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="TaskType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="TASK"/&amp;gt;
 *               &amp;lt;enumeration value="TASK_MILESTONE"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="WBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "LeanTaskType", propOrder =
{
   "activityId",
   "activityName",
   "activityObjectId",
   "company",
   "completedDate",
   "createDate",
   "createUser",
   "dueDate",
   "duration",
   "flag",
   "isBaseline",
   "isOverdue",
   "isTemplate",
   "isUseOnlyWorkDays",
   "lastUpdateDate",
   "lastUpdateUser",
   "leanTaskId",
   "name",
   "objectId",
   "projectId",
   "projectObjectId",
   "proposedDueDate",
   "sequenceNumber",
   "startDate",
   "status",
   "statusCompletion",
   "statusDates",
   "taskType",
   "wbsObjectId"
}) public class LeanTaskType
{

   @XmlElement(name = "ActivityId") protected String activityId;
   @XmlElement(name = "ActivityName") protected String activityName;
   @XmlElement(name = "ActivityObjectId") protected Integer activityObjectId;
   @XmlElement(name = "Company") protected String company;
   @XmlElement(name = "CompletedDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date completedDate;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "DueDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date dueDate;
   @XmlElement(name = "Duration", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) protected Double duration;
   @XmlElement(name = "Flag", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean flag;
   @XmlElement(name = "IsBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isBaseline;
   @XmlElement(name = "IsOverdue", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isOverdue;
   @XmlElement(name = "IsTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isTemplate;
   @XmlElement(name = "IsUseOnlyWorkDays", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "boolean") protected Boolean isUseOnlyWorkDays;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "LeanTaskId") protected String leanTaskId;
   @XmlElement(name = "Name") protected String name;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "ProposedDueDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date proposedDueDate;
   @XmlElement(name = "SequenceNumber") protected Integer sequenceNumber;
   @XmlElement(name = "StartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "dateTime") protected Date startDate;
   @XmlElement(name = "Status") protected String status;
   @XmlElement(name = "StatusCompletion") protected String statusCompletion;
   @XmlElement(name = "StatusDates") protected String statusDates;
   @XmlElement(name = "TaskType") protected String taskType;
   @XmlElement(name = "WBSObjectId", nillable = true) protected Integer wbsObjectId;

   /**
    * Gets the value of the activityId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getActivityId()
   {
      return activityId;
   }

   /**
    * Sets the value of the activityId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActivityId(String value)
   {
      this.activityId = value;
   }

   /**
    * Gets the value of the activityName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getActivityName()
   {
      return activityName;
   }

   /**
    * Sets the value of the activityName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActivityName(String value)
   {
      this.activityName = value;
   }

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
    * Gets the value of the company property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCompany()
   {
      return company;
   }

   /**
    * Sets the value of the company property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCompany(String value)
   {
      this.company = value;
   }

   /**
    * Gets the value of the completedDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getCompletedDate()
   {
      return completedDate;
   }

   /**
    * Sets the value of the completedDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCompletedDate(Date value)
   {
      this.completedDate = value;
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
    * Gets the value of the dueDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getDueDate()
   {
      return dueDate;
   }

   /**
    * Sets the value of the dueDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDueDate(Date value)
   {
      this.dueDate = value;
   }

   /**
    * Gets the value of the duration property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getDuration()
   {
      return duration;
   }

   /**
    * Sets the value of the duration property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDuration(Double value)
   {
      this.duration = value;
   }

   /**
    * Gets the value of the flag property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isFlag()
   {
      return flag;
   }

   /**
    * Sets the value of the flag property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setFlag(Boolean value)
   {
      this.flag = value;
   }

   /**
    * Gets the value of the isBaseline property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsBaseline()
   {
      return isBaseline;
   }

   /**
    * Sets the value of the isBaseline property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsBaseline(Boolean value)
   {
      this.isBaseline = value;
   }

   /**
    * Gets the value of the isOverdue property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsOverdue()
   {
      return isOverdue;
   }

   /**
    * Sets the value of the isOverdue property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsOverdue(Boolean value)
   {
      this.isOverdue = value;
   }

   /**
    * Gets the value of the isTemplate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsTemplate()
   {
      return isTemplate;
   }

   /**
    * Sets the value of the isTemplate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsTemplate(Boolean value)
   {
      this.isTemplate = value;
   }

   /**
    * Gets the value of the isUseOnlyWorkDays property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsUseOnlyWorkDays()
   {
      return isUseOnlyWorkDays;
   }

   /**
    * Sets the value of the isUseOnlyWorkDays property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsUseOnlyWorkDays(Boolean value)
   {
      this.isUseOnlyWorkDays = value;
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
    * Gets the value of the leanTaskId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getLeanTaskId()
   {
      return leanTaskId;
   }

   /**
    * Sets the value of the leanTaskId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLeanTaskId(String value)
   {
      this.leanTaskId = value;
   }

   /**
    * Gets the value of the name property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setName(String value)
   {
      this.name = value;
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
    * Gets the value of the projectId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectId()
   {
      return projectId;
   }

   /**
    * Sets the value of the projectId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectId(String value)
   {
      this.projectId = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProjectObjectId(Integer value)
   {
      this.projectObjectId = value;
   }

   /**
    * Gets the value of the proposedDueDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getProposedDueDate()
   {
      return proposedDueDate;
   }

   /**
    * Sets the value of the proposedDueDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProposedDueDate(Date value)
   {
      this.proposedDueDate = value;
   }

   /**
    * Gets the value of the sequenceNumber property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSequenceNumber()
   {
      return sequenceNumber;
   }

   /**
    * Sets the value of the sequenceNumber property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSequenceNumber(Integer value)
   {
      this.sequenceNumber = value;
   }

   /**
    * Gets the value of the startDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getStartDate()
   {
      return startDate;
   }

   /**
    * Sets the value of the startDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setStartDate(Date value)
   {
      this.startDate = value;
   }

   /**
    * Gets the value of the status property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getStatus()
   {
      return status;
   }

   /**
    * Sets the value of the status property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setStatus(String value)
   {
      this.status = value;
   }

   /**
    * Gets the value of the statusCompletion property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getStatusCompletion()
   {
      return statusCompletion;
   }

   /**
    * Sets the value of the statusCompletion property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setStatusCompletion(String value)
   {
      this.statusCompletion = value;
   }

   /**
    * Gets the value of the statusDates property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getStatusDates()
   {
      return statusDates;
   }

   /**
    * Sets the value of the statusDates property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setStatusDates(String value)
   {
      this.statusDates = value;
   }

   /**
    * Gets the value of the taskType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTaskType()
   {
      return taskType;
   }

   /**
    * Sets the value of the taskType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTaskType(String value)
   {
      this.taskType = value;
   }

   /**
    * Gets the value of the wbsObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getWBSObjectId()
   {
      return wbsObjectId;
   }

   /**
    * Sets the value of the wbsObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setWBSObjectId(Integer value)
   {
      this.wbsObjectId = value;
   }

}
