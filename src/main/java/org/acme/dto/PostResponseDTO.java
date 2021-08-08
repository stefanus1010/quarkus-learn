package org.acme.dto;

import lombok.Getter;
import lombok.Setter;
import org.acme.model.Tag;

import java.util.List;

@Setter
@Getter
public class PostResponseDTO {

    private Long idpost;
    private String title;
    private String content;
    private List<Tag> tags;


}
