package org.example.todo_management_with_spring_security.library.rest;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@Getter
@MappedSuperclass //Bu sınıf entity sınıfı değildir,ancak diğer entity sınıfları tarafından kalıtım yoluyla kullanılabilir ve bu sınıftan türeyen sınıflar bu sınıftaki field'ları kullanır
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(of = "id")//Bu sınıf için equals() ve hashCode() metodlarını otomatik olarak oluşturur.ve id'ye göre çalışmasını sağlar

public abstract class AbstractEntity implements Serializable {

    @Id
    @Column
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")//UUID'nin nasıl üretileceğini belirtir  uuid2 standart bir UUID iretim stratejisidir
    private String id;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP) // veritabanında bir tarih-saat (timestamp) türünde saklanacağını belirtir.
    @Column(nullable = false)
    private Date created;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date modified;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[id" + id + "]";
    }

}
