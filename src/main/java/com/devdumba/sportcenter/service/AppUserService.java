package com.devdumba.sportcenter.service;

import com.devdumba.sportcenter.domain.AppUser;
import com.devdumba.sportcenter.domain.Role;

import java.util.List;

public interface AppUserService {
    AppUser saveUser(AppUser appUser);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
