package BuckLuckDuck.commands;

import BuckLuckDuck.options.Options;
import BuckLuckDuck.services.ScriptReader;
import com.microsoft.playwright.Page;

public class ExecuteScriptCommand extends Command {
    private final String scriptFileName;
    private final ScriptReader scriptReader;

    public ExecuteScriptCommand(Options options, String scriptFileName, ScriptReader scriptReader) {
        super(options);
        this.scriptFileName = scriptFileName;
        this.scriptReader = scriptReader;
    }

    @Override
    public void execute() {
        scriptReader.executeScriptFromResources(scriptFileName);
    }
}

