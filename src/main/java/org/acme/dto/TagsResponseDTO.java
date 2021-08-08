package org.acme.dto;


import lombok.Getter;
import lombok.Setter;
import org.acme.model.Post;

import java.util.List;

@Setter
@Getter
public class TagsResponseDTO {

    private String label;

    private List<Post> posts;

}
