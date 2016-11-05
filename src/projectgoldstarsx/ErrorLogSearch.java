package projectgoldstarsx;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ErrorLogSearch
{
    public ErrorLogSearch()
    {
        searchErrorLog();
    }
    
    private void searchErrorLog()
    {
        String output;
        //Display a message if no errors have been reported yet.
        if(ProjectGoldStarsX.errors.isEmpty())
        {
            output = "No errors have been reported yet!";
            JOptionPane.showMessageDialog(null, output, "Error Log Search", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            ArrayList<String> searchResults = new ArrayList<String>();
            String searchTerm;
            searchTerm = JOptionPane.showInputDialog(null, "Please enter your search term:");
            if(searchTerm == null)
            {
                return;
            }
            String lowerCaseSearchTerm = searchTerm;
            if(ProjectGoldStarsX.errorLogSearchCaseSensitive == false)
            {
                lowerCaseSearchTerm = searchTerm.toLowerCase();
            }
            for(int i = 0; i < ProjectGoldStarsX.errors.size(); i++)
            {
                if(ProjectGoldStarsX.errorLogSearchCaseSensitive == false)
                {
                    String temp = ProjectGoldStarsX.errors.get(i);
                    temp = temp.toLowerCase();
                    if(temp.indexOf(lowerCaseSearchTerm) >= 0)
                    {
                        searchResults.add(ProjectGoldStarsX.errors.get(i));
                    }
                }
                else
                {
                    if(ProjectGoldStarsX.errors.get(i).indexOf(searchTerm) >= 0)
                    {
                        searchResults.add(ProjectGoldStarsX.errors.get(i));
                    }
                }
            }
            String errorLogSearchResultsInput = "-1";
            /*
             * Unless no search results were found,
             * ask the user to input the number of a search result to view.
             * Continue asking the user to input the number of a search result to view
             * until the user types 0 or enters a null value (for example, if the user presses Cancel).
             */
            while(!"0".equals(errorLogSearchResultsInput))
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
                    errorLogSearchResultsInput = JOptionPane.showInputDialog(searchResults.size() + " result was found.\n"
                        + "Please enter the number of the search result to view: ");
                }
                //If more than one search result was found
                else
                {
                    errorLogSearchResultsInput = JOptionPane.showInputDialog(searchResults.size() + " results were found.\n"
                        + "Please enter the number of the search result to view: ");
                }
                if((errorLogSearchResultsInput == null) || ("0".equals(errorLogSearchResultsInput)))
                {
                    break;
                }
                try
                {
                    int searchTermViewIndex = Integer.parseInt(errorLogSearchResultsInput);
                    searchTermViewIndex--;
                    output = "Search Term: " + searchTerm + "\n"
                            + "Search Result " + (searchTermViewIndex + 1) + " of " + searchResults.size() + "\n"
                            + searchResults.get(searchTermViewIndex);
                    JOptionPane.showMessageDialog(null, output, "Error Log", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception error)
                {
                    ProjectGoldStarsX.errors.add("Error: Error Log");
                    JOptionPane.showMessageDialog(null, "ERROR", "Error Log", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
        }
    }
}