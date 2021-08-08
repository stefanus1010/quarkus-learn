package org.acme.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreatePostDTO {
    private String title;
    private String content;
}
