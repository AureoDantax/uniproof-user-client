package br.com.uniproof.integracao.userClient.client;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponse {
    private Integer statusCode;
    private String message;
    private String token;
    private String companyToken;
    private Integer termsOfUseVersion;

}
