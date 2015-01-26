
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DadosAcompanhamentoOficio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosAcompanhamentoOficio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDTransacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="acompanhamentoMateria" type="{http://data.xfire.ws.incom}ArrayOfDadosAcompanhamentoMateria"/>
 *         &lt;element name="dataAlteracaoEstado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataAserPublicada" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="empenho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorTipoPagamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="motivoIsencao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosAcompanhamentoOficio", propOrder = {
    "idTransacao",
    "ug",
    "acompanhamentoMateria",
    "dataAlteracaoEstado",
    "dataAserPublicada",
    "empenho",
    "identificadorTipoPagamento",
    "motivoIsencao"
})
public class DadosAcompanhamentoOficio {

    @XmlElement(name = "IDTransacao", required = true)
    protected String idTransacao;
    @XmlElement(name = "UG")
    protected int ug;
    @XmlElement(required = true)
    protected ArrayOfDadosAcompanhamentoMateria acompanhamentoMateria;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAlteracaoEstado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAserPublicada;
    @XmlElement(required = true)
    protected String empenho;
    protected int identificadorTipoPagamento;
    protected int motivoIsencao;

    /**
     * Obtém o valor da propriedade idTransacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTransacao() {
        return idTransacao;
    }

    /**
     * Define o valor da propriedade idTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTransacao(String value) {
        this.idTransacao = value;
    }

    /**
     * Obtém o valor da propriedade ug.
     * 
     */
    public int getUG() {
        return ug;
    }

    /**
     * Define o valor da propriedade ug.
     * 
     */
    public void setUG(int value) {
        this.ug = value;
    }

    /**
     * Obtém o valor da propriedade acompanhamentoMateria.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDadosAcompanhamentoMateria }
     *     
     */
    public ArrayOfDadosAcompanhamentoMateria getAcompanhamentoMateria() {
        return acompanhamentoMateria;
    }

    /**
     * Define o valor da propriedade acompanhamentoMateria.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDadosAcompanhamentoMateria }
     *     
     */
    public void setAcompanhamentoMateria(ArrayOfDadosAcompanhamentoMateria value) {
        this.acompanhamentoMateria = value;
    }

    /**
     * Obtém o valor da propriedade dataAlteracaoEstado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAlteracaoEstado() {
        return dataAlteracaoEstado;
    }

    /**
     * Define o valor da propriedade dataAlteracaoEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAlteracaoEstado(XMLGregorianCalendar value) {
        this.dataAlteracaoEstado = value;
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
     * Obtém o valor da propriedade empenho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpenho() {
        return empenho;
    }

    /**
     * Define o valor da propriedade empenho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpenho(String value) {
        this.empenho = value;
    }

    /**
     * Obtém o valor da propriedade identificadorTipoPagamento.
     * 
     */
    public int getIdentificadorTipoPagamento() {
        return identificadorTipoPagamento;
    }

    /**
     * Define o valor da propriedade identificadorTipoPagamento.
     * 
     */
    public void setIdentificadorTipoPagamento(int value) {
        this.identificadorTipoPagamento = value;
    }

    /**
     * Obtém o valor da propriedade motivoIsencao.
     * 
     */
    public int getMotivoIsencao() {
        return motivoIsencao;
    }

    /**
     * Define o valor da propriedade motivoIsencao.
     * 
     */
    public void setMotivoIsencao(int value) {
        this.motivoIsencao = value;
    }

}
