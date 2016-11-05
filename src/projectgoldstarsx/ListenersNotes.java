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
            NotesCreate cn = new NotesCreate();
        }
    }
    
    public static class EditNotesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            NotesEdit en = new NotesEdit();
        }
    }
    
    public static class ImportNotesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            NotesImport in = new NotesImport();
        }
    }
    
    public static class RenameNotesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            NotesRename rn = new NotesRename();
        }
    }
    
    public static class NotesSettingsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            NotesSettings ns = new NotesSettings();
        }
    }
}