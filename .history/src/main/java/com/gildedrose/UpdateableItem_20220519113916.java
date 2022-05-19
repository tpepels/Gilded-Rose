package com.gildedrose;

public abstract class UpdateableItem extends Item {
    public void updateQuality() {
        if (sellIn > 0) {
            quality--;
        } else {
            quality -= 2;
        }
    }
}
