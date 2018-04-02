package cphbusiness.pagh.interfaces;

import cphbusiness.pagh.entitties.Player;

public interface ISquareInterface
{
    public boolean isEventSquare();

    public Player[] addPlayerToSquare(Player playerToAdd);

    public Player[] removePlayerFromSquare();
}
