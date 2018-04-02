package cphbusiness.pagh.entitties;

import cphbusiness.pagh.interfaces.IBankInterface;
import cphbusiness.pagh.interfaces.IPlayerInterface;

public class Bank implements IBankInterface
{
    private int monthlyIncome;
    private IPlayerInterface[] players;

    public Bank(int monthlyIncome, IPlayerInterface[] players)
    {
        this.monthlyIncome = monthlyIncome;
        this.players = players;
    }

    @Override
    public void payIncomeToPlayers()
    {

    }

    public int getMonthlyIncome()
    {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome)
    {
        this.monthlyIncome = monthlyIncome;
    }

    public IPlayerInterface[] getPlayers()
    {
        return players;
    }

    public void setPlayers(Player[] players)
    {
        this.players = players;
    }
}
