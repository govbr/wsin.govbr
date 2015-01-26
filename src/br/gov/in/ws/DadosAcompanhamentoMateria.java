
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DadosAcompanhamentoMateria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosAcompanhamentoMateria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataPublicacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="estadoMateria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorMateria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="linkPublicacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motivoDevolucao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paginaPublicacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosAcompanhamentoMateria", propOrder = {
    "nup",
    "dataPublicacao",
    "estadoMateria",
    "identificadorMateria",
    "linkPublicacao",
    "motivoDevolucao",
    "paginaPublicacao"
})
public class DadosAcompanhamentoMateria {

    @XmlElement(name = "NUP", required = true)
    protected String nup;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPublicacao;
    @XmlElement(required = true)
    protected String estadoMateria;
    protected int identificadorMateria;
    @XmlElement(required = true)
    protected String linkPublicacao;
    @XmlElement(required = true)
    protected String motivoDevolucao;
    protected int paginaPublicacao;

    /**
     * Obtém o valor da propriedade nup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUP() {
        return nup;
    }

    /**
     * Define o valor da propriedade nup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUP(String value) {
        this.nup = value;
    }

    /**
     * Obtém o valor da propriedade dataPublicacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * Define o valor da propriedade dataPublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPublicacao(XMLGregorianCalendar value) {
        this.dataPublicacao = value;
    }

    /**
     * Obtém o valor da propriedade estadoMateria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoMateria() {
        return estadoMateria;
    }

    /**
     * Define o valor da propriedade estadoMateria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoMateria(String value) {
        this.estadoMateria = value;
    }

    /**
     * Obtém o valor da propriedade identificadorMateria.
     * 
     */
    public int getIdentificadorMateria() {
        return identificadorMateria;
    }

    /**
     * Define o valor da propriedade identificadorMateria.
     * 
     */
    public void setIdentificadorMateria(int value) {
        this.identificadorMateria = value;
    }

    /**
     * Obtém o valor da propriedade linkPublicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkPublicacao() {
        return linkPublicacao;
    }

    /**
     * Define o valor da propriedade linkPublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkPublicacao(String value) {
        this.linkPublicacao = value;
    }

    /**
     * Obtém o valor da propriedade motivoDevolucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDevolucao() {
        return motivoDevolucao;
    }

    /**
     * Define o valor da propriedade motivoDevolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDevolucao(String value) {
        this.motivoDevolucao = value;
    }

    /**
     * Obtém o valor da propriedade paginaPublicacao.
     * 
     */
    public int getPaginaPublicacao() {
        return paginaPublicacao;
    }

    /**
     * Define o valor da propriedade paginaPublicacao.
     * 
     */
    public void setPaginaPublicacao(int value) {
        this.paginaPublicacao = value;
    }

}
