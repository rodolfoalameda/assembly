package com.cwi.assembly.domain.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity(name = "schedule")
@Table(name = "tb_schedule")
public class Schedule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "schedule")
    private String schedule;

    @Column(name = "details")
    private String details;

    @Column(name = "created_in")
    private LocalDateTime createdIn;

}
