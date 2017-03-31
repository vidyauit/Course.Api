package io.javabrainSpringbootStarter.Topic;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;
	
@RequestMapping("/Topics")
public List<Topic>getAllTopics(){
	return topicservice.getAllTopics();
	
}
@RequestMapping("/Topics/{id}")
public Topic gettopic(@PathVariable  String id){
	return topicservice.gettopic(id);
}

@RequestMapping(method=RequestMethod.POST,value="topics")
public void  addTopic(@RequestBody Topic topic){
	topicservice.addTopic(topic);
	
}

@RequestMapping(method=RequestMethod.PUT,value="topics/{id}")
public void  updateTopic(@RequestBody Topic topic , @PathVariable String id){
	topicservice.updateTopic(id ,topic);
	
}

@RequestMapping(method=RequestMethod.DELETE,value="topics/{id}")
public void  deleteTopic(@RequestBody Topic topic , @PathVariable String id){
	topicservice.deleteTopic(id ,topic);
}
}
