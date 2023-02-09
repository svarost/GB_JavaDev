package lesson6;

import java.util.*;

public class Notebook {
    private String brand;
    private String model;
    private String serialNumber;
    private String processor;
    private String memoryRAM;
    private String memoryROM;
    private String operationSystem;
    private String color;
    private String displaySize;
    private String displayType;

    private final Map<String, Integer> params =
            Map.of("brand", 0, "model", 1, "serialNumber", 2, "processor", 3,
                    "memoryRAM", 4, "memoryROM", 5, "operationSystem", 6);


    public Notebook() {
    }

    public Notebook(String brand, String model, String processor, String memoryRAM,
                    String memoryROM, String operationSystem) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.memoryRAM = memoryRAM;
        this.memoryROM = memoryROM;
        this.operationSystem = operationSystem;
    }

    private Integer isParam(String filter) {
        return params.getOrDefault(filter, null);
    }

    private boolean isParamEqual(String key, String value) {
        if (isParam(key) == null) {
            return false;
        } else {
            return switch (isParam(key)) {
                case 0 -> brand.contains(value);
                case 1 -> model.contains(value);
                case 2 -> serialNumber.contains(value);
                case 3 -> processor.contains(value);
                case 4 -> memoryRAM.contains(value);
                case 5 -> memoryROM.contains(value);
                case 6 -> operationSystem.contains(value);
                default -> false;
            };
        }
    }

    public boolean isRespond(Map<String, String> filters) {
        for (String key : filters.keySet()) {
            if (!isParamEqual(key, filters.get(key))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return brand + model + processor + memoryRAM + memoryROM + operationSystem + "\n";
    }

    private void initParams() {

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getProcessor() {
        return processor;
    }

    public String getMemoryRAM() {
        return memoryRAM;
    }

    public String getMemoryROM() {
        return memoryROM;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColor() {
        return color;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMemoryRAM(String memoryRAM) {
        this.memoryRAM = memoryRAM;
    }

    public void setMemoryROM(String memoryROM) {
        this.memoryROM = memoryROM;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }
}
