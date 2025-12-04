package com.jpmc.midascore;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaConsumer {

    @KafkaListener(topics = "filler", groupId = "test-consumer-group")
    public void consume(Transaction transaction){
        System.out.println("Amount: "+transaction.getAmount());
    }

}
