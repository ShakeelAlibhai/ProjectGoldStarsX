package projectgoldstarsx;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class NotesEdit
{
    public static int noteNum;
    public static JFrame createNoteFrame;
    public static JTextField editNotesTextField;
    
    public NotesEdit()
    {
        editNotes();
    }
    
    private void editNotes()
    {
        String output;
        editNotesTextField = new JTextField();
        //Display a message if no notes have been saved to Project GoldStars X yet.
        if(ProjectGoldStarsX.notes.isEmpty())
        {
            output = "You need to create a note before you can edit notes.";
            JOptionPane.showMessageDialog(null, output, "Notes", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            output = JOptionPane.showInputDialog(null, "Please enter the number of a note to edit.\n"
                    + "You currently have " + ProjectGoldStarsX.notes.size() + (ProjectGoldStarsX.notes.size() == 1 ? " note.": " notes."));
            if(output == null)
            {
                return;
            }
            try
            {
                int editNotesChoice = Integer.parseInt(output);
                noteNum = editNotesChoice;
                createNoteFrame = new JFrame("Edit Notes");
                createNoteFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
                JMenuBar menuBar = new JMenuBar();
                menuBar.setBackground(ProjectGoldStarsX.mainColor);
                JButton saveButton = new JButton("Save");
                saveButton.setBackground(ProjectGoldStarsX.secondaryColor);
                saveButton.setForeground(ProjectGoldStarsX.mainColor);
                saveButton.setFont(new java.awt.Font(null, Font.BOLD, 16));
                saveButton.addActionListener(new EditNoteListener());
                menuBar.add(saveButton);
                createNoteFrame.setJMenuBar(menuBar);
                createNoteFrame.add(editNotesTextField);
                createNoteFrame.setVisible(true);
                editNotesTextField.requestFocusInWindow();
                editNotesTextField.setFont(ProjectGoldStarsX.bodyText1);
                editNotesTextField.setText(ProjectGoldStarsX.notes.get((editNotesChoice - 1)));
                editNotesTextField.addActionListener(new EditNoteListener());
            }
            catch(Exception error)
            {
                ProjectGoldStarsX.errors.add("Error: Notes");
                JOptionPane.showMessageDialog(null, "ERROR", "Notes", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }
    
    public static class EditNoteListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.notes.set((noteNum - 1), editNotesTextField.getText());
            editNotesTextField.setText("");
            JOptionPane.showMessageDialog(null, "Note Saved", "Notes", JOptionPane.INFORMATION_MESSAGE);
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.NOTES_FOLDER, "note" + (noteNum - 1) + ".txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.notes.get(noteNum - 1));
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            createNoteFrame.dispatchEvent(new WindowEvent(createNoteFrame, WindowEvent.WINDOW_CLOSING));
            Notes.viewNotesFrame.close();
            new Notes();
        }
    }
}