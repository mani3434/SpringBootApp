package com.fund.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fund.model.Topic;

@Service
public class TopicService {

	
	//List<String> li = Arrays.asList("a","b","c");
	
		List<Topic> topics = new ArrayList<>(
		
		 Arrays.asList(	
				new Topic("java","core java","core java is important to learn"),
				new Topic("database","sql, nosql","you should also concentrate on db"),
				new Topic("frameworks","hibernate, spring","you have to strong in handling issues")));
		
		public List<Topic> getTopics(){
			return topics;
		}

		public Topic getTopic(String s) {
			
			return topics.stream().filter((t)-> t.getId().equals(s)).findFirst().get();
			
//			for(Topic t: topics) {
//				if(t.getId().equals(s)) {
//					return t;
//				}
//			}
//			return null;
		}

		public Topic createTopic(Topic t) {
			
			topics.add(t);
			return t;
		}
		
		
		
		public Topic updateTopic(String id, Topic t1) {
			
			
			for(Topic t: topics) {
				if(t.getId().equals(id)) {
					
					t = t1;
					return t;
				}
			}
			return null;
			
		}

		public Topic deleteTopic(String id) {
			
			topics.removeIf(t-> t.getId().equals(id));
//			for(Topic t: topics) {
//				if(t.getId().equals(id)) {
//				 topics.remove(t);
//				return t;
//				}
//			}
			return null;

		}
					
				
	
	
	
}
