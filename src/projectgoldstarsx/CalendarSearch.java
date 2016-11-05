package projectgoldstarsx;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class CalendarSearch
{
    public CalendarSearch(String calendarSearchTerm)
    {
        searchCalendar(calendarSearchTerm);
    }
    
    private void searchCalendar(String calendarSearchTerm)
    {
        String output;
        ArrayList<String> searchResults = new ArrayList<String>();
        String lowerCaseSearchTerm = calendarSearchTerm.toLowerCase();
        for(int i = 0; i < ProjectGoldStarsX.calendarEvents.size(); i++)
        {
            String temp = ProjectGoldStarsX.calendarEvents.get(i);
            temp = temp.toLowerCase();
            if(temp.indexOf(lowerCaseSearchTerm) >= 0)
            {
                String toAdd;
                String year = ProjectGoldStarsX.calendarEvents.get(i).substring(0, 4);
                String month = ProjectGoldStarsX.calendarEvents.get(i).substring(4, 6);
                String date = ProjectGoldStarsX.calendarEvents.get(i).substring(6, 8);
                String event = ProjectGoldStarsX.calendarEvents.get(i).substring(8);
                if("Format 1".equals(ProjectGoldStarsX.calendarFormat))
                {
                    toAdd = "Event Date: " + month + "/" + date + "/" + year
                            + "\nEvent: " + event;
                }
                else
                {
                    toAdd = "Event Date: " + date + "/" + month + "/" + year
                            + "\nEvent: " + event;
                }
                searchResults.add(toAdd);
            }
        }
        String calendarSearchResultInput = "-1";
        /*
         * Unless no search results were found,
         * ask the user to input the number of a search result to view.
         * Continue asking the user to input the number of a search result to view
         * until the user types 0 or enters a null value (for example, if the user presses Cancel).
         */
        while(!"0".equals(calendarSearchResultInput))
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
                calendarSearchResultInput = JOptionPane.showInputDialog(searchResults.size() + " result was found.\n"
                    + "Please enter the number of the search result to view: ");
            }
            //If more than one search result was found
            else
            {
                calendarSearchResultInput = JOptionPane.showInputDialog(searchResults.size() + " results were found.\n"
                    + "Please enter the number of the search result to view: ");
            }
            if((calendarSearchResultInput == null) || ("0".equals(calendarSearchResultInput)))
            {
                break;
            }
            try
            {
                int searchTermViewIndex = Integer.parseInt(calendarSearchResultInput);
                searchTermViewIndex--;
                output = "Search Term: " + calendarSearchTerm + "\n"
                        + "Search Result " + (searchTermViewIndex + 1) + " of " + searchResults.size() + ":\n"
                        + searchResults.get(searchTermViewIndex);
                JOptionPane.showMessageDialog(null, output, "Calendar", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception error)
            {
                ProjectGoldStarsX.errors.add("Error: Calendar");
                JOptionPane.showMessageDialog(null, "ERROR", "Calendar", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }
}