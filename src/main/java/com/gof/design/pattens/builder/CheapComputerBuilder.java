package com.gof.design.pattens.builder;

public class CheapComputerBuilder extends ComputerBuilder {

    @Override
    public void buildDisplay() {
        computer.setDisplay("Cheap display");
    }

    @Override
    public void buildSystemblock() {
        computer.setSystemBlock("Cheap system block");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("Cheap manipulators");
    }
}
