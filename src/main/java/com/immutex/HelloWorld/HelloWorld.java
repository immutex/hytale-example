package com.immutex.HelloWorld;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.immutex.HelloWorld.command.HelloCommand;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class HelloWorld extends JavaPlugin {
    public HelloWorld(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        super.setup();

        this.getCommandRegistry().registerCommand(
                new HelloCommand("helloworld",
                        "A command that sends a message to the sender",
                        false)
        );
    }
}
