package commands;

import models.Tetragon;
import models.Triangle;
import views.View;

public class TriangleOutCommand implements FigureOutCommand {
    @Override
    public void execute(Triangle triangle, Tetragon tetragon, View view) {
        view.showTriangle(triangle.getSide1(), triangle.getSide2(), triangle.getSide3());
    }
}
