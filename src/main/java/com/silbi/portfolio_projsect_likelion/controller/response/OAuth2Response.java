package com.silbi.portfolio_projsect_likelion.controller.response;



// 인증 서버에서 보내주는 데이터 형식을 정의해서 받을 수 있는 인터페이스
//
public interface OAuth2Response {

    String getProvider();

    String getProviderId();

    String getEmail();

    String getName();
}
