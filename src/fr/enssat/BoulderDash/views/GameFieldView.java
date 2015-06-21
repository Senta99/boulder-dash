package fr.enssat.boulderdash.views;

import fr.enssat.BoulderDash.views.FieldView;
import fr.enssat.BoulderDash.controllers.GameController;
import fr.enssat.BoulderDash.models.LevelModel;

import javax.swing.*;
import java.awt.*;


/**
 * GameFieldView
 *
 * Game field view for the game itself.
 *
 * @author      Valerian Saliou <valerian@valeriansaliou.name>
 * @since       2015-06-21
 */
public class GameFieldView extends FieldView {
    private GameController gameController;

    /**
     * Class constructor
     *
     * @param  gameController  Game controller
     * @param  levelModel      Level model
     */
    public GameFieldView(GameController gameController, LevelModel levelModel) {
        super(levelModel);

        this.gameController = gameController;

        this.addKeyListener(new fr.enssat.BoulderDash.controllers.GameKeyController(this.levelModel, this.gameController.getAudioLoadHelper()));

        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setFocusable(true);
    }
}