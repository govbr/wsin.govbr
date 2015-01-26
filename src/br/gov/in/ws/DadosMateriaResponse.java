
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DadosMateriaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosMateriaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HASH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QLinhas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="dataAserPublicada" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reciboConfirmacao" type="{http://data.xfire.ws.incom}ReciboConfirmacaoResponse"/>
 *         &lt;element name="validacaoRTF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorCobrado" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosMateriaResponse", propOrder = {
    "hash",
    "qLinhas",
    "altura",
    "dataAserPublicada",
    "pdf",
    "reciboConfirmacao",
    "validacaoRTF",
    "valorCobrado"
})
public class DadosMateriaResponse {

    @XmlElement(name = "HASH", required = true)
    protected String hash;
    @XmlElement(name = "QLinhas")
    protected int qLinhas;
    protected float altura;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAserPublicada;
    @XmlElement(required = true)
    protected String pdf;
    @XmlElement(required = true)
    protected ReciboConfirmacaoResponse reciboConfirmacao;
    @XmlElement(required = true)
    protected String validacaoRTF;
    protected float valorCobrado;

    /**
     * Obtém o valor da propriedade hash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHASH() {
        return hash;
    }

    /**
     * Define o valor da propriedade hash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHASH(String value) {
        this.hash = value;
    }

    /**
     * Obtém o valor da propriedade qLinhas.
     * 
     */
    public int getQLinhas() {
        return qLinhas;
    }

    /**
     * Define o valor da propriedade qLinhas.
     * 
     */
    public void setQLinhas(int value) {
        this.qLinhas = value;
    }

    /**
     * Obtém o valor da propriedade altura.
     * 
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Define o valor da propriedade altura.
     * 
     */
    public void setAltura(float value) {
        this.altura = value;
    }

    /**
     * Obtém o valor da propriedade dataAserPublicada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAserPublicada() {
        return dataAserPublicada;
    }

    /**
     * Define o valor da propriedade dataAserPublicada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAserPublicada(XMLGregorianCalendar value) {
        this.dataAserPublicada = value;
    }

    /**
     * Obtém o valor da propriedade pdf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdf() {
        return pdf;
    }

    /**
     * Define o valor da propriedade pdf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdf(String value) {
        this.pdf = value;
    }

    /**
     * Obtém o valor da propriedade reciboConfirmacao.
     * 
     * @return
     *     possible object is
     *     {@link ReciboConfirmacaoResponse }
     *     
     */
    public ReciboConfirmacaoResponse getReciboConfirmacao() {
        return reciboConfirmacao;
    }

    /**
     * Define o valor da propriedade reciboConfirmacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ReciboConfirmacaoResponse }
     *     
     */
    public void setReciboConfirmacao(ReciboConfirmacaoResponse value) {
        this.reciboConfirmacao = value;
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
     * Obtém o valor da propriedade valorCobrado.
     * 
     */
    public float getValorCobrado() {
        return valorCobrado;
    }

    /**
     * Define o valor da propriedade valorCobrado.
     * 
     */
    public void setValorCobrado(float value) {
        this.valorCobrado = value;
    }

}
