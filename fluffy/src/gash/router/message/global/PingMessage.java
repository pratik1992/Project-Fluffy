package gash.router.message.global;

import global.Global;



/**
 * Created by karanbir on 11/20/16.
 */
public class PingMessage extends GlobalMessage {

    public PingMessage(int clusterId, int destinationId) {
        super(clusterId, destinationId);
    }

    @Override
    public Global.GlobalMessage getMessage() {
        globalMessageBuilder.setPing(true);
        return globalMessageBuilder.build();
    }
}
