package com.RestService.RestApp;

import com.com.beans.topics.Topics;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService
{
    private List<Topics> listTopic = Arrays.asList(new Topics("1","Shrijeet Joshi","NCSU"),
            new Topics("2","Rahul Bhagwat","CSU"),
            new Topics("3","Sharvari Natu","NCSU"));

    public List<Topics> getAllTopics()
    {
        return listTopic;
    }

    public Topics getTopic(String id)
    {
        return listTopic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic()
    {

    }
}