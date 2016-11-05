package projectgoldstarsx;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class PhotosSearch
{
    public PhotosSearch(String photosSearchTerm)
    {
        searchPhotos(photosSearchTerm);
    }
    
    private void searchPhotos(String photosSearchTerm)
    {
        String output;
        ArrayList<String> searchResults = new ArrayList<String>();
        String lowerCaseSearchTerm = photosSearchTerm;
        if(ProjectGoldStarsX.photosSearchCaseSensitive == false)
        {
            lowerCaseSearchTerm = photosSearchTerm.toLowerCase();
        }
        for(int i = 0; i < ProjectGoldStarsX.photoNames.size(); i++)
        {
            if(ProjectGoldStarsX.photosSearchCaseSensitive == false)
            {
                String temp = ProjectGoldStarsX.photoNames.get(i);
                temp = temp.toLowerCase();
                if(temp.indexOf(lowerCaseSearchTerm) >= 0)
                {
                    searchResults.add(ProjectGoldStarsX.photoNames.get(i));
                }
            }
            else
            {
                if(ProjectGoldStarsX.photoNames.get(i).indexOf(photosSearchTerm) >= 0)
                {
                    searchResults.add(ProjectGoldStarsX.photoNames.get(i));
                }
            }
        }
        String photosSearchResultInput = "-1";
        /*
         * Unless no search results were found,
         * ask the user to input the number of a search result to view.
         * Continue asking the user to input the number of a search result to view
         * until the user types 0 or enters a null value (for example, if the user presses Cancel).
         */
        while(!"0".equals(photosSearchResultInput))
        {
            //If no search results were found
            if(searchResults.isEmpty())
            {
                output = "No search results were found.";
                JOptionPane.showMessageDialog(null, output, "Photos", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            //If one search result was found
            if(searchResults.size() == 1)
            {
                photosSearchResultInput = JOptionPane.showInputDialog(searchResults.size() + " result was found.\n"
                + "Please enter the number of the search result to view:");
            }
            //If more than one search result was found
            else
            {
                photosSearchResultInput = JOptionPane.showInputDialog(searchResults.size() + " results were found.\n"
                + "Please enter the number of the search result to view:");
            }
            if((photosSearchResultInput == null) || ("0".equals(photosSearchResultInput)))
            {
                break;
            }
            try
            {
                int searchTermViewIndex = Integer.parseInt(photosSearchResultInput);
                searchTermViewIndex--;
                JFrame photoFrame = new JFrame("Photos");
                photoFrame.setVisible(true);
                photoFrame.setSize(1000, 600);
                ImageIcon image = new ImageIcon(searchResults.get(searchTermViewIndex));
                JLabel photo = new JLabel(image);
                photoFrame.add(photo);
            }
            catch(Exception error)
            {
                ProjectGoldStarsX.errors.add("Error: Photos");
                JOptionPane.showMessageDialog(null, "ERROR", "Photos", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }
}