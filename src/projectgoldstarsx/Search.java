package projectgoldstarsx;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Search
{
    public Search(String searchTerm)
    {
        search(searchTerm);
    }
    
    private void search(String searchTerm)
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
        /*
        Search programs and actions of Project GoldStars X to see if any match or come close to the search term.
        If they do, open the window or dialog box for the user to carry out the task.
        Otherwise, search the Calendar, Notes, Photos, and the Error Log.
        */
        String searchTermLowerCase = searchTerm.toLowerCase();  //Is lowercase whether or not the user has Search Case Sensitivity turned on or off;
                                                                //only used when searching for programs and actions.
        if(searchTermLowerCase.contains("browser") || searchTermLowerCase.contains("internet"))
        {
            new Browser();
            return;
        }
        if(searchTermLowerCase.contains("calendar"))
        {
            new CalendarHome();
            return;
        }
        if(searchTermLowerCase.contains("add"))
        {
            new CalcAdd();
            return;
        }
        if(searchTermLowerCase.contains("subtract"))
        {
            new CalcSubtract();
            return;
        }
        if(searchTermLowerCase.contains("multiply") || searchTermLowerCase.contains("multiplication"))
        {
            new CalcMultiply();
            return;
        }
        if(searchTermLowerCase.contains("divide") || searchTermLowerCase.contains("division"))
        {
            new CalcDivide();
            return;
        }
        if(searchTermLowerCase.contains("square root"))
        {
            new CalcSquareRoot();
            return;
        }
        if(searchTermLowerCase.contains("cube root"))
        {
            new CalcCubeRoot();
            return;
        }
        if(searchTermLowerCase.contains("raise a number to a power") || searchTermLowerCase.contains("exponent"))
        {
            new CalcExponents();
            return;
        }
        if(searchTermLowerCase.contains("quadratic equation"))
        {
            new CalcQuadraticEquation();
            return;
        }
        if(searchTermLowerCase.contains("log base 10") || searchTermLowerCase.contains("log base ten"))
        {
            new CalcLogBase10();
            return;
        }
        if(searchTermLowerCase.contains("natural log") || searchTermLowerCase.contains("log base e"))
        {
            new CalcNaturalLog();
            return;
        }
        if(searchTermLowerCase.contains("cosine"))
        {
            new CalcCosine();
            return;
        }
        if(searchTermLowerCase.contains("sine"))
        {
            new CalcSine();
            return;
        }
        if(searchTermLowerCase.contains("tangent"))
        {
            new CalcTangent();
            return;
        }
        if(searchTermLowerCase.contains("degrees to radians"))
        {
            new CalcDegreesToRadians();
            return;
        }
        if(searchTermLowerCase.contains("radians to degrees"))
        {
            new CalcRadiansToDegrees();
            return;
        }
        if(searchTermLowerCase.contains("help"))
        {
            new Help();
            return;
        }
        if(searchTermLowerCase.contains("troubleshoot problems"))
        {
            new TroubleshootProblems();
            return;
        }
        if(searchTermLowerCase.contains("system information"))
        {
            new SystemInformation();
            return;
        }
        if(searchTermLowerCase.contains("about programs"))
        {
            new AboutPrograms();
            return;
        }
        if(searchTermLowerCase.contains("about"))
        {
            new About();
            return;
        }
        //Search Calendar
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
                    toAdd = "Result From: Calendar\n"
                            + "Event Date: " + month + "/" + date + "/" + year
                            + "\nEvent: " + event;
                }
                else
                {
                    toAdd = "Result From: Calendar\n"
                            + "Event Date: " + date + "/" + month + "/" + year
                            + "\nEvent: " + event;
                }
                searchResults.add(toAdd);
            }
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
        //Search Error Log
        for(int i = 0; i < ProjectGoldStarsX.errors.size(); i++)
        {
            if(ProjectGoldStarsX.searchCaseSensitive == false)
            {
                String temp = ProjectGoldStarsX.errors.get(i);
                temp = temp.toLowerCase();
                if(temp.indexOf(lowerCaseSearchTerm) >= 0)
                {
                    searchResults.add("Result From: Error Log\n"
                            + ProjectGoldStarsX.errors.get(i));
                }
            }
            else
            {
                if(ProjectGoldStarsX.errors.get(i).indexOf(searchTerm) >= 0)
                {
                    searchResults.add("Result From: Error Log\n"
                            + ProjectGoldStarsX.errors.get(i));
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