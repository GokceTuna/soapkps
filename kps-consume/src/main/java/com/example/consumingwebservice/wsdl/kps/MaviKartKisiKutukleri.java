
package com.example.consumingwebservice.wsdl.kps;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaviKartKisiKutukleri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaviKartKisiKutukleri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HataBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/&gt;
 *         &lt;element name="KisiBilgisi" type="{http://kps.nvi.gov.tr/2021/04/01}MaviKartKisiBilgisi" minOccurs="0"/&gt;
 *         &lt;element name="MaviKartBilgisi" type="{http://kps.nvi.gov.tr/2021/04/01}MaviKartBilgi" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaviKartKisiKutukleri", propOrder = {
    "hataBilgisi",
    "kisiBilgisi",
    "maviKartBilgisi"
})
public class MaviKartKisiKutukleri {

    @XmlElementRef(name = "HataBilgisi", namespace = "http://kps.nvi.gov.tr/2021/04/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> hataBilgisi;
    @XmlElementRef(name = "KisiBilgisi", namespace = "http://kps.nvi.gov.tr/2021/04/01", type = JAXBElement.class, required = false)
    protected JAXBElement<MaviKartKisiBilgisi> kisiBilgisi;
    @XmlElementRef(name = "MaviKartBilgisi", namespace = "http://kps.nvi.gov.tr/2021/04/01", type = JAXBElement.class, required = false)
    protected JAXBElement<MaviKartBilgi> maviKartBilgisi;

    /**
     * Gets the value of the hataBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getHataBilgisi() {
        return hataBilgisi;
    }

    /**
     * Sets the value of the hataBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setHataBilgisi(JAXBElement<Parametre> value) {
        this.hataBilgisi = value;
    }

    /**
     * Gets the value of the kisiBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaviKartKisiBilgisi }{@code >}
     *     
     */
    public JAXBElement<MaviKartKisiBilgisi> getKisiBilgisi() {
        return kisiBilgisi;
    }

    /**
     * Sets the value of the kisiBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaviKartKisiBilgisi }{@code >}
     *     
     */
    public void setKisiBilgisi(JAXBElement<MaviKartKisiBilgisi> value) {
        this.kisiBilgisi = value;
    }

    /**
     * Gets the value of the maviKartBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaviKartBilgi }{@code >}
     *     
     */
    public JAXBElement<MaviKartBilgi> getMaviKartBilgisi() {
        return maviKartBilgisi;
    }

    /**
     * Sets the value of the maviKartBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaviKartBilgi }{@code >}
     *     
     */
    public void setMaviKartBilgisi(JAXBElement<MaviKartBilgi> value) {
        this.maviKartBilgisi = value;
    }

}
