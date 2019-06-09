package com.RestService.RestApp;

import com.com.beans.topics.Topics;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService
{
    private List<Topics> listTopic = Arrays.asList(new Topics(1,"Shrijeet Joshi","NCSU"),
            new Topics(1,"Rahul Bhagwat","CSU"),
            new Topics(1,"Sharvari Natu","NCSU"));
    public List<Topics> getAllTopics()
    {
        return listTopic;
    }
}