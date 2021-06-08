package com.game.api;

import com.game.utils.GameMoves;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "player-api")
public interface PlayerAPI {
    @RequestMapping(value = "/gamer/move",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public GameMoves getGameMove();
}
