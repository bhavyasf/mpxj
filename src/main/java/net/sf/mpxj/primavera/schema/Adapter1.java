//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.08.22 at 05:45:05 PM BST
//

package net.sf.mpxj.primavera.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1 extends XmlAdapter<String, Boolean>
{

   @Override public Boolean unmarshal(String value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.parseBoolean(value));
   }

   @Override public String marshal(Boolean value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.printBoolean(value));
   }

}
