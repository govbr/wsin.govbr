
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DadosMateriaCompletaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosMateriaCompletaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HASH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDMateria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IDOficio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QLinhas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="dataAlteracaoEstado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataAserPublicado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataPublicacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="empenho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoMateria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorNorma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indentificadorTipoPagamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="linkPublicacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motivoIsencao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomeMateria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeUG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paginaPublicacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DadosMateriaCompletaResponse", propOrder = {
    "hash",
    "idMateria",
    "idOficio",
    "nup",
    "qLinhas",
    "ug",
    "altura",
    "dataAlteracaoEstado",
    "dataAserPublicado",
    "dataPublicacao",
    "empenho",
    "estadoMateria",
    "identificadorNorma",
    "indentificadorTipoPagamento",
    "linkPublicacao",
    "motivoIsencao",
    "nomeMateria",
    "nomeUG",
    "paginaPublicacao",
    "pdf",
    "valorCobrado"
})
public class DadosMateriaCompletaResponse {

    @XmlElement(name = "HASH", required = true)
    protected String hash;
    @XmlElement(name = "IDMateria")
    protected int idMateria;
    @XmlElement(name = "IDOficio")
    protected int idOficio;
    @XmlElement(name = "NUP", required = true)
    protected String nup;
    @XmlElement(name = "QLinhas")
    protected int qLinhas;
    @XmlElement(name = "UG")
    protected int ug;
    protected float altura;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAlteracaoEstado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAserPublicado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPublicacao;
    @XmlElement(required = true)
    protected String empenho;
    @XmlElement(required = true)
    protected String estadoMateria;
    protected int identificadorNorma;
    protected int indentificadorTipoPagamento;
    @XmlElement(required = true)
    protected String linkPublicacao;
    protected int motivoIsencao;
    @XmlElement(required = true)
    protected String nomeMateria;
    @XmlElement(required = true)
    protected String nomeUG;
    protected int paginaPublicacao;
    @XmlElement(required = true)
    protected String pdf;
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
     * Obtém o valor da propriedade idMateria.
     * 
     */
    public int getIDMateria() {
        return idMateria;
    }

    /**
     * Define o valor da propriedade idMateria.
     * 
     */
    public void setIDMateria(int value) {
        this.idMateria = value;
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
     * Obtém o valor da propriedade dataAserPublicado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAserPublicado() {
        return dataAserPublicado;
    }

    /**
     * Define o valor da propriedade dataAserPublicado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAserPublicado(XMLGregorianCalendar value) {
        this.dataAserPublicado = value;
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
     * Obtém o valor da propriedade identificadorNorma.
     * 
     */
    public int getIdentificadorNorma() {
        return identificadorNorma;
    }

    /**
     * Define o valor da propriedade identificadorNorma.
     * 
     */
    public void setIdentificadorNorma(int value) {
        this.identificadorNorma = value;
    }

    /**
     * Obtém o valor da propriedade indentificadorTipoPagamento.
     * 
     */
    public int getIndentificadorTipoPagamento() {
        return indentificadorTipoPagamento;
    }

    /**
     * Define o valor da propriedade indentificadorTipoPagamento.
     * 
     */
    public void setIndentificadorTipoPagamento(int value) {
        this.indentificadorTipoPagamento = value;
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

    /**
     * Obtém o valor da propriedade nomeMateria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMateria() {
        return nomeMateria;
    }

    /**
     * Define o valor da propriedade nomeMateria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMateria(String value) {
        this.nomeMateria = value;
    }

    /**
     * Obtém o valor da propriedade nomeUG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeUG() {
        return nomeUG;
    }

    /**
     * Define o valor da propriedade nomeUG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeUG(String value) {
        this.nomeUG = value;
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
