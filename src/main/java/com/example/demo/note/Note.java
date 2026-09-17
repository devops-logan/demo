package com.example.demo.note;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "notes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;
    private String password;
    private Integer readCount;
    private String encoding;
    private String homepage;
    private LocalDateTime modifyDate;
    private String modifyIp;

    private String name;
    private LocalDateTime postDate;
    private String postIp;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String category;

    private String fileName;
    private Integer fileSize;
    private Integer downCount;

    private Integer ref;
    private Integer step;
    private Integer refOrder;
    private Integer answerNum;
    private Integer parentNum;

    private Integer commentCount;

    private Integer num;
    private Integer userId;
    private Integer categoryId;
    private Integer boardId;
    private Integer applicationId;

}
