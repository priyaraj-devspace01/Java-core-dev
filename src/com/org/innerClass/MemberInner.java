package com.org.innerClass;


class Car
{
    private String model;
    private boolean isEngineOn;
     Car(String model, boolean isEngineOn)
     {
         this.model = model;
         this.isEngineOn = isEngineOn;
     }


      class Engine
     {
         public void start()
         {
             if(!isEngineOn)
             {
                 isEngineOn = true;
                 System.out.println("Car engine has started ");
             }
         }
         public void stop()
         {
             if(isEngineOn)
             {
                 isEngineOn = false;
                 System.out.println("Car engine has stopped");
             }
         }
     }
}
public class MemberInner {
    public static void main(String[] args) {
        Car car = new Car("Tata Safari", false);
        Car.Engine engineOfSafari = car.new Engine();
        engineOfSafari.start();
        engineOfSafari.stop();
    }
}
