package com.gof.design.pattens.builder;

public class ComputerDirector {

    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer(){
        return computerBuilder.getComputer();
    }

    public void buildComputer(){
        computerBuilder.createNewComputer();
        computerBuilder.buildDisplay();
        computerBuilder.buildSystemblock();
        computerBuilder.buildManipulators();
    }

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
}
