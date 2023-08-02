package com.chat.room.Model;

import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private String from;
    private String text;
    private String to;
    private Date date;
    private Integer SenderId;
}
