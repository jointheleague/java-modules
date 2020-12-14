package _05_World_Clocks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.Timer;

/*
 * You task is to create a java program that:
 * 1. Displays the time for multiple cities around the world on one display.
 * 2. Gives the user the ability to add a city to the display.
 * 3. Gives the user the ability to sort the clocks on the display by
 *    name or time.
 * 
 * The code below is an example of how to print out a clock for San Diego.
 * Use the ClockUtilities class to find the time zone of each city, then use
 * Calendar.getInstance to return a Calendar object to get the current time for
 * that city.
 *   TimeZone timeZone = clockUtil.getTimeZoneFromCityName("San Diego, US");
 *   Calendar c = Calendar.getInstance(timeZone);
 *   System.out.println("Full date and time: " + calendar.getTime());
 * 
 * Calendar class:
 * https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
 */
public class WorldClocks implements ActionListener {
    ClockUtilities clockUtil;
    Timer timer;
    TimeZone timeZone;

    JFrame frame;
    
    public WorldClocks() {
        clockUtil = new ClockUtilities();

        // The format for the city must be: city, country
        timeZone = clockUtil.getTimeZoneFromCityName("New York, US");
        
        Calendar calendar = Calendar.getInstance(timeZone);
        String month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        String dayOfWeek = calendar.getDisplayName( Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
        System.out.println(dayOfWeek + " " + month + " " + calendar.get(Calendar.DAY_OF_MONTH) + " " + calendar.get(Calendar.YEAR));

        // Sample starter program
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(100, 100);
        
        // Call timer every 1000 milliseconds
        timer = new Timer(1000, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        Calendar c = Calendar.getInstance(timeZone);
        System.out.print(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        System.out.print(" [" + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "]\n");
    }
}
