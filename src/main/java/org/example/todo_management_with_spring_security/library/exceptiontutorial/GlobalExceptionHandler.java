package org.example.todo_management_with_spring_security.library.exceptiontutorial;


import lombok.extern.slf4j.Slf4j;
import org.example.todo_management_with_spring_security.library.rest.BaseController;
import org.example.todo_management_with_spring_security.library.rest.MetaResponse;
import org.example.todo_management_with_spring_security.library.rest.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j  //debug süreçlerinde loglama yapmak için kullanılır. manuel olarak logger tanımlama zorunluluğunu ortadan kaldırır.
@RestControllerAdvice //tüm RestController sınıflarlında  fırlatılan hataları yakalayıp işleyebilen bir yapıdır
public class GlobalExceptionHandler extends BaseController {
    //Uygulamanın her yerinde tekrarlayan hata(bulunamadı hatası gibi ) işleme kodlarını önlemek
    // bu gibi tekrarlayan hatalı özel exceptionların toplandığı yerdir

    @ExceptionHandler(ResourceNotFoundException.class)
    public Response<MetaResponse> handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        return respond(MetaResponse.of("444" , resourceNotFoundException.getMessage()));
    }
}
