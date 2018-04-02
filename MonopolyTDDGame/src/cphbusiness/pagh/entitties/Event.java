package cphbusiness.pagh.entitties;

import cphbusiness.pagh.interfaces.IEventInterface;

public class Event implements IEventInterface
{
    private String description;
    private String consequence;

    public Event(String description, String consequence)
    {
        this.description = description;
        this.consequence = consequence;
    }

    @Override
    public String getEvent()
    {
        return null;
    }

    @Override
    public String getConsequence()
    {
        return null;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setConsequence(String consequence)
    {
        this.consequence = consequence;
    }
}
