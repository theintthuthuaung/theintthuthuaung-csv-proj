package com.theintthuthuaung.factory;

import com.theintthuthuaung.domain.AbstractEntity;
import com.theintthuthuaung.domain.Conversation;

public class ConversationFactory extends AbstractFactory{

	@Override
	public AbstractEntity create(String sender, String message) {
		return new Conversation().sender(sender).message(message);
	}

}
