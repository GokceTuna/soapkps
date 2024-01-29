
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
 *         &lt;element name="kriterListesi" type="{http://kps.nvi.gov.tr/2021/04/01}ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri" minOccurs="0"/&gt;
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
    "kriterListesi"
})
@XmlRootElement(name = "Sorgula")
public class Sorgula {

    @XmlElementRef(name = "kriterListesi", namespace = "http://kps.nvi.gov.tr/2021/04/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri> kriterListesi;

    /**
     * Gets the value of the kriterListesi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri> getKriterListesi() {
        return kriterListesi;
    }

    /**
     * Sets the value of the kriterListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri }{@code >}
     *     
     */
    public void setKriterListesi(JAXBElement<ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri> value) {
        this.kriterListesi = value;
    }

}
