package com.RestService.RestApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.com.beans.topics.Topics;
import java.util.*;
import java.lang.*;

@RestController
public class RestObjects
{
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable("id") String id)
    {
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopic()
    {

    }
}
