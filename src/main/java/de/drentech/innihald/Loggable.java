package de.drentech.innihald;

import java.util.logging.Logger;

public interface Loggable {

    default Logger logger() {
        return Logger.getLogger(String.valueOf(this.getClass()));
    }
}
