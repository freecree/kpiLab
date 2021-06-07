package commands;

import models.Tetragon;
import models.Triangle;
import org.springframework.stereotype.Component;
import views.View;

@Component
public class TetragonOutCommand implements FigureOutCommand {
    @Override
    public void execute(Triangle triangle, Tetragon tetragon, View view) {
        view.showTetragon(tetragon.getSide1(), tetragon.getSide2(), tetragon.getSide3(), tetragon.getSide4() );

    }
}
