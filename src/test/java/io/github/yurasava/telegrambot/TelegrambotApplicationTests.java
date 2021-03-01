package io.github.yurasava.telegrambot;

import io.github.yurasava.telegrambot.config.Mapper;
import io.github.yurasava.telegrambot.service.MessageService;
import io.github.yurasava.telegrambot.service.TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest (classes = {TelegramBot.class, Mapper.class, MessageService.class})
class TelegrambotApplicationTests {

	@Test
	void contextLoads() {
	}

}
