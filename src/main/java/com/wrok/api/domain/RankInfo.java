package com.wrok.api.domain;

import com.wrok.api.request.RankInfoRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class RankInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public static RankInfo fromRequest(RankInfoRequest request) {
        RankInfo rankInfo = new RankInfo();
        rankInfo.organization = request.getOrganization();
        rankInfo.topic = request.getTopic();
        rankInfo.country = request.getCountry();
        rankInfo.rankNum = request.getRankNum();
        rankInfo.totalNum = request.getTotalNum();
        rankInfo.evalYear = request.getEvalYear();
        rankInfo.reference = request.getReference();
        rankInfo.iconImageUrl = request.getIconImageUrl();
        rankInfo.viewCount = 0; // Default viewCount to 0
        return rankInfo;
    }
}