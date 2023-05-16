package BuckLuckDuck.services;

import com.microsoft.playwright.Page;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class ScriptReader {
    public void executeScriptFromResources(Page page, String scriptFileName) {
        try {
            InputStream is = getClass().getResourceAsStream("/" + scriptFileName);
            if (is == null) {
                System.out.println("Script file not found: " + scriptFileName);
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String script = reader.lines().collect(Collectors.joining("\n"));
            reader.close();

            Object result = page.evaluate(script);

            if (result != null)
                System.out.println("Result from script " + scriptFileName + ": " + result.toString());
            else
                System.out.println(scriptFileName + " done");
        } catch (IOException e) {
            System.out.println("Error reading script file: " + scriptFileName);
        }
    }
}
