//package org.acme.service;
//
//
//import org.acme.dto.UpdateTagDTO;
//import org.acme.exeption.ExceptionMessage;
//import org.acme.model.PivotPostTag;
//import org.acme.model.Tag;
//import org.acme.repository.PivotPostTagRepository;
//import org.acme.repository.PostRepository;
//import org.acme.repository.TagRepository;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.CollectionUtils;
//
//import javax.enterprise.context.ApplicationScoped;
//import javax.inject.Inject;
//import java.util.List;
//
//@ApplicationScoped
//public class TagServiceImpl implements TagService{
//
//    @Inject
//    private TagRepository tagRepository;
//
//    @Inject
//    private PivotPostTagRepository pivotPostTagRepository;
//
//    @Inject
//    private PostRepository postRepository;
//
//    @Inject
//    private ModelMapper modelMapper;
//
//    @Override
//    public String delete(UpdateTagDTO request) throws ExceptionMessage {
//        Tag tag = tagRepository.findById(request.getIdtag()).orElseThrow(()-> new ExceptionMessage("maaf tag tidak ditemukan"));
//
//        List<PivotPostTag> pivotPostTagList= pivotPostTagRepository.findByTag(tag);
//
//        if(!CollectionUtils.isEmpty(pivotPostTagList)){
//            pivotPostTagRepository.deleteAll(pivotPostTagList);
//        }
//        tagRepository.delete(tag);
//        String result="sukses delete tag";
//
//        return result;
//    }
//}
