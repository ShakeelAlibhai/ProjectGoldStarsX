package projectgoldstarsx;
public class ProgramsMenu extends SubMenu
{
    public ProgramsMenu()
    {
        super("Programs");
        this.add(Components.standardMenuItem("Agenda", new ListenersProgramsAction.AgendaListener()));
        this.add(Components.standardMenuItem("Browser", new ListenersProgramsAction.BrowserListener()));
        this.add(Components.standardMenuItem("Calculator", new ListenersProgramsAction.CalculatorListener()));
        this.add(Components.standardMenuItem("Commands", new ListenersProgramsAction.CommandsListener()));
        this.add(Components.standardMenuItem("Education", new ListenersProgramsAction.EducationListener()));
        this.add(Components.standardMenuItem("Error Log", new ListenersProgramsAction.ErrorLogListener()));
        this.add(Components.standardMenuItem("Error Log Search", new ListenersProgramsAction.ErrorLogSearchListener()));
        this.add(Components.standardMenuItem("Files", new ListenersProgramsAction.FilesListener()));
        this.add(Components.standardMenuItem("Light", new ListenersProgramsAction.LightListener()));
        this.add(Components.standardMenuItem("Notes", new ListenersProgramsAction.NotesListener()));
        this.add(Components.standardMenuItem("Photos", new ListenersProgramsAction.PhotosListener()));
        this.add(Components.standardMenuItem("Stories", new ListenersProgramsAction.StoriesListener()));
        this.add(Components.standardMenuItem("Talk", new ListenersProgramsAction.TalkListener()));
    }
}