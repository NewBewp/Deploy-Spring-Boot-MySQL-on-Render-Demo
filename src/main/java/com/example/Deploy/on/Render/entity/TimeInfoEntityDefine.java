package com.example.Deploy.on.Render.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import java.sql.Timestamp;

@Data
@MappedSuperclass
public abstract class TimeInfoEntityDefine extends EntityDefine {
    @Column(name = "created_date", updatable = false)
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(name = "updated_date")
    @UpdateTimestamp
    private Timestamp updatedDate;
}
