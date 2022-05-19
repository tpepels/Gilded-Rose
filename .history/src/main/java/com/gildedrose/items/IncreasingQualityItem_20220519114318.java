package com.gildedrose;

public class IncreasingQualityItem extends UpdateableItem {

    public IncreasingQualityItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void updateQuality() {
        quality++;
    }
}
