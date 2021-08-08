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
//@Table(name = "tag")
//@EntityListeners(AuditingEntityListener.class)
public class Tag extends PanacheEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idtag;

    @Column(name = "labels")
    private String label;


//    public static Tag getTagById(Long id){
//        return Tag.findById("id",id);
//    }
//    @CreatedDate
//    @Column(name="created_at")
//    private ZonedDateTime CreatedAt;
//
//    @LastModifiedDate
//    @Column(name = "updated_at")
//    private ZonedDateTime updatedAt;
}
