package gash.router.message.command;

import routing.Pipe;

/**
 * Created by karanbir on 11/22/16.
 */
public class FileNotFoundMessage extends CommandMessage {

    public FileNotFoundMessage(int nodeId) {
        super(nodeId);
    }

    @Override
    public Pipe.CommandMessage getMessage() {
        commandBuilder.setMessage("File not Found in Cluster");
        return commandBuilder.build();
    }
}
