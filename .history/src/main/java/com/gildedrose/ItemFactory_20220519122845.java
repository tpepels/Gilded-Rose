package com.gildedrose;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.HashMap;

import com.gildedrose.items.BackStagePass;
import com.gildedrose.items.IncreasingQualityItem;
import com.gildedrose.items.LegendaryDecorator;
import com.gildedrose.items.UpdateableItem;

public class ItemFactory {

    public UpdateableItem createItem(String itemName, int sellIn, int quality) {

        if ("Aged Brie".equalsIgnoreCase(itemName)) {
            return new IncreasingQualityItem("Aged Brie", 10, 5);
        } else if ("Sulfaras".equalsIgnoreCase(itemName)) {
            return new LegendaryDecorator(new UpdateableItem("Sulfaras", 0, 80));
        } else if ("Backstage Passes".equalsIgnoreCase(itemName)) {
            return new BackStagePass(itemName, sellIn, quality)
        }
        return null;
    }
}
