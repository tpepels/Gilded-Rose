package com.gildedrose;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.HashMap;

import com.gildedrose.items.BackStagePass;
import com.gildedrose.items.IncreasingQualityItem;
import com.gildedrose.items.LegendaryDecorator;
import com.gildedrose.items.UpdateableItem;

public class ItemFactory {

    public UpdateableItem createItem(String itemName, int sellIn, int quality) {

        if (itemName.toLowerCase().contains("aged brie")) {
            return new IncreasingQualityItem(itemName, sellIn, quality);
        } else if ("Sulfaras".equalsIgnoreCase(itemName)) {
            return new LegendaryDecorator(new UpdateableItem("Sulfaras", 0, 80));
        } else if ("Backstage Passes".equalsIgnoreCase(itemName)) {
            return new BackStagePass(itemName, sellIn, quality);
        }
        return null;
    }
}
