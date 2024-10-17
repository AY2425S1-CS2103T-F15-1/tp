package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.logic.commands.PriorityCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new PriorityCommand object
 */
public class PriorityCommandParser implements Parser<PriorityCommand> {

    @Override
    public PriorityCommand parse(String args) throws ParseException {
        try {
            String[] splitArgs = args.trim().split("\\s+");
            int id = Integer.parseInt(splitArgs[1]);
            if (splitArgs[0].equalsIgnoreCase("deletelevel")) { // check if command is deletelevel
                return new PriorityCommand(id, 3, true); // handle delete/reset to default level
            } else {
                int level = Integer.parseInt(splitArgs[3]);
                return new PriorityCommand(id, level, false);
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, PriorityCommand.MESSAGE_USAGE));
        }
    }
}
