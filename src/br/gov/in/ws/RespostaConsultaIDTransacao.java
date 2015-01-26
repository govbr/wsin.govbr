
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RespostaConsultaIDTransacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RespostaConsultaIDTransacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errointerno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publicacao" type="{http://data.xfire.ws.incom}ArrayOfDadosMateriaCompletaResponse"/>
 *         &lt;element name="valicadoIDsTransacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaConsultaIDTransacao", propOrder = {
    "errointerno",
    "publicacao",
    "valicadoIDsTransacao"
})
public class RespostaConsultaIDTransacao {

    @XmlElement(required = true)
    protected String errointerno;
    @XmlElement(required = true)
    protected ArrayOfDadosMateriaCompletaResponse publicacao;
    @XmlElement(required = true)
    protected String valicadoIDsTransacao;

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
     * Obtém o valor da propriedade publicacao.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDadosMateriaCompletaResponse }
     *     
     */
    public ArrayOfDadosMateriaCompletaResponse getPublicacao() {
        return publicacao;
    }

    /**
     * Define o valor da propriedade publicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDadosMateriaCompletaResponse }
     *     
     */
    public void setPublicacao(ArrayOfDadosMateriaCompletaResponse value) {
        this.publicacao = value;
    }

    /**
     * Obtém o valor da propriedade valicadoIDsTransacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValicadoIDsTransacao() {
        return valicadoIDsTransacao;
    }

    /**
     * Define o valor da propriedade valicadoIDsTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValicadoIDsTransacao(String value) {
        this.valicadoIDsTransacao = value;
    }

}
