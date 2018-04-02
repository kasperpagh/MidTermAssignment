package cphbusiness.pagh.interfaces;

import cphbusiness.pagh.entitties.Property;
import cphbusiness.pagh.exceptions.InsufficientCashException;
import cphbusiness.pagh.exceptions.NegativeAccountBalanceException;

public interface IPlayerInterface
{

    public void movePlayer(int diceRoll); //can be 2-12

    public int increasePlayersAccountBalance(int delta);

    public int decreasePlayersAccountBalance(int delta) throws NegativeAccountBalanceException; // no debt, just set account to zero!

    public Property buyProperty(Property propertyToBuy) throws InsufficientCashException;
}
