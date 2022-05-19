package com.gildedrose.items;

public class BackStagePass extends UpdateableItem {

    public BackStagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {

        if (sellIn == 0) {

            // Quality drops to 0 after the concert
            quality = 0;
            return;
        }

        sellIn = Math.max(0, sellIn - 1);

        // Quality increases by 2 when there are 10 days or less and by 3 when there are
        // 5 days or less but
        int qualityUpdate = 1;
        if (sellIn < 5) {
            qualityUpdate = 3;
        } else if (sellIn < 10) {
            qualityUpdate = 2;
        }

        quality = Math.min(50, quality + qualityUpdate);
    }

}
