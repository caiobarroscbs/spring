package org.soulcodeacademy.empresa.domain;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;

@Entity
public class Dependente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDependente;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false)
    private Integer idade;

    public Dependente() {}

    public Dependente(Integer idDependente, String nome, Integer idade) {
        this.idDependente = idDependente;
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getIdDependente() {
        return idDependente;
    }

    public void setIdDependente(Integer idDependente) {
        this.idDependente = idDependente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
