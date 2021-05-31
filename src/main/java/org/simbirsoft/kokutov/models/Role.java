package org.simbirsoft.kokutov.models;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_USER, ROLE_MODERATOR, ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return this.toString();
    }
}