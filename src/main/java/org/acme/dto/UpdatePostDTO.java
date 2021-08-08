package org.acme.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdatePostDTO {

    private Long idpost;
    private Long idtag;
    private String title;
    private String content;
}
