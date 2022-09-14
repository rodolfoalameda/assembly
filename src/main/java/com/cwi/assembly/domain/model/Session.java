package com.cwi.assembly.domain.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity(name = "session")
@Table(name = "tb_session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @OneToOne
    @JoinColumn(name = "session_id")
    private Schedule schedule;

    @Column(name = "expires_in")
    private LocalDateTime expiresIn;

    @OneToMany(mappedBy = "session")
    private List<Vote> votes;

}
