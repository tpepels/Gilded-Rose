package com.gildedrose.items;

public class LegendaryDecorator extends UpdateableItem {

    private UpdateableItem decoratedItem;

    public LegendaryDecorator(UpdateableItem decoratedItem) {
        this.decoratedItem = decoratedItem;
    }

    @Override
    public void updateQuality() {
        int beforeSellIn = sellIn;
        int beforeQuality = quality;

    }
}
