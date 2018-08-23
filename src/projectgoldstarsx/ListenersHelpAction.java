package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListenersHelpAction
{
    public static class TroubleshootProblemsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new TroubleshootProblems();
        }
    }
    
    public static class AgendaCreateEventListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new HelpAgendaCreateEvent();
        }
    }
    
    public static class AgendaViewEventsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new HelpAgendaViewEvents();
        }
    }
    
    public static class TalkIntroListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new HelpTalkIntro();
        }
    }
    
    public static class TalkSuggestionsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new HelpTalkSuggestions();
        }
    }
    
    public static class NicknameListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new HelpNickname();
        }
    }
}