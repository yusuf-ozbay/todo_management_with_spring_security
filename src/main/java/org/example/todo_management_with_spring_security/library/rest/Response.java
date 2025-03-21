package org.example.todo_management_with_spring_security.library.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Response<T> {
    // başarılı bir ürün listeleme işlemi yaptığınızda,
    // yanıt şu şekilde olur: { data: ürün listesi, meta: işlem başarılı }.

    private T data;
    private MetaResponse meta;

    public Response(MetaResponse meta){
        this.meta = meta;
    }

    public Response(T data){
        this.data = data;
        this.meta = MetaResponse.success();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("data: ");
        sb.append(data != null ? data.toString() : "null");
        sb.append(", meta: ");
        sb.append(meta != null ? meta.toString() : "null");
        return sb.toString();
    }

}
