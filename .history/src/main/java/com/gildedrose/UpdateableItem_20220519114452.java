package com.gildedrose;

public class UpdateableItem extends Item {
    public UpdateableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        int qualityUpdate = 1
        if (sellIn > 0) {
            quality = Math.max(0, quality-1);
        } else {
            quality = Math.max(0, quality-2);

        }
    }
}
