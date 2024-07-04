package com.wrok.api.request;

import lombok.Data;

@Data
public class RankInfoRequest {
    private String organization;
    private String topic;
    private String country;
    private int rankNum;
    private int totalNum;
    private int evalYear;
    private String reference;
    private String iconImageUrl;
}