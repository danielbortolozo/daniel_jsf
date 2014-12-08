package br.com.maven.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;



@Entity
@Table(name="endereco")
        
        

class Endereco implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="id_endereco", nullable=false)
    private Integer id_endereco;
    @Column(name="bairro", length = 60)
    private String bairro;
    @Column(name="logradouro", length = 60)
    private String logradouro;
    @Column(name="cep", length = 20)
    private String cep;
    @Column(name="complemento", length = 50)
    private String complemento;
    @Column(name="numero", length = 50)
    private String numero;
    
    @OneToOne(optional=true, fetch = FetchType.LAZY)
    @ForeignKey(name="FK_Endereco_Pessoa")
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id_pessoa")
    private Pessoa id_pessoa;
    
    @ManyToOne(optional=false, fetch = FetchType.LAZY)
    @ForeignKey(name="FK_Endereco_TipoLogradouro")
    @JoinColumn(name="id_tipologradouro", referencedColumnName = "id_tipologradouro")
    private TipoLogradouro id_tipologradouro;
    
    @ManyToOne(optional=false, fetch = FetchType.LAZY)
    @ForeignKey(name="FK_Endereco_TipoEndereco")
    @JoinColumn(name="id_tipoendereco", referencedColumnName = "id_tipoendereco")
    private TipoEndereco id_tipoendereco;
    
    @ManyToOne(optional=false, fetch = FetchType.LAZY)
    @ForeignKey(name="FK_Endereco_Estado")
    @JoinColumn(name="id_estado", referencedColumnName = "id_estado")
    private Estado id_estado;
    
    @ManyToOne(optional=false, fetch = FetchType.LAZY)
    @ForeignKey(name="FK_Endereco_Cidade")
    @JoinColumn(name="id_cidade", referencedColumnName = "id_cidade")
    private Cidade id_cidade;

    public Endereco() {
       this.id_cidade = new Cidade();
       this.id_estado = new Estado();
       this.id_tipoendereco = new TipoEndereco();
       this.id_tipologradouro = new TipoLogradouro();
       this.id_pessoa = new Pessoa();
       
    }

    public Integer getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Integer id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Pessoa id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public TipoLogradouro getId_tipologradouro() {
        return id_tipologradouro;
    }

    public void setId_tipologradouro(TipoLogradouro id_tipologradouro) {
        this.id_tipologradouro = id_tipologradouro;
    }

    public TipoEndereco getId_tipoendereco() {
        return id_tipoendereco;
    }

    public void setId_tipoendereco(TipoEndereco id_tipoendereco) {
        this.id_tipoendereco = id_tipoendereco;
    }

    public Estado getId_estado() {
        return id_estado;
    }

    public void setId_estado(Estado id_estado) {
        this.id_estado = id_estado;
    }

    public Cidade getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(Cidade id_cidade) {
        this.id_cidade = id_cidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id_endereco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.id_endereco, other.id_endereco)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
