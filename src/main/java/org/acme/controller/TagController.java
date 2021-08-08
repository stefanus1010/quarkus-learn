package org.acme.controller;

import org.acme.dto.CreateTagDTO;
import org.acme.dto.TagsResponseDTO;
import org.acme.dto.UpdateTagDTO;
//import org.acme.exeption.ExceptionMessage;
import org.acme.model.PivotPostTag;
import org.acme.model.Post;
import org.acme.model.Tag;
//import org.acme.repository.PivotPostTagRepository;
//import org.acme.repository.TagRepository;
//import org.acme.service.TagService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
//import javax.transaction.Transactional;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tag")
//@Path("/tag")
public class TagController {

//    @Inject
//    private TagRepository tagRepository;

//    @Inject
//    private TagService tagService;

    @Inject
    private ModelMapper modelMapper;

//    @Inject
//    private PivotPostTagRepository pivotPostTagRepository;

//    @Transactional
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @PostMapping("/create-tag")
    @Transactional
    public Tag createtag(Tag tag){
        Tag.persist(tag);
        return tag;

    }

    @PatchMapping("/update-tag/{id}")
    @Transactional
    public Tag update (@PathVariable("id") Long id,Tag taag){
        Tag.findById(id);
        Tag tae=Tag.findById(id);
        tae.setLabel(taag.getLabel());

        Tag.persist(tae);
        return tae;
    }
//
//    @PatchMapping("/update-tag")
//    public Tag Updatetag(@ModelAttribute UpdateTagDTO request) throws ExceptionMessage {
//        Tag tag = tagRepository.findById(request.getIdtag()).orElseThrow(()-> new ExceptionMessage("maaf tag tidak ditemukan"));
//       tag.setLabel(request.getLabel());
//       tagRepository.save(tag);
//       return tag;
//    }
//
//    @DeleteMapping("/delete-byid")
//    public String delete(@ModelAttribute UpdateTagDTO request) throws ExceptionMessage {
//        return tagService.delete(request);
//    }
//
//    @GetMapping("/get-tags")
//    public List<TagsResponseDTO> getalltags(){
//        return tagRepository.findAll().stream().map(tg->{
//            TagsResponseDTO tagsResponseDTO = modelMapper.map(tg,TagsResponseDTO.class);
//            List<PivotPostTag> pivotPostTagList = pivotPostTagRepository.findByTag(tg);
//            List<Post> posts = pivotPostTagList.stream().map(ps->{
//                Post post = modelMapper.map(ps,Post.class);
//                return post;
//            }).collect(Collectors.toList());
//            tagsResponseDTO.setPosts(posts);
//            return tagsResponseDTO;
//        }).collect(Collectors.toList());
//    }

}
