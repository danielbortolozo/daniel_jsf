/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.maven.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author daniel
 */
@Entity
@Table(name="sexo")

public class Sexo implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_sexo", nullable = false)
    private Integer id_sexo;
    @Column(name="descricao", unique = true, nullable = false, length = 9)
    private String descricao;

    @OneToMany(mappedBy = "sexo", fetch= FetchType.LAZY)
    @ForeignKey(name="FK_PessoaSexo")
    private List<Pessoa> pessoa;
    
    
    public Sexo() {
    }

    public Sexo(Integer id_sexo, String descricao) {
        this.id_sexo = id_sexo;
        this.descricao = descricao;
    }

    public List<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(List<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }

    public Integer getId_sexo() {
        return id_sexo;
    }

    public void setId_sexo(Integer id_sexo) {
        this.id_sexo = id_sexo;
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
        hash = 23 * hash + Objects.hashCode(this.id_sexo);
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
        final Sexo other = (Sexo) obj;
        if (!Objects.equals(this.id_sexo, other.id_sexo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sexo{" + "id_sexo=" + id_sexo + '}';
    }
   
}
