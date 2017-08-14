package projectgoldstarsx;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.HTMLEditor;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class NotesCreate extends JInternalFrame
{
    private final JFXPanel jfxPanel = new JFXPanel();
    private final JPanel panel = new JPanel(new BorderLayout()); 
    public HTMLEditor htmlEditor;
    
    public NotesCreate()
    {
        super();
        createWindow();
    }
    
    private void createWindow()
    {
        createScene();
        NotesCreate.this.setJMenuBar(menuBar());
        panel.add(jfxPanel, BorderLayout.CENTER);
        getContentPane().add(panel);
        ProjectGoldStarsX.desktop.add(NotesCreate.this);
        setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        setPreferredSize(new Dimension(1100 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier));
        setResizable(true);
        setTitle("Create a Note");
        pack();
        setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(Components.standardButton("Save", new CreateNoteListener()));
        return menuBar;
    }
    
    private void createScene()
    {
        Platform.runLater(new Runnable()
        {
            @Override
            public void run()
            {
                htmlEditor = new HTMLEditor();
                htmlEditor.setPrefHeight(245 * ProjectGoldStarsX.multiplier);
                jfxPanel.setScene(new Scene(htmlEditor));
            }
        });
    }
    
    private class CreateNoteListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processNote(htmlEditor.getHtmlText());
        }
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
                File file = new File(ProjectGoldStarsX.notesFolder, "note" + (ProjectGoldStarsX.notes.size() - 1) + ".txt");
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
                File file = new File(ProjectGoldStarsX.notesFolder, "noteName" + (ProjectGoldStarsX.noteNames.size() - 1) + ".txt");
                out2 = new PrintWriter(file);
                out2.println(ProjectGoldStarsX.noteNames.get(ProjectGoldStarsX.noteNames.size() - 1));
                out2.close();
            }
            catch(FileNotFoundException e3)
            {
                
            }
        }
        Notes.viewNotesFrame.close();
        new Notes();
        NotesCreate.this.setVisible(false);
    }
    
    public class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            NotesCreate.this.setVisible(false);
        }
    }
    
    public class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(NotesCreate.this);
        }
    }
}