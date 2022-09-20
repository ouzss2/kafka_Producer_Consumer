package ouzss.pc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringKafkaProducerConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaProducerConsumerApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return SafeVarargs ->{
			
				kafkaTemplate.send("ouzssKafka","Hello Ouzss !" );
		
			
		};
	}

}
