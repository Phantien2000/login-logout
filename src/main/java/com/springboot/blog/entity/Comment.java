package com.springboot.blog.entity;

import lombok.*;

import jakarta.persistence.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private String body;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
}
