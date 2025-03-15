package org.example.todo_management_with_spring_security.library.exception;

import lombok.Getter;
import org.example.todo_management_with_spring_security.library.enums.MessageCodes;

@Getter
public class CoreException {
    private final MessageCodes code;
    private final Object[] args;

    public CoreException(MessageCodes code, Object... args) {
        this.code = code;
        this.args = args;
    }
}
