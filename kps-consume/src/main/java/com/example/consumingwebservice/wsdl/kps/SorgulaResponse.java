
package com.example.consumingwebservice.wsdl.kps;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SorgulaResult" type="{http://kps.nvi.gov.tr/2021/04/01}BilesikKutukBilgileriSonucu" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sorgulaResult"
})
@XmlRootElement(name = "SorgulaResponse")
public class SorgulaResponse {

    @XmlElementRef(name = "SorgulaResult", namespace = "http://kps.nvi.gov.tr/2021/04/01", type = JAXBElement.class, required = false)
    protected JAXBElement<BilesikKutukBilgileriSonucu> sorgulaResult;

    /**
     * Gets the value of the sorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilesikKutukBilgileriSonucu }{@code >}
     *     
     */
    public JAXBElement<BilesikKutukBilgileriSonucu> getSorgulaResult() {
        return sorgulaResult;
    }

    /**
     * Sets the value of the sorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilesikKutukBilgileriSonucu }{@code >}
     *     
     */
    public void setSorgulaResult(JAXBElement<BilesikKutukBilgileriSonucu> value) {
        this.sorgulaResult = value;
    }

}
