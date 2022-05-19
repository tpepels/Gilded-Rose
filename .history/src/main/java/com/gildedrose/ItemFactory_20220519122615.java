package com.gildedrose;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.HashMap;

import com.gildedrose.items.IncreasingQualityItem;
import com.gildedrose.items.UpdateableItem;

public class ItemFactory {

    public UpdateableItem createItem(String itemName) {

        if ("Aged Brie".equalsIgnoreCase(itemName)) {
            return new IncreasingQualityItem("Aged Brie", 10, 5);
        }
        return null;
    }
}
