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
import javax.swing.JMenu;
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
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(getWindowMenu());
        menuBar.add(new StandardButton("Save", new CreateNoteListener()));
        return menuBar;
    }
    
    public JMenu getWindowMenu()
    {
        StandardMenu menu = new StandardMenu("Window");
        menu.add(Components.standardMenuItem("Move to Left Side of Screen", new LeftListener()));
        menu.add(Components.standardMenuItem("Move to Right Side of Screen", new RightListener()));
        menu.add(Components.standardMenuItem("Move to Top of Screen", new TopListener()));
        menu.add(Components.standardMenuItem("Move to Bottom of Screen", new BottomListener()));
        return menu.getMenu();
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
    
    public class LeftListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            NotesCreate.this.setSize(ProjectGoldStarsX.width / 2, ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight);
        }
    }
    
    public class RightListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            NotesCreate.this.setLocation(ProjectGoldStarsX.width / 2, ProjectGoldStarsX.menuBarHeight);
            NotesCreate.this.setSize(ProjectGoldStarsX.width / 2, ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight);
        }
    }
    
    public class TopListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            NotesCreate.this.setSize(ProjectGoldStarsX.width, (ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight) / 2);
        }
    }
    
    public class BottomListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            NotesCreate.this.setLocation(0, (ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight) / 2);
            NotesCreate.this.setSize(ProjectGoldStarsX.width, (ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight) / 2);
        }
    }
}