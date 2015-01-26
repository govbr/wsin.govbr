
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RespostaConsultaJornais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RespostaConsultaJornais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errointerno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jornal" type="{http://data.xfire.ws.incom}ArrayOfDadosIdNome"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaConsultaJornais", propOrder = {
    "errointerno",
    "jornal"
})
public class RespostaConsultaJornais {

    @XmlElement(required = true)
    protected String errointerno;
    @XmlElement(required = true)
    protected ArrayOfDadosIdNome jornal;

    /**
     * Obtém o valor da propriedade errointerno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrointerno() {
        return errointerno;
    }

    /**
     * Define o valor da propriedade errointerno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrointerno(String value) {
        this.errointerno = value;
    }

    /**
     * Obtém o valor da propriedade jornal.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDadosIdNome }
     *     
     */
    public ArrayOfDadosIdNome getJornal() {
        return jornal;
    }

    /**
     * Define o valor da propriedade jornal.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDadosIdNome }
     *     
     */
    public void setJornal(ArrayOfDadosIdNome value) {
        this.jornal = value;
    }

}
