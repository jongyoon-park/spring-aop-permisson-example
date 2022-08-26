package com.c.aopauth.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "PERMISSION")
public class PermissionEntity {

    @Id
    @GeneratedValue
    private Long permissionId;
    private String permissionName;
    private String permissionDescription;

    public Long getPermissionId() {
        return permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public String getPermissionDescription() {
        return permissionDescription;
    }

    @Override
    public String toString() {
        return "PermissionEntity{" +
                "permissionId=" + permissionId +
                ", permissionName='" + permissionName + '\'' +
                ", permissionDescription='" + permissionDescription + '\'' +
                '}';
    }
}
