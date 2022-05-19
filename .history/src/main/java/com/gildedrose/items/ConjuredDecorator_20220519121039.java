package com.gildedrose.items;

public class ConjuredDecorator extends UpdateableItem {
    private UpdateableItem decoratedItem;

    public ConjuredDecorator(UpdateableItem decoratedItem) {
        super("Conjured " + decoratedItem.name, decoratedItem.sellIn, decoratedItem.quality);
        this.decoratedItem = decoratedItem;
    }

    @Override
    public void updateQuality() {
        int qualityBefore = this.decoratedItem.quality;
        this.decoratedItem.updateQuality();
        int qualityDifference = qualityBefore - decoratedItem.quality;

    }
}
