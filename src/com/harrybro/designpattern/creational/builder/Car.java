package com.harrybro.designpattern.creational.builder;

public class Car {

    private Long id;
    private String name;

    private Car(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static class Builder {

        private Long id;
        private String name;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Car build() {
            return new Car(this.id, this.name);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
