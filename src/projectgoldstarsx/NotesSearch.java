package projectgoldstarsx;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class NotesSearch
{
    public NotesSearch(String notesSearchTerm)
    {
        searchNotes(notesSearchTerm);
    }
    
    private void searchNotes(String notesSearchTerm)
    {
        String output;
        ArrayList<String> searchResults = new ArrayList<String>();
        String lowerCaseSearchTerm = notesSearchTerm;
        if(ProjectGoldStarsX.notesSearchCaseSensitive == false)
        {
            lowerCaseSearchTerm = notesSearchTerm.toLowerCase();
        }
        for(int i = 0; i < ProjectGoldStarsX.notes.size(); i++)
        {
            if(ProjectGoldStarsX.notesSearchCaseSensitive == false)
            {
                String temp = ProjectGoldStarsX.notes.get(i);
                temp = temp.toLowerCase();
                if(temp.indexOf(lowerCaseSearchTerm) >= 0)
                {
                    searchResults.add(ProjectGoldStarsX.notes.get(i));
                }
            }
            else
            {
                if(ProjectGoldStarsX.notes.get(i).indexOf(notesSearchTerm) >= 0)
                {
                    searchResults.add(ProjectGoldStarsX.notes.get(i));
                }
            }
        }
        String notesSearchResultInput = "-1";
        /*
         * Unless no search results were found,
         * ask the user to input the number of a search result to view.
         * Continue asking the user to input the number of a search result to view
         * until the user types 0 or enters a null value (for example, if the user presses Cancel).
         */
        while(!"0".equals(notesSearchResultInput))
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
                notesSearchResultInput = JOptionPane.showInputDialog(searchResults.size() + " result was found.\n"
                    + "Please enter the number of the search result to view: ");
            }
            //If more than one search result was found
            else
            {
                notesSearchResultInput = JOptionPane.showInputDialog(searchResults.size() + " results were found.\n"
                    + "Please enter the number of the search result to view: ");
            }
            if((notesSearchResultInput == null) || ("0".equals(notesSearchResultInput)))
            {
                break;
            }
            try
            {
                int searchTermViewIndex = Integer.parseInt(notesSearchResultInput);
                searchTermViewIndex--;
                output = "Search Term: " + notesSearchTerm + "\n"
                        + "Search Result " + (searchTermViewIndex + 1) + " of " + searchResults.size() + ":\n"
                        + searchResults.get(searchTermViewIndex);
                JOptionPane.showMessageDialog(null, output, "Notes", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception error)
            {
                ProjectGoldStarsX.errors.add("Error: Notes");
                JOptionPane.showMessageDialog(null, "ERROR", "Notes", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }
}