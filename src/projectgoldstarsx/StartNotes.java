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
        getPasswordProtectedNotesSetting();
        getNotesSearchCaseSensitivitySetting();
    }
    
    private static void getNotes()
    {
        int notesNum = 0;
        while(notesNum != -1)
        {
            try
            {
                File file = new File(ProjectGoldStarsX.notesFolder, "note" + notesNum + ".txt");
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
                File file = new File(ProjectGoldStarsX.notesFolder, "noteName" + notesNum + ".txt");
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
     * Attempt to import the saved choice of whether the password protection of notes is turned on or off from the Project GoldStars X folder.
     * If nothing has been saved, Project GoldStars X will turn off password protected notes and save this to the Project GoldStars X folder.
     */
    private static void getPasswordProtectedNotesSetting()
    {
        File ppnTemp = new File(ProjectGoldStarsX.notesFolder, "passwordProtectedNotes.txt");
        try
        {
            Scanner s5 = new Scanner(ppnTemp).useDelimiter("\\Z");
            String temp = s5.next();
            s5.close();
            if("1".equals(temp))
            {
                ProjectGoldStarsX.passwordProtectedNotes = true;
            }
            else
            {
                ProjectGoldStarsX.passwordProtectedNotes = false;
            }
        }
        catch(FileNotFoundException e)
        {
            File file = new File(ProjectGoldStarsX.notesFolder, "passwordProtectedNotes.txt");
            ProjectGoldStarsX.passwordProtectedNotes = false;
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
    
    /*
     * Attempt to import the saved choice of whether Notes Search is case-sensitive from the Project GoldStars X folder.
     * If nothing has been saved, Project GoldStars X will turn off case sensitivity for Notes Search and save this to the Project GoldStars X folder.
     */
    private static void getNotesSearchCaseSensitivitySetting()
    {
        File nscsTemp = new File(ProjectGoldStarsX.notesFolder, "notesSearchCaseSensitive.txt");
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
            File file = new File(ProjectGoldStarsX.notesFolder, "notesSearchCaseSensitive.txt");
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