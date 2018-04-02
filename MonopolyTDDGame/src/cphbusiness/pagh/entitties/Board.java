package cphbusiness.pagh.entitties;

import cphbusiness.pagh.interfaces.IBoardInterface;

import java.util.LinkedList;

public class Board implements IBoardInterface
{
    private LinkedList<Square> squares;

    public Board(LinkedList<Square> squares)
    {
        this.squares = squares;
    }

    @Override
    public Board addSquares()
    {
        return null;
    }


    public LinkedList<Square> getSquares()
    {
        return squares;
    }

}
