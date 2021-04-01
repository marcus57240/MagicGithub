package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import com.openclassrooms.magicgithub.ui.user_list.ListUserActivity;

import java.util.List;
import androidx.annotation.Nullable;

public interface ApiService {
    List<User> getUsers();
    void generateRandomUser();
    void deleteUser(User username);
}
