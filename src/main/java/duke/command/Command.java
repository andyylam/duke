package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.tasklist.TaskList;
import duke.ui.Ui;

public abstract class Command {
  public abstract boolean isExit();
  public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException;
}
