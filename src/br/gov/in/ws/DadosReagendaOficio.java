
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DadosReagendaOficio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosReagendaOficio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDOficio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="novaData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosReagendaOficio", propOrder = {
    "cpf",
    "idOficio",
    "novaData"
})
public class DadosReagendaOficio {

    @XmlElement(name = "CPF", required = true)
    protected String cpf;
    @XmlElement(name = "IDOficio")
    protected int idOficio;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar novaData;

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade idOficio.
     * 
     */
    public int getIDOficio() {
        return idOficio;
    }

    /**
     * Define o valor da propriedade idOficio.
     * 
     */
    public void setIDOficio(int value) {
        this.idOficio = value;
    }

    /**
     * Obtém o valor da propriedade novaData.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNovaData() {
        return novaData;
    }

    /**
     * Define o valor da propriedade novaData.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNovaData(XMLGregorianCalendar value) {
        this.novaData = value;
    }

}
