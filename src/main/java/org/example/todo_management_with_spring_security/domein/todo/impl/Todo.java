package org.example.todo_management_with_spring_security.domein.todo.impl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.todo_management_with_spring_security.domein.todo.impl.enums.TodoPriority;
import org.example.todo_management_with_spring_security.domein.todo.impl.enums.TodoStatus;
import org.example.todo_management_with_spring_security.library.rest.AbstractEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Table(name = Todo.TABLE)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Todo extends AbstractEntity {
    public static final String TABLE = "todo";
    private static final String TITLE = "title";
    private static final String DESCRIPTION = "description";
    private static final String DEADLINE = "deadline";
    private static final String PRIORITY = "priority";
    private static final String STATUS = "status";
    private static final String ASSIGNMENT_TO_USER = "assignment_to_user";

    @Column(name = TITLE)
    private String title;

    @Column(name = DESCRIPTION)
    private String description;

    @Column(name = DEADLINE)
    private Date deadline;

    @Column(name = PRIORITY)
    private TodoPriority priority;

    @Column(name = STATUS)
    private TodoStatus status;

}
