package com.tmx.tanexamples.network;


import com.tmx.tanexamples.model.GitHubRepositorySearchResults;

import java.util.Map;

import io.reactivex.Observable;

public class NetworkApi {

    public static void search(Map<String, String> search) {
        Observable<GitHubRepositorySearchResults> searchResult = TanFactory.getSingleton().search(search);
    }

    public void getRepository(int id) {
        TanFactory.getSingleton().getRepository(id);
    }
}
