package org.example.todo_management_with_spring_security.library.exception;

import lombok.Getter;
import org.example.todo_management_with_spring_security.library.enums.MessageCodes;

@Getter
public class CoreException {
    //Uygulamanın farklı yerlerinde hata yönetimini tek bir noktada toplamak
    // ve birden fazla argüman veya hata koduyla daha zengin bir hata mesajı yapısı sunmak için bu sınıfı yazdık

    private final MessageCodes code;; //hata kodları bu sınıfta yönetiliyor

    private final Object[] args; //hatanın bağlamına göre eklenebilecek argümanlardır

    public CoreException(MessageCodes code, Object... args) {
        this.code = code;
        this.args = args;
    }
}
