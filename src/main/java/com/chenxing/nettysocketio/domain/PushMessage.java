package com.chenxing.nettysocketio.domain;

import java.io.Serializable;

public class PushMessage implements Serializable {
	private static final long serialVersionUID = 8965223926827445665L;
	private String sender;//发送者
	private String nickName;//发送者的昵称
	private String content;//发送内容
	private String receiver;//接收者

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}



}