package br.com.uniproof.integracao.userClient.client;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class User {
    private String email;
    private String password;

}
