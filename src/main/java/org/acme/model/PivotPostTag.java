package org.acme.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.Setter;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Setter
@Getter
@Entity
//@EntityListeners(AuditingEntityListener.class)
public class PivotPostTag extends PanacheEntity {

//    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpivot;

    @ManyToOne
    @JoinColumn(name = "idpost")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "idtag")
    private Tag tag;

//    @CreatedDate
//    @Column(name="created_at")
//    private ZonedDateTime CreatedAt;
//
//    @LastModifiedDate
//    @Column(name = "updated_at")
//    private ZonedDateTime updatedAt;
}
