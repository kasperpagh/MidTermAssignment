package cphbusiness.pagh.interfaces;

public interface IGameInterface
{
    public  void setUpBoard();

    public IBankInterface setUpBankPayments();

    public int calcNumberOfPlayers();

    public IPlayerInterface[] addPlayers();

    public void takeATurn();
}
