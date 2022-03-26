package com.vodafone.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "comment")
    private String comment;

    @OneToOne(targetEntity = Gamer.class)
    @JoinColumn(name = "gamer_id")
    private Gamer gamer;

    @ManyToOne
    @JoinColumn(name = "article_id")
    @JsonIgnore
    private Article article;

}
