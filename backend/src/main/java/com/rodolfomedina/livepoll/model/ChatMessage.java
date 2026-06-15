package com.rodolfomedina.livepoll.model;


//This servers like a DTO
// when client sends JSON, spring turns it into a ChatMessage Object
// when  send a ChatMessage out spring turns it back into a JSON for the client
public class ChatMessage {

    private String sender;
    private String content;

    public ChatMessage(){}

    public String getContent() {return content;}
    public String getSender() {return sender;}

    public void setContent(String content) {this.content = content;}
    public void setSender(String sender) {this.sender = sender;}
}
