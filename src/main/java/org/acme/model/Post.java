package org.acme.model;

import javax.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.Setter;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.ZonedDateTime;

@Setter
@Getter
@Entity
//@Table(name="post")
//@EntityListeners(AuditingEntityListener.class)
public class Post extends PanacheEntity {

//    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpost;

    @Column(name = "title")
    private String title;

    @Column(name = "contents")
    private String content;

//    @CreatedDate
//    @Column(name="created_at")
//    private ZonedDateTime CreatedAt;
//
//    @LastModifiedDate
//    @Column(name = "updated_at")
//    private ZonedDateTime updatedAt;

}
