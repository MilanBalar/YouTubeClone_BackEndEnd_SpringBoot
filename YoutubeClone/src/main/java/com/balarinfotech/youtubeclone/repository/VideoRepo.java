package com.balarinfotech.youtubeclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balarinfotech.youtubeclone.models.TblVideo;

public interface VideoRepo extends JpaRepository<TblVideo, Long> {

}
