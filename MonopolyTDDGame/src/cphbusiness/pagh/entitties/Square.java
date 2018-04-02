package cphbusiness.pagh.entitties;

import cphbusiness.pagh.interfaces.ISquareInterface;

public class Square implements ISquareInterface
{
    private Player[] currentPlayersOnSquare;
    private Event squareEvent;
    private Property property;
    private int id;

    public Square(Event squareEvent, Property property, int id)
    {
        this.squareEvent = squareEvent;
        this.property = property;
        this.id = id;
    }

    @Override
    public boolean isEventSquare()
    {
        return false;
    }

    @Override
    public Player[] addPlayerToSquare(Player playerToAdd)
    {
        return new Player[0];
    }

    @Override
    public Player[] removePlayerFromSquare()
    {
        return new Player[0];
    }

    public Player[] getCurrentPlayersOnSquare()
    {
        return currentPlayersOnSquare;
    }

    public void setCurrentPlayersOnSquare(Player[] currentPlayersOnSquare)
    {
        this.currentPlayersOnSquare = currentPlayersOnSquare;
    }

    public Event getSquareEvent()
    {
        return squareEvent;
    }

    public void setSquareEvent(Event squareEvent)
    {
        this.squareEvent = squareEvent;
    }

    public Property getProperty()
    {
        return property;
    }

    public void setProperty(Property property)
    {
        this.property = property;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}
