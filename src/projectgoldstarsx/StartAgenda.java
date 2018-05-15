package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StartAgenda
{
    public StartAgenda()
    {
        getEvents();
        getDateFormat();
    }
    
    private static void getEvents()
    {
        int calendarEvent = 0;
        while(calendarEvent != -1)
        {
            try
            {
                File temp = new File(ProjectGoldStarsX.AGENDA_FOLDER, "event" + calendarEvent + ".txt");
                ProjectGoldStarsX.events.add(new Scanner(temp).useDelimiter("\\Z").next());
                calendarEvent++;
            }
            catch(FileNotFoundException e)
            {
                calendarEvent = -1;
            }
        }
    }
    
    /*
     * Attempt to import the saved date format choice from the Agenda folder.
     * If nothing has been saved, Project GoldStars X will use Format 1 and save this to the Agenda folder.
     */
    private void getDateFormat()
    {
        File calendarFormatTemp = new File(ProjectGoldStarsX.AGENDA_FOLDER, "dateFormat.txt");
        try
        {
            Scanner s1 = new Scanner(calendarFormatTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.dateFormat = s1.next();
            s1.close();
        }
        catch(FileNotFoundException e)
        {
            ProjectGoldStarsX.dateFormat = "Format 1";
            File file = new File(ProjectGoldStarsX.AGENDA_FOLDER, "dateFormat.txt");
            PrintWriter out;
            try
            {
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsX.dateFormat);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        }
    }
}