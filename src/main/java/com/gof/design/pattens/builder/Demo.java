package com.gof.design.pattens.builder;

public class Demo {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new CheapComputerBuilder());

        director.buildComputer();
        Computer computer = director.getComputer();
        System.out.println(computer);

        director.setComputerBuilder(new ExpensiveComputerBuilder());
        director.buildComputer();
        computer = director.getComputer();
        System.out.println(computer);
    }

}
