package com.gildedrose;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.HashMap;

import com.gildedrose.items.BackStagePass;
import com.gildedrose.items.IncreasingQualityItem;
import com.gildedrose.items.LegendaryDecorator;
import com.gildedrose.items.UpdateableItem;

public class ItemFactory {

    public UpdateableItem createItem(String itemName, int sellIn, int quality) {

        UpdateableItem theItem = null;

        if (itemName.toLowerCase().contains("aged brie")) {
            theItem new IncreasingQualityItem(itemName, sellIn, quality);
        } else if (itemName.toLowerCase().contains("sulfaras")) {
            return new LegendaryDecorator(new UpdateableItem("Sulfaras", 0, 80));
        } else if (itemName.toLowerCase().contains("backstage passes")) {
            return new BackStagePass(itemName, sellIn, quality);
        }

        if (itemName.toLowerCase().contains("conjured")) {

        }

        if (itemName.toLowerCase().contains("legendary")) {

        }

        return null;
    }
}