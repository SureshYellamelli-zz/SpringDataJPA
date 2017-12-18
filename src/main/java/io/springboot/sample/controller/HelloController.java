package io.springboot.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/hello")
	public String sayHello() {
		return "Welcome to Spring !!!";
	}

	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/topics")
	public void setTopic(@RequestBody Topic topic) {
		topicService.setTopic(topic);
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id,topic);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/topics/{id}")
	public void setTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}	

}
