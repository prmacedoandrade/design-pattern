package com.gof.design.pattens.builder.director;

public class ExpensiveComputerBuilder extends ComputerBuilder {

    @Override
    public void buildDisplay() {
        computer.setDisplay("Expensive display");
    }

    @Override
    public void buildSystemblock() {
        computer.setSystemBlock("Expensive system block");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("Expensive manipulators");
    }
}
