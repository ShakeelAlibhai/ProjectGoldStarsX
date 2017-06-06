package projectgoldstarsx;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
public class InformationWindow
{
    public JInternalFrame informationFrame;
    
    public InformationWindow(String title)
    {
        informationFrame = new JInternalFrame(title);
        ProjectGoldStarsX.desktop.add(informationFrame);
        informationFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        informationFrame.setJMenuBar(menuBar());
    }
    
    public void addText(Font f, String s)
    {
        JTextArea textArea = new JTextArea(s);
        textArea.setEditable(false);
        textArea.setFont(f);
        informationFrame.add(textArea);
    }
    
    public void makeVisible()
    {
        informationFrame.setVisible(true);
    }
    
    public void setLayout(GridLayout g)
    {
        informationFrame.setLayout(g);
    }
    
    public void setSize(int a, int b)
    {
        informationFrame.setSize(a, b);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        return menuBar;
    }
    
    public class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            informationFrame.dispose();
        }
    }
    
    public class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(informationFrame);
        }
    }
}