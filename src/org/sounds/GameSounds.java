package org.sounds;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;

public interface GameSounds extends ClientBundle {

        @Source("org/sounds/pieceDown.mp3")
        DataResource pieceDownMp3();

        @Source("org/sounds/pieceDown.wav")
        DataResource pieceDownWav();
        
}