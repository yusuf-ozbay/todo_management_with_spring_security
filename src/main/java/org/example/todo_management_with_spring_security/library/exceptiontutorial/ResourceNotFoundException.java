package org.example.todo_management_with_spring_security.library.exceptiontutorial;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) //otomatik olarak 404 hatası fırlatması için
public class ResourceNotFoundException extends RuntimeException {

    //kaynağın bulunamadığı durumlarda fırlatılan özel bir istisnadır
    private String resourceName;
    private String fieldName;
    private String fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super(String.format("%s not found with %s : '%s' ", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
