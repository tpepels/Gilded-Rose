package com.gildedrose.items;

public class ConjuredDecorator extends UpdateableItem {
    private UpdateableItem decoratedItem;

    public ConjuredDecorator(UpdateableItem decoratedItem) {
        super("Conjured " + decoratedItem.name, decoratedItem.sellIn, decoratedItem.quality);
        this.decoratedItem = decoratedItem;
    }

    @Override
    public void updateQuality() {
        int beforeSellIn = sellIn;
        int beforeQuality = quality;
        this.decoratedItem.updateQuality();
        this.decoratedItem.sellIn = Math.max(beforeSellIn, this.decoratedItem.sellIn);
        this.decoratedItem.quality = Math.max(beforeQuality, this.decoratedItem.quality);

        this.quality = decoratedItem.quality;
        this.sellIn = decoratedItem.sellIn;
    }
}
