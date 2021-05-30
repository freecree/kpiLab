package controllers;

import models.Tetragon;
import models.Triangle;
import servises.StringInputService;
import views.View;

import java.util.Scanner;

public class Controller {
    StringInputService stringInpService;
    Triangle triangle;
    Tetragon tetragon;
    View view;

    public Controller() {
        this.stringInpService = new StringInputService(new Scanner(System.in));
        this.triangle = new Triangle(0,0,0);
        this.tetragon = new Tetragon(0,0,0,0);
        this.view = new View();
    }

    public Controller(StringInputService stringInpService, Triangle triangle, Tetragon tetragon, View view) {
        this.stringInpService = stringInpService;
        this.triangle = triangle;
        this.tetragon = tetragon;
        this.view = view;
    }

    // Triangle

    public void triangleIn() {
        String inp = stringInpService.ask("Введите 3 стороны триугольника (Через пробел): ");
        String[] args = inp.split(" ");
        triangle.setSide1(Double.parseDouble(args[0]));
        triangle.setSide2(Double.parseDouble(args[1]));
        triangle.setSide3(Double.parseDouble(args[2]));
    }
    public void triangleOut() {
        view.showTriangle(triangle.getSide1(), triangle.getSide2(), triangle.getSide3());
    }
    public void triangleSquareOut() {
        triangle.square();
        view.showSquare("Square of triangle: ", triangle.getSquare());
    }

    //Tetragon

    public void tetragonIn() {
        String inp = stringInpService.ask("Введите 4 стороны четырехугольника (Через пробел): ");
        String[] args = inp.split(" ");
        tetragon.setSide1(Double.parseDouble(args[0]));
        tetragon.setSide2(Double.parseDouble(args[1]));
        tetragon.setSide3(Double.parseDouble(args[2]));
        tetragon.setSide4(Double.parseDouble(args[3]));
    }
    public void tetragonOut() {
        view.showTetragon(tetragon.getSide1(), tetragon.getSide2(), tetragon.getSide3(), tetragon.getSide4() );
    }
    public void tetragonSquareOut() {
        tetragon.square();
        view.showSquare("Square of tetragon: ", tetragon.getSquare());
    }



}
