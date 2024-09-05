package com.thda.thda_data_logger.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateDateRequest {
    private String fileName;
    private String fileType;
    private int fileSize;
    private Date timeSent;
    private Date timeReceived;
    private byte[] content;
}
