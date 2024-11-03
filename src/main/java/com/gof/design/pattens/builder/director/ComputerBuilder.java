package com.gof.design.pattens.builder.director;

public abstract class ComputerBuilder {

    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createNewComputer(){
        computer = new Computer();
    }

    public abstract void buildDisplay();
    public abstract void buildSystemblock();
    public abstract void buildManipulators();

}
