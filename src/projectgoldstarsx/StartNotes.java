package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StartNotes
{
    public StartNotes()
    {
        getNotes();
        getNoteNames();
        getNotesSearchCaseSensitivitySetting();
    }
    
    private static void getNotes()
    {
        int notesNum = 0;
        while(notesNum != -1)
        {
            try
            {
                File file = new File(ProjectGoldStarsX.NOTES_FOLDER, "note" + notesNum + ".txt");
                ProjectGoldStarsX.notes.add(new Scanner(file).useDelimiter("\\Z").next());
                notesNum++;
            }
            catch(FileNotFoundException e)
            {
                notesNum = -1;
            }
        }
    }
    
    private static void getNoteNames()
    {
        int notesNum = 0;
        while(notesNum != -1)
        {
            try
            {
                File file = new File(ProjectGoldStarsX.NOTES_FOLDER, "noteName" + notesNum + ".txt");
                ProjectGoldStarsX.noteNames.add(new Scanner(file).useDelimiter("\\Z").next());
                notesNum++;
            }
            catch(FileNotFoundException e)
            {
                notesNum = -1;
            }
        }
    }
    
    /*
     * Attempt to import the saved choice of whether Notes Search is case-sensitive from the Project GoldStars X folder.
     * If nothing has been saved, Project GoldStars X will turn off case sensitivity for Notes Search and save this to the Project GoldStars X folder.
     */
    private static void getNotesSearchCaseSensitivitySetting()
    {
        File nscsTemp = new File(ProjectGoldStarsX.NOTES_FOLDER, "notesSearchCaseSensitive.txt");
        try
        {
            Scanner s6 = new Scanner(nscsTemp).useDelimiter("\\Z");
            String temp = s6.next();
            s6.close();
            if("1".equals(temp))
            {
                ProjectGoldStarsX.notesSearchCaseSensitive = true;
            }
            else
            {
                ProjectGoldStarsX.notesSearchCaseSensitive = false;
            }
        }
        catch(FileNotFoundException e)
        {
            File file = new File(ProjectGoldStarsX.NOTES_FOLDER, "notesSearchCaseSensitive.txt");
            ProjectGoldStarsX.notesSearchCaseSensitive = false;
            PrintWriter out;
            try
            {
                out = new PrintWriter(file);
                out.println("0");
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        }
    }
}