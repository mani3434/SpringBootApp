package com.fund.controller;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fund.model.Topic;
import com.fund.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	public TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> listOfTopics(){
		
		return topicService.getTopics();
	}
	
	
	
	@RequestMapping("/topics/{id}")
	public Topic listOfTopics(@PathVariable("id") String s ){
		
		return topicService.getTopic(s);
	}
	
	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public Topic createTopic(@RequestBody Topic t) {
		
		return topicService.createTopic(t);
	}
	
	
	@RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
	public Topic deleteTopic(@RequestBody Topic t, @PathVariable String id) {
		 t.setId(id);
		return topicService.updateTopic(id, t);
	}
	
	
	
	
	@RequestMapping(value = "/topics/{id}", method= RequestMethod.DELETE)
	public Topic deleteTopic(@PathVariable("id") String id) {
		
		return topicService.deleteTopic(id);
	}
}
