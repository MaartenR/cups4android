//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.14 at 12:03:17 PM MESZ 
//

package ch.ethz.vppserver.schema.ippclient;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

@Order(elements={"attribute-value"})
@Root(name="attribute")
public class Attribute {

  //@XmlElement(name = "attribute-value")
	@ElementList(inline=true, entry="attribute-value")
  protected List<AttributeValue> attributeValue;
  //@XmlAttribute(required = true)
	@org.simpleframework.xml.Attribute(required=true)
  protected String name;
  //@XmlAttribute
	@org.simpleframework.xml.Attribute(required=false)
  protected String description;

  /**
   * Gets the value of the attributeValue property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the attributeValue property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getAttributeValue().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link AttributeValue }
   * 
   * 
   */
  public List<AttributeValue> getAttributeValue() {
    if (attributeValue == null) {
      attributeValue = new ArrayList<AttributeValue>();
    }
    return this.attributeValue;
  }

  /**
   * Gets the value of the name property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setName(String value) {
    this.name = value;
  }

  /**
   * Gets the value of the description property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setDescription(String value) {
    this.description = value;
  }

}
