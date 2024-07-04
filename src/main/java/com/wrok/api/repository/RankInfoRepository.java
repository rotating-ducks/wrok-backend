package com.wrok.api.repository;


import com.wrok.api.domain.RankInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankInfoRepository extends JpaRepository<RankInfo, Long> {
}