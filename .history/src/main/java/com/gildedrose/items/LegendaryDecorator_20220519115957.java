package com.gildedrose.items;

public class LegendaryDecorator extends UpdateableItem {

    private UpdateableItem decoratedItem;

    public LegendaryDecorator(UpdateableItem decoratedItem) {
        super("Legendary " + decoratedItem.name, decoratedItem.sellIn, decoratedItem.quality)
        this.decoratedItem = decoratedItem;
    }

    @Override
    public void updateQuality() {
        int beforeSellIn = sellIn;
        int beforeQuality = quality;
        this.decoratedItem.updateQuality();
        this.decoratedItem.sellIn = Math.max(beforeSellIn, this.decoratedItem.sellIn);
        this.decoratedItem.quality = Math.max(beforeQuality, this.decoratedItem.quality);
    }
}
