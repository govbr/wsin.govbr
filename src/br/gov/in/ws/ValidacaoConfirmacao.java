
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ValidacaoConfirmacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ValidacaoConfirmacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errointerno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publicacaoConfirmacao" type="{http://data.xfire.ws.incom}ArrayOfDadosMateriaResponse"/>
 *         &lt;element name="validacaoCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validacaoDataPublicacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validacaoIDTransacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validacaoIdentificadorNorma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validacaoIdentificadorTipoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validacaoNUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validacaoRTF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validacaoSIORGCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validacaoSIORGMateria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidacaoConfirmacao", propOrder = {
    "errointerno",
    "publicacaoConfirmacao",
    "validacaoCliente",
    "validacaoDataPublicacao",
    "validacaoIDTransacao",
    "validacaoIdentificadorNorma",
    "validacaoIdentificadorTipoPagamento",
    "validacaoNUP",
    "validacaoRTF",
    "validacaoSIORGCliente",
    "validacaoSIORGMateria"
})
public class ValidacaoConfirmacao {

    @XmlElement(required = true)
    protected String errointerno;
    @XmlElement(required = true)
    protected ArrayOfDadosMateriaResponse publicacaoConfirmacao;
    @XmlElement(required = true)
    protected String validacaoCliente;
    @XmlElement(required = true)
    protected String validacaoDataPublicacao;
    @XmlElement(required = true)
    protected String validacaoIDTransacao;
    @XmlElement(required = true)
    protected String validacaoIdentificadorNorma;
    @XmlElement(required = true)
    protected String validacaoIdentificadorTipoPagamento;
    @XmlElement(required = true)
    protected String validacaoNUP;
    @XmlElement(required = true)
    protected String validacaoRTF;
    @XmlElement(required = true)
    protected String validacaoSIORGCliente;
    @XmlElement(required = true)
    protected String validacaoSIORGMateria;

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
     * Obtém o valor da propriedade publicacaoConfirmacao.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDadosMateriaResponse }
     *     
     */
    public ArrayOfDadosMateriaResponse getPublicacaoConfirmacao() {
        return publicacaoConfirmacao;
    }

    /**
     * Define o valor da propriedade publicacaoConfirmacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDadosMateriaResponse }
     *     
     */
    public void setPublicacaoConfirmacao(ArrayOfDadosMateriaResponse value) {
        this.publicacaoConfirmacao = value;
    }

    /**
     * Obtém o valor da propriedade validacaoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacaoCliente() {
        return validacaoCliente;
    }

    /**
     * Define o valor da propriedade validacaoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacaoCliente(String value) {
        this.validacaoCliente = value;
    }

    /**
     * Obtém o valor da propriedade validacaoDataPublicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacaoDataPublicacao() {
        return validacaoDataPublicacao;
    }

    /**
     * Define o valor da propriedade validacaoDataPublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacaoDataPublicacao(String value) {
        this.validacaoDataPublicacao = value;
    }

    /**
     * Obtém o valor da propriedade validacaoIDTransacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacaoIDTransacao() {
        return validacaoIDTransacao;
    }

    /**
     * Define o valor da propriedade validacaoIDTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacaoIDTransacao(String value) {
        this.validacaoIDTransacao = value;
    }

    /**
     * Obtém o valor da propriedade validacaoIdentificadorNorma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacaoIdentificadorNorma() {
        return validacaoIdentificadorNorma;
    }

    /**
     * Define o valor da propriedade validacaoIdentificadorNorma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacaoIdentificadorNorma(String value) {
        this.validacaoIdentificadorNorma = value;
    }

    /**
     * Obtém o valor da propriedade validacaoIdentificadorTipoPagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacaoIdentificadorTipoPagamento() {
        return validacaoIdentificadorTipoPagamento;
    }

    /**
     * Define o valor da propriedade validacaoIdentificadorTipoPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacaoIdentificadorTipoPagamento(String value) {
        this.validacaoIdentificadorTipoPagamento = value;
    }

    /**
     * Obtém o valor da propriedade validacaoNUP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacaoNUP() {
        return validacaoNUP;
    }

    /**
     * Define o valor da propriedade validacaoNUP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacaoNUP(String value) {
        this.validacaoNUP = value;
    }

    /**
     * Obtém o valor da propriedade validacaoRTF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacaoRTF() {
        return validacaoRTF;
    }

    /**
     * Define o valor da propriedade validacaoRTF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacaoRTF(String value) {
        this.validacaoRTF = value;
    }

    /**
     * Obtém o valor da propriedade validacaoSIORGCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacaoSIORGCliente() {
        return validacaoSIORGCliente;
    }

    /**
     * Define o valor da propriedade validacaoSIORGCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacaoSIORGCliente(String value) {
        this.validacaoSIORGCliente = value;
    }

    /**
     * Obtém o valor da propriedade validacaoSIORGMateria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacaoSIORGMateria() {
        return validacaoSIORGMateria;
    }

    /**
     * Define o valor da propriedade validacaoSIORGMateria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacaoSIORGMateria(String value) {
        this.validacaoSIORGMateria = value;
    }

}
