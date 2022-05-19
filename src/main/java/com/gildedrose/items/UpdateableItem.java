package com.gildedrose.items;

import com.gildedrose.Item;

public class UpdateableItem extends Item {
    public UpdateableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        sellIn = Math.max(0, sellIn - 1);

        int qualityUpdate = 1;
        if (sellIn < 0) { // Once the sell by date has passed, Quality degrades twice as fast
            qualityUpdate = 2;
        }

        quality = Math.max(0, quality - qualityUpdate);
    }
}
