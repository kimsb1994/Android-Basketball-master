package com.kim.atleta.controller.managers;

import com.kim.atleta.model.UserToken;

public interface LoginCallback {
    void onSuccess(UserToken userToken);
    void onFailure(Throwable t);
}
