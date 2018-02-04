package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class NotesImport
{
    public NotesImport()
    {
        importNotes();
    }
    
    private void importNotes()
    {
        String output;
        output = "Place the note that you want to import in the folder that Project GoldStars X is in.\n"
                + "Make sure that the note is in a .txt file.\n"
                + "Now, please enter the name of the .txt file (case sensitive):";
        String nameOfNote = JOptionPane.showInputDialog(null, output, "Import Notes", JOptionPane.QUESTION_MESSAGE);
        if(nameOfNote == null)
        {
            return;
        }
        String temp;
        try
        {
            temp = new Scanner(new File(nameOfNote + ".txt")).useDelimiter("\\Z").next();
        }
        catch(FileNotFoundException e)
        {
            ProjectGoldStarsX.errors.add("Error: Notes");
            output = "ERROR:\n"
                    + "Note Not Found";
            JOptionPane.showMessageDialog(null, output, "Notes", JOptionPane.ERROR_MESSAGE);
            return;
        }
        processNote(temp);
    }
    
    private void processNote(String tempNotesInput)
    {
        if(tempNotesInput != null)
        {
            ProjectGoldStarsX.notes.add(tempNotesInput);
            ProjectGoldStarsX.noteNames.add("Note #" + ProjectGoldStarsX.notes.size());
            JOptionPane.showMessageDialog(null, "Note Saved", "Notes", JOptionPane.INFORMATION_MESSAGE);
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.NOTES_FOLDER, "note" + (ProjectGoldStarsX.notes.size() - 1) + ".txt");
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsX.notes.get(ProjectGoldStarsX.notes.size() - 1));
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            PrintWriter out2;
            try
            {
                File file = new File(ProjectGoldStarsX.NOTES_FOLDER, "noteName" + (ProjectGoldStarsX.noteNames.size() - 1) + ".txt");
                out2 = new PrintWriter(file);
                out2.println(ProjectGoldStarsX.noteNames.get(ProjectGoldStarsX.noteNames.size() - 1));
                out2.close();
            }
            catch(FileNotFoundException e3)
            {
                
            }
            Notes.viewNotesFrame.close();
            new Notes();
        }
    }
}