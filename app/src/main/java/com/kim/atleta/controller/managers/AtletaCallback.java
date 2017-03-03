package com.kim.atleta.controller.managers;

import com.kim.atleta.model.Atleta;

import java.util.List;


public interface AtletaCallback {
    void onSuccess(List<Atleta> playerList);
    void onSucces();

    void onFailure(Throwable t);
}
