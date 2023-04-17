package com.litchi.object_;

public class ToString {
    public static void main(String[] args) {
        AA litchi = new AA("litchi");
        System.out.println(litchi);
    }
}

class AA{
    private String name;

    public AA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AA{" +
                "name='" + name + '\'' +
                '}';
    }
}
