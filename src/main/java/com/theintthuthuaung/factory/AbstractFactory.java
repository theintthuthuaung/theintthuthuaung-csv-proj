package com.theintthuthuaung.factory;

import com.theintthuthuaung.domain.AbstractEntity;

public abstract class AbstractFactory {

	public abstract AbstractEntity create(String sender, String message); 
}
