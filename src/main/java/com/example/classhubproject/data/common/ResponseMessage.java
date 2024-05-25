package com.example.classhubproject.data.common;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "API 응답 메시지")
public class ResponseMessage {

    // 게시판 ResponseMessage
    public static final String POST_COMMUNITY_SUCCESS = "게시글이 등록되었습니다";
    public static final String POST_COMMUNITY_IMAGE_SUCCESS = "게시글 이미지가 등록되었습니다";
    public static final String DELETE_COMMUNITY_IMAGE_SUCCESS = "게시글 이미지가 삭제되었습니다";
    public static final String POST_COMMUNITY_ERROR = "게시글 등록 중 문제가 발생했습니다";
    public static final String QUESTION_LIST_SUCCESS = "질문 게시판 조회 성공";
    public static final String STUDY_LIST_SUCCESS = "스터디 게시판 조회 성공";
    public static final String QUESTION_SUCCESS = "스터디 게시물 조회 성공";
    public static final String STUDY_SUCCESS = "스터디 게시물 조회 성공";
    public static final String MODIFY_COMMUNITY_SUCCESS = "게시물이 수정되었습니다.";
    public static final String MODIFY_COMMUNITY_ERROR = "게시물 수정 중 문제가 발생했습니다.";
    // 댓글 ResponseMessage  
    public static final String COMMENT_LIST_SUCCESS = "게시물 댓글목록 조회 성공";
    public static final String COMMENT_SUCCESS = "게시물 댓글 조회 성공";
    public static final String POST_COMMENT_SUCCESS = "댓글이 등록되었습니다.";
    public static final String POST_COMMENT_ERROR = "댓글 등록 중 오류가 발생했습니다.";
    public static final String DELETE_COMMENT_SUCCESS = "댓글이 삭제되었습니다.";
    public static final String DELETE_COMMENT_ERROR = "댓글 삭제 중 문제가 발생했습니다.";
    public static final String MODIFY_COMMENT_SUCCESS = "댓글이 수정되었습니다.";
    public static final String MODIFY_COMMENT_ERROR = "댓글 수정 중 문제가 발생했습니다.";
    // 게판 ResponseMessage
    public static final String FAVORITE_INSERT_SUCCESS = "좋아요가 등록되었습니다.";
    public static final String FAVORITE_CANCEL_SUCCESS = "좋아요가 취소되었습니다.";
    // 주문ResponseMessage
    public static final String DELETE_ORDER_SUCCESS = "진행중인 주문 목록에서 강의 개별 삭제 성공";
    public static final String DELETE_ORDER_ERROR = "진행중인 주문 목록에서 강의 개별 삭제 에러";
    public static final String ONGOING_ORDER_LIST_SUCCESS = "주문 진행 목록 조회 성공";
    public static final String ALREADY_OWNED = "이미 보유한 강의가 포함되어 있습니다.";
    public static final String ORDER_SUCCESS = "주문이 성공적으로 처리되었습니다.";
    public static final String ORDER_FAILED = "주문 처리 중 오류가 발생했습니다.";
    public static final String ORDER_LIST_SUCCESS = "주문 목록 조회 성공";
    public static final String ORDER_DETAIL_LIST_SUCCESS = "주문 상세 목록 조회 성공";
    // 강의 ResponseMessage
    public static final String EDITE_INSTRUCTOR_SUCCESS = "강사 정보 수정 성공";
    public static final String EDITE_INSTRUCTOR_ERROR = "강사 정보 수정 실패";
    public static final String INSERT_INSTRUCTOR_SUCCESS = "강사 정보 등록 성공";
    public static final String INSERT_INSTRUCTOR_ERROR = "강사 정보 등록 실패";
    public static final String LECTURE_INSERT_SUCCESS = "강의 등록 성공";
    public static final String LECTURE_INSERT_ERROR = "강의 등록 실패";
    public static final String LECTURE_SUCCESS = "강의 조회 성공";
    public static final String LECTURE_ERROR = "강의 조회 실패";
}

