package Auction.Messages;

public class MBlockRejected implements Message {


    private final int itemID;
    private final int agentID;
    private final int amount;

    public MBlockRejected(int agentID, int amount, int itemID) {
        this.agentID = agentID;
        this.amount = amount;
        this.itemID = itemID;
    }

    public int getItemID() {
        return itemID;
    }

    public int getAgentID() {
        return agentID;
    }

    public int getAmount() {
        return amount;
    }
}
