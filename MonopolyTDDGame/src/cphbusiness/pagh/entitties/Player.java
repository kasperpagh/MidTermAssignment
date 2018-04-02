package cphbusiness.pagh.entitties;

import cphbusiness.pagh.exceptions.InsufficientCashException;
import cphbusiness.pagh.exceptions.NegativeAccountBalanceException;
import cphbusiness.pagh.interfaces.IPlayerInterface;

public class Player implements IPlayerInterface
{
    private String playerName;
    private Square currentLocation;
    private Property[] ownedProperties;
    private int currencyBalance;

    public Player(String playerName, Square currentLocation, Property[] ownedProperties, int currencyBalance)
    {
        this.playerName = playerName;
        this.currentLocation = currentLocation;
        this.ownedProperties = ownedProperties;
        this.currencyBalance = currencyBalance;
    }

    @Override
    public void movePlayer(int diceRoll)
    {

    }

    @Override
    public int increasePlayersAccountBalance(int delta)
    {
        return 0;
    }

    @Override
    public int decreasePlayersAccountBalance(int delta) throws NegativeAccountBalanceException
    {
        return 0;
    }

    @Override
    public Property buyProperty(Property propertyToBuy) throws InsufficientCashException
    {
        return null;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public Square getCurrentLocation()
    {
        return currentLocation;
    }

    public void setCurrentLocation(Square currentLocation)
    {
        this.currentLocation = currentLocation;
    }

    public Property[] getOwnedProperties()
    {
        return ownedProperties;
    }

    public void setOwnedProperties(Property[] ownedProperties)
    {
        this.ownedProperties = ownedProperties;
    }

    public int getCurrencyBalance()
    {
        return currencyBalance;
    }

    public void setCurrencyBalance(int currencyBalance)
    {
        this.currencyBalance = currencyBalance;
    }
}
