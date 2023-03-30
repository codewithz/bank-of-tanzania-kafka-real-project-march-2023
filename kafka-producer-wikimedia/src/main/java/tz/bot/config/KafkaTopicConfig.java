package tz.bot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    private String topicName="wikimedia_recentchanges";
    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(topicName)
                .replicas(1)
                .partitions(2)
                .build();
    }
}
