package lesson6;

public class Notebook {
    String brand;
    String model;
    String serialNumber;
    String processor;
    String memoryRAM;
    String memoryROM;
    String operationSystem;
    String color;
    int displaySize;
    String displayType;

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

    public int getDisplaySize() {
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

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }
}
