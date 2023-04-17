package com.litchi.extends_;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC();
        pc.setCPU("i7-10300p");
        pc.setStorage("16G");
        pc.setMemory("1TB");
        pc.setBrand("暗影骑士擎");
        NotePad notePad = new NotePad();
        notePad.setCPU("i5-10200h");
        notePad.setStorage("8G");
        notePad.setMemory("512G");
        notePad.setColor("Blue");

        System.out.println(pc.getDetails() + pc.getBrand());
        System.out.println("===============");
        System.out.println(notePad.getDetails() + notePad.getColor());
    }
}

class Computer {
    private String CPU;
    private String storage;
    private String memory;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDetails() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", storage='" + storage + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}

class PC extends Computer {
    private String brand;//品牌

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class NotePad extends Computer {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}