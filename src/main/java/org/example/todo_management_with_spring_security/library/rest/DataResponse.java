package org.example.todo_management_with_spring_security.library.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DataResponse<T> {
    //bir liste halinde gelen veriyi ve o listedeki öğelerin sayısını dönen bir response yapısıdır.

    private List<T> items = List.of();
    private Integer numberOfItems ;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("listItems: ");
        if (items != null) {
            items.forEach(item -> {
                sb.append(item.toString());
                sb.append('\n');
            });
        }
        return sb.toString();
    }

}
