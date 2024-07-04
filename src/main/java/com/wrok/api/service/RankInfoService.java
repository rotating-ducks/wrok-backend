package com.wrok.api.service;

import com.wrok.api.domain.RankInfo;
import com.wrok.api.exception.RankInfoNotFoundException;
import com.wrok.api.repository.RankInfoRepository;
import com.wrok.api.request.RankInfoRequest;
import com.wrok.api.response.RankInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class RankInfoService {

    private final RankInfoRepository rankInfoRepository;

    public List<RankInfoResponse> getAll() {
        return rankInfoRepository.findAll().stream()
                .map(RankInfoResponse::fromEntity)
                .collect(Collectors.toList());
    }

    public RankInfoResponse getOne(Long id) {
        return rankInfoRepository.findById(id)
                .map(RankInfoResponse::fromEntity)
                .orElseThrow(() -> new RankInfoNotFoundException("RankInfo not found."));
    }

    public RankInfoResponse create(RankInfoRequest request) {
        RankInfo rankInfo = RankInfo.fromRequest(request);
        RankInfo savedRankInfo = rankInfoRepository.save(rankInfo);
        return RankInfoResponse.fromEntity(savedRankInfo);
    }

}