package com.nilsedgar.player;

public class PlayerFactory {
    public Player getPlayer(PlayerType playerType) throws Exception {
        switch (playerType){
            case DEFENDER:
                // TODO ::
                return null;
            case FORWARD:
                // TODO ::
                return null;
            case GOALKEEPER:
                // TODO ::
                return null;
            case MIDFIELDER:
                // TODO ::
                return null;
            default:
                throw new Exception("No such player type");
        }
    }
}
