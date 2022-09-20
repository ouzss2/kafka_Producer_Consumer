package ouzss.pc.topicConf;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class TopicConfig {

	@Bean
	public NewTopic OuzssNewTopic() {
		return TopicBuilder.name("ouzssKafka").build();
	}
}
