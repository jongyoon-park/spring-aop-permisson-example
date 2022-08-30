package com.c.aopauth.service;

import com.c.aopauth.annotation.AccessiblePermission;
import com.c.aopauth.annotation.AnonymousCallable;
import com.c.aopauth.data.model.ApiPermission;
import com.c.aopauth.repository.PermissionEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.PermissionDeniedDataAccessException;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class PermissionService {

    private final PermissionEntityRepository permissionEntityRepository;

    public void isAllowedPermission(Method method) {
        AccessiblePermission accessiblePermission = method.getDeclaredAnnotation(AccessiblePermission.class);
        try {
            isNullApiPermission(accessiblePermission);
        } catch (Exception e) {
            log.error("권한 목록이 없습니다.");
        }

        ApiPermission[] apiPermissions = accessiblePermission.permissions();

        if (apiPermissions.length == 0) {
            return;
        }


    }

    public boolean isAnonymousCallable(Method method) {
        AnonymousCallable anonymousCallable = method.getDeclaredAnnotation(AnonymousCallable.class);
        return Objects.nonNull(anonymousCallable);
    }

    private boolean isNullApiPermission(AccessiblePermission accessiblePermission) throws Exception {
        if (Objects.isNull(accessiblePermission)) {
            throw new Exception();
        }
        return true;
    }

    private boolean hasAllowedPermission(ApiPermission[] apiPermissions) {

        return true;
    }
}
