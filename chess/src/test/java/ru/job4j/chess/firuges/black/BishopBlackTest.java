package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Figure figure = new BishopBlack(Cell.B3);
        Assert.assertEquals(figure.position(), Cell.B3);
    }

    @Test
    public void testWay() {
        Figure figure = new BishopBlack(Cell.C1);
        Cell[] steps = figure.way(Cell.G5);
        Cell[] excepted = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertEquals(excepted, steps);
    }

    @Test
    public void testIsDiagonal() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        boolean[] excepted = new boolean[] {true, true, false, false};
        boolean[] input = new boolean[] {
                figure.isDiagonal(Cell.A1, Cell.C3),
                figure.isDiagonal(Cell.H5, Cell.F3),
                figure.isDiagonal(Cell.H3, Cell.G3),
                figure.isDiagonal(Cell.H3, Cell.F2)
        };
        Assert.assertArrayEquals(excepted, input);
    }

    @Test
    public void testCopy() {
        Figure figure = new BishopBlack(Cell.C2);
        Figure copiedFigure = figure.copy(Cell.A3);
        Assert.assertEquals(copiedFigure.position(), Cell.A3);
    }
}