package commands;

import models.IFigure;
import models.Tetragon;
import models.Triangle;
import views.View;

public interface FigureOutCommand {
    void execute(Triangle triangle, Tetragon tetragon, View view);
}
