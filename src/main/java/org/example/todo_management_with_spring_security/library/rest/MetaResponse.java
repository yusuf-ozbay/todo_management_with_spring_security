package org.example.todo_management_with_spring_security.library.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.todo_management_with_spring_security.library.enums.MessageCodes;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MetaResponse {
    //API yanıtlarına işlem durumu (başarılı, hata, vs.) gibi meta bilgiler eklemek için kullanılır.
    // Bu sayede istemci (client), işlem sonucunu kolayca anlayabilir.

    private String code;
    private String description;

    public static MetaResponse of(String code, String description) {
        return new MetaResponse(code, description);
    }

    public static MetaResponse success() { //başarı durumunda bir meta response sağlar
        return new MetaResponse(MessageCodes.SUCCESS.getCode(), MessageCodes.SUCCESS.getMessage());
    }


}
