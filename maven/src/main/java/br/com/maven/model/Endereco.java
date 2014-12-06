package br.com.maven.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



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
    
    
    
    
    
    
    
}
