//package org.acme.service;
//
//import org.acme.dto.PostResponseDTO;
//import org.acme.dto.UpdatePostDTO;
//import org.acme.exeption.ExceptionMessage;
//import org.acme.model.PivotPostTag;
//import org.acme.model.Post;
//import org.acme.model.Tag;
//import org.acme.repository.PivotPostTagRepository;
//import org.acme.repository.PostRepository;
//import org.acme.repository.TagRepository;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.apache.commons.lang.StringUtils;
//import org.springframework.util.CollectionUtils;
//import org.apache.commons.collections.MapUtils;
//import org.springframework.web.context.annotation.ApplicationScope;
//
//import javax.enterprise.context.ApplicationScoped;
//import javax.inject.Inject;
//import javax.management.relation.Role;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@ApplicationScoped
//public class PostServiceImpl implements PostService{
//
//    @Inject
//    private PostRepository postRepository;
//
//    @Inject
//    private PivotPostTagRepository pivotPostTagRepository;
//
//    @Inject
//    private ModelMapper modelMapper;
//
//    @Inject
//    private TagRepository tagRepository;
//
//
//    @Override
//    public Post update(UpdatePostDTO request) throws ExceptionMessage {
//        Post post = postRepository.findById(request.getIdpost()).orElseThrow(()->new ExceptionMessage("post maaf tidak ditemukan"));
//        Tag tag1 = new Tag();
//        PivotPostTag pivotPostTag = new PivotPostTag();
//        if(request.getIdtag() !=null && request.getIdtag() !=null){
//            Optional<Tag> tag = tagRepository.findById(request.getIdtag());
//            if(tag.isPresent()) {
//                tag1 = tag.get();
//
//            }
//        }
//        pivotPostTag.setPost(post);
//        pivotPostTag.setTag(tag1);
//
//        if (request.getContent() !=null && request.getContent() != ""){
//            post.setContent(request.getContent());
//        }
//        if (request.getTitle() !=null && request.getTitle() != ""){
//            post.setTitle(request.getTitle());
//        }
//        postRepository.save(post);
//        pivotPostTagRepository.save(pivotPostTag);
//        return post;
//    }
//
//    @Override
//    public String deletepost(UpdatePostDTO request) {
//
//        Optional<Post> post = postRepository.findById(request.getIdpost());
//        Post post1 = new Post();
//        List<PivotPostTag> pivotPostTagList = new ArrayList<>();
//        if(post.isPresent()){
//             post1 = post.get();
//            pivotPostTagList = pivotPostTagRepository.findByPost(post1);
//        }
//        if (!CollectionUtils.isEmpty(pivotPostTagList)){
//            pivotPostTagRepository.deleteAll(pivotPostTagList);
//        }
//        postRepository.delete(post1);
//        String result = "sukses delete";
//        return result;
//    }
//
//
//
//    @Override
//    public PostResponseDTO getpostid(Long idpost) throws ExceptionMessage {
//       Post post = postRepository.findById(idpost).orElseThrow(()-> new ExceptionMessage("maaf post tidak ditemukan"));
//
//       List<PivotPostTag> pivotPostTagList = pivotPostTagRepository.findByPost(post);
//        List<Tag> tags = pivotPostTagList.stream().map(e->{
//            Tag tag = modelMapper.map(e.getTag(),Tag.class);
//        return tag;
//        }).collect(Collectors.toList());
//        PostResponseDTO postResponseDTO = new PostResponseDTO();
//        postResponseDTO.setIdpost(post.getIdpost());
//        postResponseDTO.setContent(post.getContent());
//        postResponseDTO.setTitle(post.getTitle());
//        postResponseDTO.setTags(tags);
//        return postResponseDTO;
//    }
//
//    @Override
//    public List<PostResponseDTO> getpostall() {
//      List<Post> posts = postRepository.findAll();
//
//        List<PostResponseDTO> postResponseDTOS = posts.stream().map(p->{
//            PostResponseDTO postResponseDTO = modelMapper.map(p,PostResponseDTO.class);
//            List<PivotPostTag> pivotPostTagList = pivotPostTagRepository.findByPost(p);
//            List<Tag> tags = pivotPostTagList.stream().map(tg->{
//                Tag tag = modelMapper.map(tg,Tag.class);
//                return tag;
//            }).collect(Collectors.toList());
//            postResponseDTO.setTags(tags);
//            return postResponseDTO;
//        }).collect(Collectors.toList());
//
//        return postResponseDTOS;
//    }
//}
