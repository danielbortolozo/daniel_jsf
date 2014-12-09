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
@Table(name="cidade")
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_cidade", nullable=false)
    private Integer id_cidade;
    @Column(name="nome", nullable = false)
    private String nome;
    
    @OneToMany
    @ForeignKey(name="FK_EnderecoCidade")
    private List<Endereco> enderecos;
    
    @Column
    private String descricao;
    
    public Cidade() {
    }

    public Integer getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(Integer id_cidade) {
        this.id_cidade = id_cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id_cidade);
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
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.id_cidade, other.id_cidade)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
