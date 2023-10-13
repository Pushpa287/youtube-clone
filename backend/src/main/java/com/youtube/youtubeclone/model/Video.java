package com.youtube.youtubeclone.model;

import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Set;

public class Video {
    @Id
    private String id;
    private String title;
    private String description;
    private String userId;
    private Integer likes;
    private Integer disLikes;
    private Set<String> tags;
    private String videoUrl;
    private VideoStatus videoStatus;
    private Integer viewCount;
    private String thumbNailUrl;
    private List<Comment> commentList;


}
