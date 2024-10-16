package com.market.allForOneReview.domain.article.Controller;

import com.market.allForOneReview.domain.article.Service.NoticePostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class NoticePostController {
    private final NoticePostService noticePostService;

    @GetMapping("/notice")
    public String notice() {
        return "notice";
    }

    @GetMapping("/notice/detail")
    public String detail() {
        return "notice_detail";
    }

}
