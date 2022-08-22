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
 * &lt;p&gt;Java class for GatewayDeploymentType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="GatewayDeploymentType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DeploymentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "GatewayDeploymentType", propOrder =
{
   "deploymentName",
   "objectId",
   "providerId",
   "providerName"
}) public class GatewayDeploymentType
{

   @XmlElement(name = "DeploymentName") protected String deploymentName;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ProviderId") protected Integer providerId;
   @XmlElement(name = "ProviderName") protected String providerName;

   /**
    * Gets the value of the deploymentName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDeploymentName()
   {
      return deploymentName;
   }

   /**
    * Sets the value of the deploymentName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDeploymentName(String value)
   {
      this.deploymentName = value;
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
    * Gets the value of the providerId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProviderId()
   {
      return providerId;
   }

   /**
    * Sets the value of the providerId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProviderId(Integer value)
   {
      this.providerId = value;
   }

   /**
    * Gets the value of the providerName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProviderName()
   {
      return providerName;
   }

   /**
    * Sets the value of the providerName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProviderName(String value)
   {
      this.providerName = value;
   }

}
