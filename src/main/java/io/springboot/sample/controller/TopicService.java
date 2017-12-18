package io.springboot.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getTopics() {
		return (List<Topic>) topicRepository.findAll();
	}
	
	public void setTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public Topic getTopic(String id) {
		return topicRepository.findOne(id);

	}

	public void updateTopic(String id, Topic topic) {		
		topicRepository.save(topic);
		
	}
	public void deleteTopic(String id) {		
		topicRepository.delete(id);
	}

}
