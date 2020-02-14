package net.bitsrl.progacademiaspringboot.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Level {
    INTRO, INTERMEDIATE, ADVANCED, GURU;
    @JsonValue
    public int toValue() {
        return ordinal();
    }
}
