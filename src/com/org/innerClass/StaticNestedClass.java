package com.org.innerClass;


class Computer {
    String model;
    OperatingSys operatingSys;

    public Computer(String model, String osName) {
        this.model = model;
        this.operatingSys = new OperatingSys(osName);
    }

    public OperatingSys getOperatingSys() {
        return operatingSys;
    }

    class OperatingSys{
        String osName;

        public OperatingSys(String osName) {
            this.osName = osName;
        }
        public String getOsName() {
            return osName;
        }
    }


    static class USB
    {
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {


        Computer computer = new Computer("xyz", "windows");
        System.out.println(  computer.getOperatingSys().getOsName());



        Computer.USB usb1 = new Computer.USB("usb1");
        System.out.println(usb1.getType());

    }
}
