package com.example.gazamung.univBoard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class PostDto {

        private Long memberIdx;
        private Long categoryId;        // 카테고리 ID
        private Long clubId;            // 모임 ID

        private String title;
        private String content;
        private LocalDateTime regDt;    // 생성일
        private LocalDateTime udtDt;

        private List<MultipartFile> postImage;

}