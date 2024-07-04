package com.wrok.api.response;

import com.wrok.api.domain.RankInfo;
import lombok.Data;

@Data
public class RankInfoResponse {
    private Long id;
    private String organization;
    private String topic;
    private String country;
    private int rankNum;
    private int totalNum;
    private int evalYear;
    private String reference;
    private int viewCount;
    private String iconImageUrl;

    public static RankInfoResponse fromEntity(RankInfo rankInfo) {
        RankInfoResponse response = new RankInfoResponse();
        response.setId(rankInfo.getId());
        response.setOrganization(rankInfo.getOrganization());
        response.setTopic(rankInfo.getTopic());
        response.setCountry(rankInfo.getCountry());
        response.setRankNum(rankInfo.getRankNum());
        response.setTotalNum(rankInfo.getTotalNum());
        response.setEvalYear(rankInfo.getEvalYear());
        response.setReference(rankInfo.getReference());
        response.setIconImageUrl(rankInfo.getIconImageUrl());
        response.setViewCount(rankInfo.getViewCount());
        return response;
    }
}