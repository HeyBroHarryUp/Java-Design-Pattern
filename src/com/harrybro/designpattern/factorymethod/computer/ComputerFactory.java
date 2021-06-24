package com.harrybro.designpattern.factorymethod.computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerType type, String cpu, String ram) {
        Computer computer = type.getComputer();
        computer.setCPU(cpu);
        computer.setRam(ram);
        return computer;
    }

}
