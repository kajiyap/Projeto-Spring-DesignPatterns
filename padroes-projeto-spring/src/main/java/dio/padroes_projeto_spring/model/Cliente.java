package dio.padroes_projeto_spring.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;

    @ManyToOne /* Cliente tem somente um endereço, mas vários clientes podem ser vinculados a um endereço */
    private Endereco endereco;
    
    /* Getters */
    public Endereco getEndereco() {
        return endereco;
    }
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    /* Setters */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
