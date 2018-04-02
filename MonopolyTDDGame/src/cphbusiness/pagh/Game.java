package cphbusiness.pagh;

import cphbusiness.pagh.entitties.Bank;
import cphbusiness.pagh.interfaces.*;

public class Game implements IGameInterface
{
    private IBoardInterface board;
    private IPlayerInterface[] players;
    private IBankInterface bank;
    private int numberOfPlayers;
    private int turnCounter;
    private ISquareInterface[] squares;

    public Game(IBoardInterface board, IPlayerInterface[] players, int monthlyIncome, ISquareInterface[] squares, IBankInterface bank)
    {
        this.board = board;
        this.players = players;
        this.bank = bank;
        this.squares = squares;
    }


    @Override
    public void setUpBoard()
    {

        numberOfPlayers = calcNumberOfPlayers();
        turnCounter = 0;
    }

    @Override
    public IBankInterface setUpBankPayments()
    {
        return null;
    }

    @Override
    public int calcNumberOfPlayers()
    {
        return players.length;
    }

    @Override
    public IPlayerInterface[] addPlayers()
    {
        return new IPlayerInterface[0];
    }

    @Override
    public void takeATurn()
    {

    }

    public IBoardInterface getBoard()
    {
        return board;
    }

    public void setBoard(IBoardInterface board)
    {
        this.board = board;
    }

    public IPlayerInterface[] getPlayers()
    {
        return players;
    }

    public void setPlayers(IPlayerInterface[] players)
    {
        this.players = players;
    }

    public IBankInterface getBank()
    {
        return bank;
    }

    public void setBank(IBankInterface bank)
    {
        this.bank = bank;
    }

    public int getNumberOfPlayers()
    {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers)
    {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getTurnCounter()
    {
        return turnCounter;
    }

    public void setTurnCounter(int turnCounter)
    {
        this.turnCounter = turnCounter;
    }
}
