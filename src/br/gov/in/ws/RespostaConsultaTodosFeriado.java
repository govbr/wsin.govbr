
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RespostaConsultaTodosFeriado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RespostaConsultaTodosFeriado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errointerno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="feriados" type="{http://data.xfire.ws.incom}ArrayOfDadosFeriado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaConsultaTodosFeriado", propOrder = {
    "errointerno",
    "feriados"
})
public class RespostaConsultaTodosFeriado {

    @XmlElement(required = true)
    protected String errointerno;
    @XmlElement(required = true)
    protected ArrayOfDadosFeriado feriados;

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
     * Obtém o valor da propriedade feriados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDadosFeriado }
     *     
     */
    public ArrayOfDadosFeriado getFeriados() {
        return feriados;
    }

    /**
     * Define o valor da propriedade feriados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDadosFeriado }
     *     
     */
    public void setFeriados(ArrayOfDadosFeriado value) {
        this.feriados = value;
    }

}
