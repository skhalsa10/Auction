package Auction.Messages;

import Auction.AuctionHouse.BidTracker;

public class MBidWon extends Message {
    private final BidTracker itemInfo;
    private final int houseID;

    public  MBidWon(int houseID, BidTracker itemInfo){
        this.houseID = houseID;
        this.itemInfo = itemInfo.clone();
    }

    public BidTracker getItemInfo() {
        return itemInfo;
    }

    public int getHouseID() {
        return houseID;
    }
}
