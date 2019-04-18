package Auction.Messages;

import java.io.Serializable;

import Auction.Account;
import Auction.AuctionHouse.AuctionHouse;

public class Message implements Serializable {
    private RequestType requestType;
    private Account account;
    private AuctionHouse auctionHouse;

    private String agentName;
    private int agentBalance;
    //private Item item;
    private int bidAmount;

    public enum RequestType implements Serializable{
        CREATE_ACCOUNT, CHECK_BALANCE, TRANSFER_FUNDS, ACCEPT_BID, REJECT_BID,
        SHUT_DOWN, FUNDS_AVAIL, FUNDS_NOT_AVAIL, FUNDS_TRANSFERRED, ITEM_WON, BID_ITEM;
    }

    public Message(RequestType type) {
        this.requestType = type;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public void setAgentBalance(int agentBalance) {
        this.agentBalance = agentBalance;
    }
}
