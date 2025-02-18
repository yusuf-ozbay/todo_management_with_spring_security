package org.example.todo_management_with_spring_security.domein.todo.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TodoRepository extends JpaRepository<Todo,String>, JpaSpecificationExecutor<Todo> {

    //JpaSpesificationExecuter dinamik sorgular oluşturmak için kullanılır (sorguları runtime'da oluşturulup çalıştırılabilir).


}