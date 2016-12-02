package gash.router.message.command;

import routing.Pipe;

/**
 * Ping Message
 *
 * @author karanbir
 * @since 12 Nov,16.
 */
public class PingMessage extends CommandMessage {

    public PingMessage(int nodeId) {
        super(nodeId);
    }

    @Override
    public Pipe.CommandMessage getMessage() {
        commandBuilder.setPing(true);
        return commandBuilder.build();
    }
}
