package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListenersPhotos
{
    public static class ImportPhotosListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            PhotosImport ip = new PhotosImport();
        }
    }
    
    public static class PhotosSettingsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            PhotosSettings ps = new PhotosSettings();
        }
    }
}