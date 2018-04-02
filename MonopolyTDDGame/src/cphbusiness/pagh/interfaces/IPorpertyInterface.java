package cphbusiness.pagh.interfaces;

import cphbusiness.pagh.entitties.Player;
import cphbusiness.pagh.entitties.Property;
import cphbusiness.pagh.exceptions.InsufficientCashException;

public interface IPorpertyInterface
{
    public Property buyProperty(Player player);

    public boolean payRent(Player playerToPayRent) throws InsufficientCashException;
}
