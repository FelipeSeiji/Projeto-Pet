package com.projeto.pet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "doenca")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doenca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "diagnostico_id")
    private Diagnostico diagnostico;

    @OneToMany(mappedBy = "doenca", cascade = CascadeType.ALL)
    private List<Sintoma> sintomas;
}
