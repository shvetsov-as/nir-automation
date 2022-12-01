package com.niimto.automation.entity.classifier.security;

//import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;

public enum UserRole {
    ADMIN(Set.of(Permission.USER_MODIFY, Permission.USER_DELETE, Permission.USER_WRITE, Permission.USER_READ), "Администратор"),
    MANAGER(Set.of(Permission.USER_MODIFY, Permission.USER_WRITE, Permission.USER_READ), "Начальник"),
    PLANNER(Set.of(Permission.USER_MODIFY, Permission.USER_WRITE, Permission.USER_READ), "Планировщик"),
    USER(Set.of(Permission.USER_MODIFY, Permission.USER_WRITE, Permission.USER_READ), "Сотрудник"),
    UNKNOWN(Set.of(Permission.USER_FORBIDDEN), "Не определено");

    private final Set<Permission> permissions;
    private final String role;

    UserRole(Set<Permission> permissions, String role) {
        this.permissions = permissions;
        this.role = role;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

//    public Set<SimpleGrantedAuthority> getAuthorities (){
//        return getPermissions()
//                .stream()
//                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
//                .collect(Collectors.toSet());
//    }

    public String getRole() {
        return role;
    }
}
