package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Photos
{
    public Photos()
    {
        photos();
    }
    
    public static JInternalFrame viewPhotosFrame;
    public static JTextField photosSearchTextField;
    
    private void photos()
    {
        viewPhotosFrame = new JInternalFrame("Photos");
        ProjectGoldStarsX.desktop.add(viewPhotosFrame);
        viewPhotosFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        viewPhotosFrame.setSize(1100 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier);
        viewPhotosFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        viewPhotosFrame.setJMenuBar(menuBar());
        ArrayList<String> files = new ArrayList<String>();
        for(int i = 0; i < ProjectGoldStarsX.photoNames.size(); i++)
        {
            files.add(ProjectGoldStarsX.photoNames.get(i));
        }
        JLabel[] fileLabels = new JLabel[files.size()];
        for(int i = 0; i < ProjectGoldStarsX.photoNames.size(); i++)
        {
            fileLabels[i] = new JLabel("Photo " + (i + 1), SwingConstants.CENTER);
            fileLabels[i].addMouseListener(new FileListener(files.get(i), true));
        }
        //If no photos have been saved to Project GoldStars X yet
        if(fileLabels.length == 0)
        {
            viewPhotosFrame.add(Components.titleLabel("You haven't saved any photos to Project GoldStars X yet!"));
        }
        else
        {
            for(int i = 0; i < fileLabels.length; i++)
            {
                viewPhotosFrame.setLayout(new GridLayout(((ProjectGoldStarsX.photoNames.size() - 1) / 3) + 1, 3));
                fileLabels[i].setFont(ProjectGoldStarsX.mediumText1);
                fileLabels[i].setForeground(ProjectGoldStarsX.color2);
                viewPhotosFrame.add(fileLabels[i]);
            }
        }
        viewPhotosFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(Components.standardButton("Import Photos", new ListenersPhotos.ImportPhotosListener()));
        menuBar.add(Components.settingsButton("Photos Settings", new ListenersPhotos.PhotosSettingsListener()));
        setupSearchField();
        menuBar.add(photosSearchTextField);
        menuBar.add(Components.standardButton("Search", new SearchPhotosListener()));
        return menuBar;
    }
    
    private void setupSearchField()
    {
        photosSearchTextField = new JTextField();
        photosSearchTextField.setText("Search Photos");
        photosSearchTextField.setFont(ProjectGoldStarsX.bodyText2);
        if(ProjectGoldStarsX.standardColors)
        {
            photosSearchTextField.setForeground(ProjectGoldStarsX.color2);
        }
        else
        {
            photosSearchTextField.setForeground(ProjectGoldStarsX.color1);
        }
        photosSearchTextField.addActionListener(new SearchPhotosListener());
    }
    
    private class FileListener implements MouseListener
    {
        String toDisplay;
        boolean picture;
        
        public FileListener(String name, boolean photo)
        {
            toDisplay = name;
            picture = photo;
        }
        
        public void mousePressed(MouseEvent e)
        {
            //If the file clicked on was not a picture
            if(!picture)
            {
                JFrame viewNoteFrame = new JFrame("Notes");
                viewNoteFrame.setSize(750, 400);
                JTextArea viewNoteTextArea = new JTextArea(toDisplay);
                viewNoteTextArea.setEditable(false);
                viewNoteTextArea.setFont(ProjectGoldStarsX.bodyText2);
                viewNoteFrame.add(viewNoteTextArea);
                viewNoteFrame.setVisible(true);
            }
            //If the file clicked on was a picture
            else
            {
                JFrame photoFrame = new JFrame("Photos");
                photoFrame.setVisible(true);
                photoFrame.setSize(1000 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier);
                ImageIcon image = new ImageIcon(toDisplay);
                JLabel photo = new JLabel(image);
                photoFrame.add(photo);
            }
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            viewPhotosFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(viewPhotosFrame);
        }
    }
    
    public static class SearchPhotosListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            PhotosSearch sp = new PhotosSearch(photosSearchTextField.getText());
            photosSearchTextField.setText("");
        }
    }
}