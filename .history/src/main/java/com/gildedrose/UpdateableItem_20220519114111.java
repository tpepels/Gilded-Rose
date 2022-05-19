package com.gildedrose;

public class UpdateableItem extends Item {
    public UpdateableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if (sellIn > 0) {
            quality--;
        } else {
            quality -= 2;
        }
    }
}
