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

@Order(elements={"tag"})
@Root(name="tag-list")
public class TagList {

  //@XmlElement(required = true)
  @ElementList(inline=true,entry="tag")
  protected List<Tag> tag;

  /**
   * Gets the value of the tag property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the tag property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getTag().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Tag }
   * 
   * 
   */
  public List<Tag> getTag() {
    if (tag == null) {
      tag = new ArrayList<Tag>();
    }
    return this.tag;
  }

}
