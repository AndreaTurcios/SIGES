package clases;

//Se importan las librerias utilizadas

import java.awt.BorderLayout;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author El código de Adrian
 */
public class Reproductor {
    
    //Creamos los objetos y variables a utilizar
    private JFXPanel jfxPanel;
    private JPanel jpanel;
    private MediaPlayer mediaPlayer;
    private Media media;
    private MediaView view;
    private Scene escena;
    private File file;
    private String ruta;
        
    //Método constructor vacio
    public Reproductor() {
        this.jfxPanel = new JFXPanel();
    }
    
    //Método para agregar la ruta del video
    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    //Método para agregar el panel donde se visualizara el video
    /**
     * @param jpanel the jpanel to set
     */
    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }
    
    
    //Método para reproducir
    
    public void reproducir(){
        try {
            getMediaPlayer().play();
        } catch (MediaException e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Método para pausar
    public void pausar() {
        try {
            getMediaPlayer().pause();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //Método para parar
    public void parar() {
        try {
            getMediaPlayer().stop();
        } catch (MediaException e) {
            System.out.println(e.getMessage());
        }
    }
    //Método para el volumen
    public void setVolumen(double value) {
        try {
            getMediaPlayer().setVolume(value);
        } catch (Exception e) {
        }
    }
    
    /**
     * @return the mediaPlayer
     */
    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }
    
    //Método para mostrar el video
    public void mostrarVideo() {
        try {            
            int x = this.jpanel.getHeight();
            int y = this.jpanel.getWidth();
            System.out.println(x);
            System.out.println(y);

            this.file = new File(this.ruta);            

            this.media = new Media(this.file.toURI().toString());              
            this.mediaPlayer = new MediaPlayer(this.media);
            this.view = new MediaView(this.getMediaPlayer());
            this.view.setFitHeight(x);
            this.view.setFitWidth(y);           

            escena = new Scene(new Group(view));
            jfxPanel.setSize(this.jpanel.getSize());
            jfxPanel.setScene(escena);
            getMediaPlayer().setCycleCount(MediaPlayer.INDEFINITE);
            
            //Añadimos el panel de JavaFX al JPanel Swing
            this.jpanel.setLayout(new BorderLayout());
            this.jpanel.add(jfxPanel, BorderLayout.CENTER);

        } catch (MediaException e) {
            JOptionPane.showMessageDialog(null, "Solo puede reproducir videos MP4", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }   
            
}
