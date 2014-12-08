package br.com.maven.model;

import java.io.Serializable;
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
@Table
/**
 *
 * @author daniel
 */
public class TipoEndereco implements Serializable{
    
     private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_tipoendereco", nullable=false)
    private Integer id_tipoendereco;
    @Column(name="descricao", nullable = false)
    private String descricao;
    
    @OneToMany
    @ForeignKey(name="FK_TipoEndereco_Endereco")
    private List<Endereco> enderecos;

    public TipoEndereco() {
    }

    public Integer getId_tipoendereco() {
        return id_tipoendereco;
    }

    public void setId_tipoendereco(Integer id_tipoendereco) {
        this.id_tipoendereco = id_tipoendereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id_tipoendereco);
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
        final TipoEndereco other = (TipoEndereco) obj;
        if (!Objects.equals(this.id_tipoendereco, other.id_tipoendereco)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
