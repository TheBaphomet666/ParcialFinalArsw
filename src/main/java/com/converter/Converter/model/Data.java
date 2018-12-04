package com.converter.Converter.model;

public class Data {
    private String type;
    private double input;
    private double output;

    public Data(String type, double input, double output) {
        this.type = type;
        this.input = input;
        this.output = output;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "Data{" +
                "type='" + type + '\'' +
                ", input=" + input +
                ", output=" + output +
                '}';
    }
}
