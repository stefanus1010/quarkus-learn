package org.acme.controller;

import org.acme.dto.CreatePostDTO;
import org.acme.dto.PostResponseDTO;
import org.acme.dto.UpdatePostDTO;
//import org.acme.exeption.ExceptionMessage;
import org.acme.model.Post;
//import org.acme.repository.PostRepository;
//import org.acme.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
//
//    @Inject
//    private PostRepository postRepository;
//
//    @Inject
//    private PostService postService;
//
//
//    @PostMapping("/create")
//    public Post createpost(@ModelAttribute CreatePostDTO request){
//        Post post = new Post();
//        post.setContent(request.getContent());
//        post.setTitle(request.getTitle());
//        postRepository.save(post);
//        return post;
//    }
//
//    @PatchMapping("/update-post")
//    public Post updatepost (@ModelAttribute UpdatePostDTO request) throws ExceptionMessage {
//    return postService.update(request);
//    }
//
//    @DeleteMapping("/delete-post")
//    public String Deletepost(@ModelAttribute UpdatePostDTO request) throws ExceptionMessage{
//        return postService.deletepost(request);
//    }
//
//    @GetMapping("/getpost")
//    public List<PostResponseDTO> getpost(){
//        return postService.getpostall();
//    }
//
//    @GetMapping("/getpost-byid")
//    public PostResponseDTO getpost(@ModelAttribute ("idpost") Long idpost) throws ExceptionMessage {
//        return postService.getpostid(idpost);
//    }

}
