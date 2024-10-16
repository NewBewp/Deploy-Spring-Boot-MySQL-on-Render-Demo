package com.example.Deploy.on.Render.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "channel")
@Data
public class Channel extends EntityDefine {
    @Column(nullable = false)
    String name; // Tên của channel

    String description;

    Boolean is_private;

    @ManyToOne
    @JoinColumn(name = "workspace_id")
    Workspace workspaces;
}
