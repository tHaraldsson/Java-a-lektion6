package se.tommy.Klocka;

import java.time.LocalDateTime;

public class Klocka {
    public static void main(String[] args) {
        //NUVARANDE TID
        LocalDateTime now = LocalDateTime.now();

        //BYGGA KLOCKA APP

        int h = now.getHour();      //TIMMAR
        int m = now.getMinute();      //MINUTER
        int s = now.getSecond();      //SEKUNUDER


        int alarmH = 10;
        int alarmM = 33;
        int alarmS = 0;

        //13:30:1 ALARM KLOCKAN STANNAR

        while (h != alarmH || m != alarmM || s != alarmS) {

            try {

                s++;
                if (s == 60) {

                    m++;
                    s = 0;
                }

                if (m == 60) {
                    h++;
                    m = 0;
                }

                if (h == 24) {
                    h = 0;

                }
                Thread.sleep(1000);
                System.out.println(h + ":" + m + ":" + s);

            } catch (Exception e) {

            }


        }
        System.out.println("ALARM!!!");
    }
}
