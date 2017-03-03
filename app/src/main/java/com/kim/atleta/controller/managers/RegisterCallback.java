package com.kim.atleta.controller.managers;


public interface RegisterCallback {
    void onSuccess();
    void onFailure(Throwable t);
}
