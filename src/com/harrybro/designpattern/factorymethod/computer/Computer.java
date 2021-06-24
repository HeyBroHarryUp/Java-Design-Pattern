package com.harrybro.designpattern.factorymethod.computer;

public interface Computer {

    String getType();
    String getRam();
    String getCPU();
    void setRam(String ram);
    void setCPU(String cpu);


}
