package com.spring.mvc.chap05.entity;

import lombok.*;

import java.time.LocalDateTime;

/*
create table tbl_reply (
	reply_no INT(10) auto_increment,
	reply_text VARCHAR(1000) not null,
	reply_writer VARCHAR(100) not null,
	reply_date DATETIME default current_timestamp,
	board_no INT(10),
	constraint pk_reply primary key (reply_no),
	constraint fk_reply
	foreign key (board_no)
	references tbl_board (board_no)
	on delete cascade

	엔터티 만들때 컬럼명을 그대로 카멜케이스 해주는게 좋음
	이름 다르면 자동맵핑안됨
);
 */

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reply {

    private long replyNo; //10자리니까 long
    private String replyText;   // 댓글내용
    private String replyWriter; // 댓글작성자
    private LocalDateTime replyDate;    //댓글쓴시간
    private long boardNo;   //댓글 넘버
    private String account;
    private String profileImage;
}
