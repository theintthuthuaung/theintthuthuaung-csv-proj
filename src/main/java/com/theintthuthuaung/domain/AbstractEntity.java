package com.theintthuthuaung.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class AbstractEntity {

	private long id;
	private long boId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getBoId() {
		return boId;
	}
	public void setBoId(long boId) {
		this.boId = boId;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
		.append("id:" + id)
		.append("boId:" + boId).toString();
	}
}
