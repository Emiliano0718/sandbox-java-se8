package com.demo.polymorphism.composition;

public class Car {

    private String color;
    private int numberOfTyres;
    private Engine engine;


    public Car( String color, int numberOfTyres,
        String engineType, String engineName, String enginePower ){

            this.color = color;
            this.numberOfTyres = numberOfTyres;
            
            this.engine = new Engine();
            this.engine.setEngineType(engineType);
            this.engine.setEngineName(engineName);
            this.engine.setEnginePower(enginePower);
    }



    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumberOfTyres() {
        return numberOfTyres;
    }
    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }


    public String getEngineType(){
        return this.engine.getEngineType();
    }

    public String getEngineName(){
        return this.engine.getEngineName();
    }

    public String getEnginePower(){
        return this.engine.getEnginePower();
    }

}
