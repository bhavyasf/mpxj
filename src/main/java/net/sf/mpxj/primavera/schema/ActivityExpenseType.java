//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.01.05 at 10:41:47 AM GMT
//

package net.sf.mpxj.primavera.schema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * &lt;p&gt;Java class for ActivityExpenseType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="ActivityExpenseType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AccrualType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Start of Activity"/&amp;gt;
 *               &amp;lt;enumeration value="End of Activity"/&amp;gt;
 *               &amp;lt;enumeration value="Uniform Over Activity"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
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
 *         &amp;lt;element name="ActualCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ActualUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AtCompletionCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AtCompletionUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AutoComputeActuals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CBSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CBSId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostAccountId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CostAccountName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CostAccountObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="DocumentNumber" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="32"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ExpenseCategoryName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="36"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ExpenseCategoryObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ExpenseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ExpenseItem" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="120"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ExpensePercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OverBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PlannedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PlannedUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PricePerUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RemainingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RemainingUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UnitOfMeasure" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="30"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Vendor" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="WBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UDF" type="{http://xmlns.oracle.com/Primavera/P6/V19.12/API/BusinessObjects}UDFAssignmentType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ActivityExpenseType", propOrder =
{
   "accrualType",
   "activityId",
   "activityName",
   "activityObjectId",
   "actualCost",
   "actualUnits",
   "atCompletionCost",
   "atCompletionUnits",
   "autoComputeActuals",
   "cbsCode",
   "cbsId",
   "costAccountId",
   "costAccountName",
   "costAccountObjectId",
   "createDate",
   "createUser",
   "documentNumber",
   "expenseCategoryName",
   "expenseCategoryObjectId",
   "expenseDescription",
   "expenseItem",
   "expensePercentComplete",
   "isBaseline",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "objectId",
   "overBudget",
   "plannedCost",
   "plannedUnits",
   "pricePerUnit",
   "projectId",
   "projectObjectId",
   "remainingCost",
   "remainingUnits",
   "unitOfMeasure",
   "vendor",
   "wbsObjectId",
   "udf"
}) public class ActivityExpenseType
{

   @XmlElement(name = "AccrualType") protected String accrualType;
   @XmlElement(name = "ActivityId") protected String activityId;
   @XmlElement(name = "ActivityName") protected String activityName;
   @XmlElement(name = "ActivityObjectId") protected Integer activityObjectId;
   @XmlElement(name = "ActualCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double actualCost;
   @XmlElement(name = "ActualUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double actualUnits;
   @XmlElement(name = "AtCompletionCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double atCompletionCost;
   @XmlElement(name = "AtCompletionUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double atCompletionUnits;
   @XmlElement(name = "AutoComputeActuals") protected Boolean autoComputeActuals;
   @XmlElement(name = "CBSCode") protected String cbsCode;
   @XmlElement(name = "CBSId", nillable = true) protected Integer cbsId;
   @XmlElement(name = "CostAccountId") protected String costAccountId;
   @XmlElement(name = "CostAccountName") protected String costAccountName;
   @XmlElement(name = "CostAccountObjectId", nillable = true) protected Integer costAccountObjectId;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "DocumentNumber") protected String documentNumber;
   @XmlElement(name = "ExpenseCategoryName") protected String expenseCategoryName;
   @XmlElement(name = "ExpenseCategoryObjectId", nillable = true) protected Integer expenseCategoryObjectId;
   @XmlElement(name = "ExpenseDescription") protected String expenseDescription;
   @XmlElement(name = "ExpenseItem") protected String expenseItem;
   @XmlElement(name = "ExpensePercentComplete", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double expensePercentComplete;
   @XmlElement(name = "IsBaseline") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "OverBudget", nillable = true) protected Boolean overBudget;
   @XmlElement(name = "PlannedCost", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double plannedCost;
   @XmlElement(name = "PlannedUnits", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double plannedUnits;
   @XmlElement(name = "PricePerUnit", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double pricePerUnit;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "RemainingCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double remainingCost;
   @XmlElement(name = "RemainingUnits", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double remainingUnits;
   @XmlElement(name = "UnitOfMeasure") protected String unitOfMeasure;
   @XmlElement(name = "Vendor") protected String vendor;
   @XmlElement(name = "WBSObjectId", nillable = true) protected Integer wbsObjectId;
   @XmlElement(name = "UDF") protected List<UDFAssignmentType> udf;

   /**
    * Gets the value of the accrualType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getAccrualType()
   {
      return accrualType;
   }

   /**
    * Sets the value of the accrualType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAccrualType(String value)
   {
      this.accrualType = value;
   }

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
    * Gets the value of the actualCost property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getActualCost()
   {
      return actualCost;
   }

   /**
    * Sets the value of the actualCost property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActualCost(Double value)
   {
      this.actualCost = value;
   }

   /**
    * Gets the value of the actualUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getActualUnits()
   {
      return actualUnits;
   }

   /**
    * Sets the value of the actualUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActualUnits(Double value)
   {
      this.actualUnits = value;
   }

   /**
    * Gets the value of the atCompletionCost property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getAtCompletionCost()
   {
      return atCompletionCost;
   }

   /**
    * Sets the value of the atCompletionCost property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAtCompletionCost(Double value)
   {
      this.atCompletionCost = value;
   }

   /**
    * Gets the value of the atCompletionUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getAtCompletionUnits()
   {
      return atCompletionUnits;
   }

   /**
    * Sets the value of the atCompletionUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAtCompletionUnits(Double value)
   {
      this.atCompletionUnits = value;
   }

   /**
    * Gets the value of the autoComputeActuals property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isAutoComputeActuals()
   {
      return autoComputeActuals;
   }

   /**
    * Sets the value of the autoComputeActuals property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setAutoComputeActuals(Boolean value)
   {
      this.autoComputeActuals = value;
   }

   /**
    * Gets the value of the cbsCode property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCBSCode()
   {
      return cbsCode;
   }

   /**
    * Sets the value of the cbsCode property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCBSCode(String value)
   {
      this.cbsCode = value;
   }

   /**
    * Gets the value of the cbsId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getCBSId()
   {
      return cbsId;
   }

   /**
    * Sets the value of the cbsId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setCBSId(Integer value)
   {
      this.cbsId = value;
   }

   /**
    * Gets the value of the costAccountId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCostAccountId()
   {
      return costAccountId;
   }

   /**
    * Sets the value of the costAccountId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCostAccountId(String value)
   {
      this.costAccountId = value;
   }

   /**
    * Gets the value of the costAccountName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCostAccountName()
   {
      return costAccountName;
   }

   /**
    * Sets the value of the costAccountName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCostAccountName(String value)
   {
      this.costAccountName = value;
   }

   /**
    * Gets the value of the costAccountObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getCostAccountObjectId()
   {
      return costAccountObjectId;
   }

   /**
    * Sets the value of the costAccountObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setCostAccountObjectId(Integer value)
   {
      this.costAccountObjectId = value;
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
    * Gets the value of the documentNumber property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDocumentNumber()
   {
      return documentNumber;
   }

   /**
    * Sets the value of the documentNumber property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDocumentNumber(String value)
   {
      this.documentNumber = value;
   }

   /**
    * Gets the value of the expenseCategoryName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getExpenseCategoryName()
   {
      return expenseCategoryName;
   }

   /**
    * Sets the value of the expenseCategoryName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setExpenseCategoryName(String value)
   {
      this.expenseCategoryName = value;
   }

   /**
    * Gets the value of the expenseCategoryObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getExpenseCategoryObjectId()
   {
      return expenseCategoryObjectId;
   }

   /**
    * Sets the value of the expenseCategoryObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setExpenseCategoryObjectId(Integer value)
   {
      this.expenseCategoryObjectId = value;
   }

   /**
    * Gets the value of the expenseDescription property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getExpenseDescription()
   {
      return expenseDescription;
   }

   /**
    * Sets the value of the expenseDescription property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setExpenseDescription(String value)
   {
      this.expenseDescription = value;
   }

   /**
    * Gets the value of the expenseItem property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getExpenseItem()
   {
      return expenseItem;
   }

   /**
    * Sets the value of the expenseItem property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setExpenseItem(String value)
   {
      this.expenseItem = value;
   }

   /**
    * Gets the value of the expensePercentComplete property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getExpensePercentComplete()
   {
      return expensePercentComplete;
   }

   /**
    * Sets the value of the expensePercentComplete property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setExpensePercentComplete(Double value)
   {
      this.expensePercentComplete = value;
   }

   /**
    * Gets the value of the isBaseline property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
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
    *     {@link Boolean }
    *
    */
   public void setIsBaseline(Boolean value)
   {
      this.isBaseline = value;
   }

   /**
    * Gets the value of the isTemplate property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
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
    *     {@link Boolean }
    *
    */
   public void setIsTemplate(Boolean value)
   {
      this.isTemplate = value;
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
    * Gets the value of the overBudget property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isOverBudget()
   {
      return overBudget;
   }

   /**
    * Sets the value of the overBudget property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setOverBudget(Boolean value)
   {
      this.overBudget = value;
   }

   /**
    * Gets the value of the plannedCost property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPlannedCost()
   {
      return plannedCost;
   }

   /**
    * Sets the value of the plannedCost property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPlannedCost(Double value)
   {
      this.plannedCost = value;
   }

   /**
    * Gets the value of the plannedUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPlannedUnits()
   {
      return plannedUnits;
   }

   /**
    * Sets the value of the plannedUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPlannedUnits(Double value)
   {
      this.plannedUnits = value;
   }

   /**
    * Gets the value of the pricePerUnit property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPricePerUnit()
   {
      return pricePerUnit;
   }

   /**
    * Sets the value of the pricePerUnit property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPricePerUnit(Double value)
   {
      this.pricePerUnit = value;
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
    * Gets the value of the remainingCost property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getRemainingCost()
   {
      return remainingCost;
   }

   /**
    * Sets the value of the remainingCost property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRemainingCost(Double value)
   {
      this.remainingCost = value;
   }

   /**
    * Gets the value of the remainingUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getRemainingUnits()
   {
      return remainingUnits;
   }

   /**
    * Sets the value of the remainingUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRemainingUnits(Double value)
   {
      this.remainingUnits = value;
   }

   /**
    * Gets the value of the unitOfMeasure property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getUnitOfMeasure()
   {
      return unitOfMeasure;
   }

   /**
    * Sets the value of the unitOfMeasure property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setUnitOfMeasure(String value)
   {
      this.unitOfMeasure = value;
   }

   /**
    * Gets the value of the vendor property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getVendor()
   {
      return vendor;
   }

   /**
    * Sets the value of the vendor property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setVendor(String value)
   {
      this.vendor = value;
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

   /**
    * Gets the value of the udf property.
    *
    * &lt;p&gt;
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the udf property.
    *
    * &lt;p&gt;
    * For example, to add a new item, do as follows:
    * &lt;pre&gt;
    *    getUDF().add(newItem);
    * &lt;/pre&gt;
    *
    *
    * &lt;p&gt;
    * Objects of the following type(s) are allowed in the list
    * {@link UDFAssignmentType }
    *
    *
    */
   public List<UDFAssignmentType> getUDF()
   {
      if (udf == null)
      {
         udf = new ArrayList<>();
      }
      return this.udf;
   }

}
