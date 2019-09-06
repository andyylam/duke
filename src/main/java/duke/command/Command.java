package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.tasklist.TaskList;

public abstract class Command {
    public abstract boolean isExit();

    public abstract String execute(TaskList tasks, Storage storage) throws DukeException;
}
