package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListenersNotes
{
    public static class CreateNoteListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new NotesCreate();
        }
    }
    
    public static class EditNotesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new NotesEdit();
        }
    }
    
    public static class ImportNotesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new NotesImport();
        }
    }
    
    public static class RenameNotesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new NotesRename();
        }
    }
    
    public static class NotesSettingsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new NotesSettings();
        }
    }
    
    public static class AboutNotesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            AboutPrograms.aboutNotes();
        }
    }
}