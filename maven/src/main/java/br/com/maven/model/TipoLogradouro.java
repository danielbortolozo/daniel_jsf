package br.com.maven.model;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="tipologradouro")
/**
 *
 * @author daniel
 */
public class TipoLogradouro {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_tipologradouro", nullable=false)
    private Integer id_tipologradouro;
    @Column(name="descricao", nullable = false)
    private String descricao;

    @OneToMany
    @ForeignKey(name="FK_TipoLogradouro_Endereco")
    private List<Endereco> enderecos;
    
    
    public TipoLogradouro() {
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    
    
    public Integer getId_tipologradouro() {
        return id_tipologradouro;
    }

    public void setId_tipologradouro(Integer id_tipologradouro) {
        this.id_tipologradouro = id_tipologradouro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id_tipologradouro);
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
        final TipoLogradouro other = (TipoLogradouro) obj;
        if (!Objects.equals(this.id_tipologradouro, other.id_tipologradouro)) {
            return false;
        }
        return true;
    }
    
    
    
}
