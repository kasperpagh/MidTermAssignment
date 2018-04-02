package cphbusiness.pagh.entitties;

import cphbusiness.pagh.exceptions.InsufficientCashException;
import cphbusiness.pagh.interfaces.IPorpertyInterface;

public class Property implements IPorpertyInterface
{
    private int prize;
    private boolean isAlreadyOwned;
    private Player currentOwner;
    private int rent;
    private int name;

    public Property(int prize, int rent, int name)
    {
        this.prize = prize;
        this.rent = rent;
        this.name = name;
    }


    @Override
    public Property buyProperty(Player player)
    {
        return null;
    }

    @Override
    public boolean payRent(Player playerToPayRent) throws InsufficientCashException
    {
        return false;
    }

    public int getPrize()
    {
        return prize;
    }

    public void setPrize(int prize)
    {
        this.prize = prize;
    }

    public boolean isAlreadyOwned()
    {
        return isAlreadyOwned;
    }

    public void setAlreadyOwned(boolean alreadyOwned)
    {
        isAlreadyOwned = alreadyOwned;
    }

    public Player getCurrentOwner()
    {
        return currentOwner;
    }

    public void setCurrentOwner(Player currentOwner)
    {
        this.currentOwner = currentOwner;
    }

    public int getRent()
    {
        return rent;
    }

    public void setRent(int rent)
    {
        this.rent = rent;
    }

    public int getName()
    {
        return name;
    }

    public void setName(int name)
    {
        this.name = name;
    }

}
