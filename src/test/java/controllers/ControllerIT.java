package controllers;

import commands.FigureOutCommand;
import models.Tetragon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import models.Triangle;
import services.StringInputService;
import views.View;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ControllerIT {
    @Mock
    FigureOutCommand command;
    @Mock
    Triangle triangle;
    @Mock
    Tetragon tetragon;
    @Mock
    StringInputService stringInpService;
    @Mock
    View view;
    Controller controller;

    @BeforeEach
    public void onSetUp() {
        controller = new Controller(stringInpService, triangle, tetragon, view, command);
    }

    //Triangle testing
    @Test
    @DisplayName("Testing for setting triangle sides from input")
    void triangleIn() {
        //GIVEN
        when(stringInpService.ask(anyString())).thenReturn("5 4 3");
        //WHEN
        controller.triangleIn();
        //THEN
        verify(triangle).setSide1(5.0);
        verify(triangle).setSide2(4.0);
        verify(triangle).setSide3(3.0);
    }

    @Test
    @DisplayName("Testing for showing triangle sides")
    void triangleOut() {
        //GIVEN
        when(triangle.getSide1()).thenReturn(5.0);
        when(triangle.getSide2()).thenReturn(4.0);
        when(triangle.getSide3()).thenReturn(3.0);
        //WHEN
        controller.triangleOut();
        //THEN
        verify(triangle, times(1)).getSide1();
        verify(triangle, times(1)).getSide2();
        verify(triangle, times(1)).getSide3();
        verify(view).showTriangle(5.0, 4.0, 3.0);
    }

    @Test
    @DisplayName("Testing for showing triangle square")
    void triangleSquareOut() {
        //GIVEN
        when(triangle.getSquare()).thenReturn(6.0);
        //WHEN
        controller.triangleSquareOut();
        //THEN
        verify(triangle).square();
        verify(view).showSquare("Square of triangle: ", 6.0);

    }

    //Tetragon testing

    @Test
    @DisplayName("Testing for setting tetragon sides from input")
    void tetragonIn() {
        //GIVEN
        when(stringInpService.ask(anyString())).thenReturn("5 4 3 2");
        //WHEN
        controller.tetragonIn();
        //THEN
        verify(tetragon).setSide1(5.0);
        verify(tetragon).setSide2(4.0);
        verify(tetragon).setSide3(3.0);
        verify(tetragon).setSide4(2.0);
    }

    @Test
    @DisplayName("Testing for showing tetragon sides")
    void tetragonOut() {
        //GIVEN
        when(tetragon.getSide1()).thenReturn(5.0);
        when(tetragon.getSide2()).thenReturn(4.0);
        when(tetragon.getSide3()).thenReturn(3.0);
        when(tetragon.getSide4()).thenReturn(2.0);
        //WHEN
        controller.tetragonOut();
        //THEN
        verify(tetragon, times(1)).getSide1();
        verify(tetragon, times(1)).getSide2();
        verify(tetragon, times(1)).getSide3();
        verify(tetragon, times(1)).getSide4();
        verify(view).showTetragon(5.0, 4.0, 3.0, 2.0);
    }

    @Test
    @DisplayName("Testing for showing tetragon square")
    void tetragonSquareOut() {
        //GIVEN
        when(tetragon.getSquare()).thenReturn(6.0);
        //WHEN
        controller.tetragonSquareOut();
        //THEN
        verify(tetragon).square();
        verify(view).showSquare("Square of tetragon: ", 6.0);

    }




}