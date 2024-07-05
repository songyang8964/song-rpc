package com.song.provider;

import com.song.common.service.UserService;
import com.song.registry.LocalRegistry;
import com.song.server.HttpServer;
import com.song.server.VertxHttpServer;

public class EasyProviderExample {
    public static void main(String[] args) {
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}

