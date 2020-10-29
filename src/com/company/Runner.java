package com.company;

public class Runner extends Thread {


    private int ID;
    private int direction;

    public Runner(int ID, int direction) {
        this.ID = ID;
        this.direction = direction;
    }

    public synchronized void run() {
        try {
            if (ID <5&& direction==1){
                System.out.println("Бегун"+" "+ID+" Берет палочку ");
                System.out.println("Бегун"+" "+ID+ "  Бежит к бегуну  "+ (ID+1));
              sleep(5000);
            }
            if (ID==5) {
                System.out.println("Бегун"+" "+ID+" "+"  Берет палочку");
                System.out.println("Бегун"+" "+ID+ " "+" Берет палочку и бежит к финешу");
                System.out.println("Бегун"+" "+ID+" " +"  Бежит к бегуну"+ (ID-1));
                sleep(5000);
            }
            if (ID>1&&direction==-1) {
                System.out.println("Бегун" +" "+ " " + ID + " Берет палочку ");
                System.out.println("Бегун" +" "+" " + ID + " Бежит к бегуну " + (ID - 1));
            }

            if (ID==1&&direction==-1) {
                System.out.println("Бегун" +" "+ ID + " Берет палочку ");
                        sleep(5000);
        }


    }catch(Exception e)

    {

    }
}
}




