package com.cwi.assembly.domain.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "vote")
@Table(name = "tb_vote")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "cpf")
    private String cpf;

    @Column(name = "vote")
    private String vote;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session session;

}
