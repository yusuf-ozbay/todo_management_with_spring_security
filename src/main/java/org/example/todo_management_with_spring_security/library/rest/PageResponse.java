package org.example.todo_management_with_spring_security.library.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PageResponse<T> {
    //Sayfalama yapısındaki veriyi tutan bir sınıftır.
    // Her sayfada belirli sayıda öğe bulunur ve kullanıcılar bu sayfalara erişebilir.

    private Page<T> items = Page.empty(); //Gelen Page<T> (sayfa yapısındaki veri).

    @Override
    public String toString() {  //: Veriyi string formatında döndürür. Sayfa içindeki her öğeyi ayrı ayrı yazdırır.
        StringBuilder sb = new StringBuilder("pageItems: ");
        if(items != null){
            items.forEach(item -> {
                sb.append(item.toString());
                sb.append('\n');
            });
        }
        return sb.toString();
    }
}
