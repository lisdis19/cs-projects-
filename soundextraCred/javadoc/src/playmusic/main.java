/**Lisa DiSalvo
/** CS 112
/ Extra Credit Assignment Java API's: Sound and Text to Speech
/08/06/2020**/
package playmusic;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class main
{
    /**driver code, looks in my c directory for this file
    /**if you want to play a sound, enter your own directory
     **/
    public static void main(String[] args)
    {
        String audioFilePath = "C:\\Users\\user\\IdeaProjects\\soundextraCred\\sampleSound.wav";
        main player = new main();
        player.playAudio(audioFilePath);
    }

    /**byte buffer size
    //default buffer size is 4096 bytes
     **/
    public static final int bufferSize = 4096;
    public static void playAudio(String audioPath)
    {
        File audioFile = new File(audioPath);
        try {
            //get audio input from audiofile
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            SourceDataLine audioLine = (SourceDataLine) AudioSystem.getLine(info);
            audioLine.open(format);
            audioLine.start();

            /**start playback once line opens + begins
             *
             */
            System.out.println("Playback started.");
            byte[] bytesBuffer = new byte[bufferSize];
            int bytesRead = -1;
            while ((bytesRead = audioStream.read(bytesBuffer)) != -1)
            {
                audioLine.write(bytesBuffer, 0, bytesRead);
            }
            audioLine.drain();
            audioLine.close();
            audioStream.close();
            System.out.println("Playback completed.");
        }
        /**catch errors, multiple types of errors listed below
         *
         */
        catch (IOException | UnsupportedAudioFileException | LineUnavailableException ex)
        {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }
    }

}


