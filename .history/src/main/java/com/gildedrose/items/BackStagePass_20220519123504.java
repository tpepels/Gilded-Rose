package com.gildedrose.items;

public class BackStagePass extends UpdateableItem {

    public BackStagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        int qualityUpdate = 1;
        if (sellIn < 5) {
            qualityUpdate = 3;
        } else if (sellIn < 10) {
            qualityUpdate = 2;
        }

        quality = Math.min(50, quality + qualityUpdate);
    }

}
