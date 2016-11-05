package projectgoldstarsx;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class FilesSearch
{
    public FilesSearch(String searchTerm)
    {
        searchFiles(searchTerm);
    }
    
    private void searchFiles(String searchTerm)
    {
        String output;
        ArrayList<String> searchResults = new ArrayList<String>();
        if(searchTerm == null)
        {
            return;
        }
        String lowerCaseSearchTerm = searchTerm;
        if(ProjectGoldStarsX.searchCaseSensitive == false)
        {
            lowerCaseSearchTerm = searchTerm.toLowerCase();
        }
        //Search Notes
        for(int i = 0; i < ProjectGoldStarsX.notes.size(); i++)
        {
            if(ProjectGoldStarsX.searchCaseSensitive == false)
            {
                String temp = ProjectGoldStarsX.notes.get(i);
                temp = temp.toLowerCase();
                if(temp.indexOf(lowerCaseSearchTerm) >= 0)
                {
                    searchResults.add("Result From: Notes\n"
                            + ProjectGoldStarsX.notes.get(i));
                }
            }
            else
            {
                if(ProjectGoldStarsX.notes.get(i).indexOf(searchTerm) >= 0)
                {
                    searchResults.add("Result From: Notes\n"
                            + ProjectGoldStarsX.notes.get(i));
                }
            }
        }
        //Search Photos
        for(int i = 0; i < ProjectGoldStarsX.photoNames.size(); i++)
        {
            if(ProjectGoldStarsX.searchCaseSensitive == false)
            {
                String temp = ProjectGoldStarsX.photoNames.get(i);
                temp = temp.toLowerCase();
                if(temp.indexOf(lowerCaseSearchTerm) >= 0)
                {
                    searchResults.add("Result From: Photos\n"
                            + ProjectGoldStarsX.photoNames.get(i));
                }
            }
            else
            {
                if(ProjectGoldStarsX.photoNames.get(i).indexOf(searchTerm) >= 0)
                {
                    searchResults.add("Result From: Photos\n"
                            + ProjectGoldStarsX.photoNames.get(i));
                }
            }
        }
        String searchResultsInput = "-1";
        /*
         * Unless no search results were found,
         * ask the user to input the number of a search result to view.
         * Continue asking the user to input the number of a search result to view
         * until the user types 0 or enters a null value (for example, if the user presses Cancel).
         */
        while(!"0".equals(searchResultsInput))
        {
            //If no search results were found
            if(searchResults.isEmpty())
            {
                output = "No search results were found.";
                JOptionPane.showMessageDialog(null, output, "Search", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            //If one search result was found
            if(searchResults.size() == 1)
            {
                searchResultsInput = JOptionPane.showInputDialog(searchResults.size() + " result was found.\n"
                    + "Please enter the number of the search result to view: ");
            }
            //If more than one search result was found
            else
            {
                searchResultsInput = JOptionPane.showInputDialog(searchResults.size() + " results were found.\n"
                    + "Please enter the number of the search result to view: ");
            }
            if((searchResultsInput == null) || ("0".equals(searchResultsInput)))
            {
                break;
            }
            try
            {
                int searchTermViewIndex = Integer.parseInt(searchResultsInput);
                searchTermViewIndex--;
                output = "Search Term: " + searchTerm + "\n"
                        + "Search Result " + (searchTermViewIndex + 1) + " of " + searchResults.size() + "\n"
                        + searchResults.get(searchTermViewIndex);
                JOptionPane.showMessageDialog(null, output, "Search", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception error)
            {
                ProjectGoldStarsX.errors.add("Error: Search");
                JOptionPane.showMessageDialog(null, "ERROR", "Search", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }
}