package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StartCalendar
{
    public StartCalendar()
    {
        getCalendarEvents();
        getCalendarFormat();
    }
    
    private static void getCalendarEvents()
    {
        int calendarEvent = 0;
        while(calendarEvent != -1)
        {
            try
            {
                File temp = new File(ProjectGoldStarsX.calendarFolder, "calendarEvent" + calendarEvent + ".txt");
                ProjectGoldStarsX.calendarEvents.add(new Scanner(temp).useDelimiter("\\Z").next());
                calendarEvent++;
            }
            catch(FileNotFoundException e)
            {
                calendarEvent = -1;
            }
        }
    }
    
    /*
     * Attempt to import the saved calendar format choice from the Calendar folder.
     * If nothing has been saved, Project GoldStars X will use Format 1 and save this to the Project GoldStars X folder.
     */
    private void getCalendarFormat()
    {
        File calendarFormatTemp = new File(ProjectGoldStarsX.calendarFolder, "calendarFormat.txt");
        try
        {
            Scanner s1 = new Scanner(calendarFormatTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.calendarFormat = s1.next();
            s1.close();
        }
        catch(FileNotFoundException e)
        {
            ProjectGoldStarsX.calendarFormat = "Format 1";
            File file = new File(ProjectGoldStarsX.calendarFolder, "calendarFormat.txt");
            PrintWriter out;
            try
            {
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsX.calendarFormat);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        }
    }
}