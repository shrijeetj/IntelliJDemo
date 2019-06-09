package com.RestService.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.com.beans.topics.Topics;
import java.util.*;
import java.lang.*;

@RestController
public class RestObjects
{
    @RequestMapping("/topics")
    public List<Topics> sendObjects()
    {
        List<Topics> listTopic = new ArrayList<Topics>();
        listTopic.add(new Topics(1,"Shrijeet Joshi","NCSU"));
        listTopic.add(new Topics(1,"Rahul Bhagwat","CSU"));
        listTopic.add(new Topics(1,"Sharvari Natu","NCSU"));

        return listTopic;
    }
}
