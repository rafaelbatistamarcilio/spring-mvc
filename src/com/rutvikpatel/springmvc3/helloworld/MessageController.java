package com.rutvikpatel.springmvc3.helloworld;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping("messages")
public class MessageController {

    Map<String, String> mensagens = new HashMap<String, String>();

    @Autowired
    private KafkaTemplate<String, String> template;

    @GetMapping("")
    public Map<String,String> mensagens() {
        return mensagens;
    }

    @GetMapping(value = "/send/{msg}")
    public void send(@PathVariable String msg) throws Exception {
        this.template.send("meu-topico", LocalDate.now().toString(), msg);
    }

    @KafkaListener(topics = "meu-topico", groupId = "chanel1")
    public void listen(ConsumerRecord<String, String> record) throws Exception {
        mensagens.put(record.key(), record.value());
    }
}
