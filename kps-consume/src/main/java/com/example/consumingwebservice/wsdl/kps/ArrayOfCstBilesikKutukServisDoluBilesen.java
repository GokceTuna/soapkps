
package com.example.consumingwebservice.wsdl.kps;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCstBilesikKutukServisDoluBilesen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCstBilesikKutukServisDoluBilesen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CstBilesikKutukServisDoluBilesen" type="{http://schemas.datacontract.org/2004/07/Common.Types.Constants}CstBilesikKutukServisDoluBilesen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCstBilesikKutukServisDoluBilesen", namespace = "http://schemas.datacontract.org/2004/07/Common.Types.Constants", propOrder = {
    "cstBilesikKutukServisDoluBilesen"
})
public class ArrayOfCstBilesikKutukServisDoluBilesen {

    @XmlElement(name = "CstBilesikKutukServisDoluBilesen")
    @XmlSchemaType(name = "string")
    protected List<CstBilesikKutukServisDoluBilesen> cstBilesikKutukServisDoluBilesen;

    /**
     * Gets the value of the cstBilesikKutukServisDoluBilesen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cstBilesikKutukServisDoluBilesen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstBilesikKutukServisDoluBilesen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CstBilesikKutukServisDoluBilesen }
     * 
     * 
     */
    public List<CstBilesikKutukServisDoluBilesen> getCstBilesikKutukServisDoluBilesen() {
        if (cstBilesikKutukServisDoluBilesen == null) {
            cstBilesikKutukServisDoluBilesen = new ArrayList<CstBilesikKutukServisDoluBilesen>();
        }
        return this.cstBilesikKutukServisDoluBilesen;
    }

}
