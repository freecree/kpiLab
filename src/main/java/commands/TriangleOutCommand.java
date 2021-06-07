package commands;

import models.Tetragon;
import models.Triangle;
import org.springframework.stereotype.Component;
import views.View;

@Component
public class TriangleOutCommand implements FigureOutCommand {
    @Override
    public void execute(Triangle triangle, Tetragon tetragon, View view) {
        view.showTriangle(triangle.getSide1(), triangle.getSide2(), triangle.getSide3());
    }
}
