
package com.example.consumingwebservice.wsdl.kps;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBilesikKutukBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBilesikKutukBilgileri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BilesikKutukBilgileri" type="{http://kps.nvi.gov.tr/2021/04/01}BilesikKutukBilgileri" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBilesikKutukBilgileri", propOrder = {
    "bilesikKutukBilgileri"
})
public class ArrayOfBilesikKutukBilgileri {

    @XmlElement(name = "BilesikKutukBilgileri", nillable = true)
    protected List<BilesikKutukBilgileri> bilesikKutukBilgileri;

    /**
     * Gets the value of the bilesikKutukBilgileri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bilesikKutukBilgileri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilesikKutukBilgileri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilesikKutukBilgileri }
     * 
     * 
     */
    public List<BilesikKutukBilgileri> getBilesikKutukBilgileri() {
        if (bilesikKutukBilgileri == null) {
            bilesikKutukBilgileri = new ArrayList<BilesikKutukBilgileri>();
        }
        return this.bilesikKutukBilgileri;
    }

}
