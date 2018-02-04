package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class NotesRename
{
    public NotesRename()
    {
        renameNotes();
    }
    
    private void renameNotes()
    {
        String output;
        //Display a message if no notes have been saved to Gold Stars yet.
        if(ProjectGoldStarsX.notes.isEmpty())
        {
            output = "You need to create a note before you can rename notes.";
            JOptionPane.showMessageDialog(null, output, "Notes", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            output = JOptionPane.showInputDialog("Please enter the number of a note to rename.\n"
                    + "You currently have " + ProjectGoldStarsX.notes.size() + " notes.");
            if(output == null)
            {
                return;
            }
            int noteToRename;
            try
            {
                noteToRename = Integer.parseInt(output);
            }
            catch(Exception e)
            {
                return;
            }
            output = JOptionPane.showInputDialog("Please enter the new name of " + ProjectGoldStarsX.noteNames.get(noteToRename - 1));
            if(output == null)
            {
                return;
            }
            ProjectGoldStarsX.noteNames.set(noteToRename - 1, output);
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.NOTES_FOLDER, "noteName" + (noteToRename - 1) + ".txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.noteNames.get(noteToRename - 1));
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            JOptionPane.showMessageDialog(null, "Note Saved", "Notes", JOptionPane.INFORMATION_MESSAGE);
            Notes.viewNotesFrame.close();
            new Notes();
        }
    }
}