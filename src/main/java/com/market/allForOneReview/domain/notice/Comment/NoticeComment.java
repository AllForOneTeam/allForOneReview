package com.market.allForOneReview.domain.notice.Comment;

import com.market.allForOneReview.domain.notice.Notice.NoticePost;
import com.market.allForOneReview.domain.user.entity.SiteUser;
import com.market.allForOneReview.global.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class NoticeComment extends BaseEntity {


    @ManyToOne(fetch = FetchType.LAZY)
    private SiteUser author;

    @ManyToOne(fetch = FetchType.LAZY)
    private NoticePost noticePost;

    @Column(name = "content", nullable = false, length = 500)
    private String content;

}