package com.harrybro.designpattern.factorymethod.computer;

public class Desktop implements Computer {

    private final String type = "Desktop";
    private String ram;
    private String cpu;

    public Desktop() {
    }

    public Desktop(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

}
