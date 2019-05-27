package com.ff.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Resource
    private List topics= Arrays.asList(
                new Topic("spring", "framework"),
                new Topic("java", "core"));


    @RequestMapping("/topics")
    public List<Topic> getAllTopic(){
        return topics;
    }

    @RequestMapping("/topics/{foo}")
    public Topic getTopic(@PathVariable("foo") String id){

        return (Topic) topics.get(Integer.parseInt(id));
    }

}
