package com.dvlasenko;

import com.dvlasenko.controllers.Converter;

public class Main {
    private static final Converter controller = new Converter();

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        controller.controllerProcessing();
    }
}