package com.gildedrose.items;

public class LegendaryDecorator extends UpdateableItem {

    private UpdateableItem decoratedItem;

    public LegendaryDecorator(UpdateableItem decoratedItem) {
        super("Legendary " + decoratedItem.name, decoratedItem.sellIn, decoratedItem.quality);
        this.decoratedItem = decoratedItem;
    }

    @Override
    public void updateQuality() {
        int beforeSellIn = sellIn;
        int beforeQuality = quality;

        this.decoratedItem.updateQuality();

        // A legendary item, never has to be sold or decreases in Quality
        this.decoratedItem.sellIn = Math.max(beforeSellIn, this.decoratedItem.sellIn); // If the sellin is postponed,
                                                                                       // update the value
        this.decoratedItem.quality = Math.max(beforeQuality, this.decoratedItem.quality); // It can still increase in
                                                                                          // quality

        this.quality = decoratedItem.quality; // This is why we need get/set methods...
        this.sellIn = decoratedItem.sellIn; // This is why we need get/set methods...
    }
}
