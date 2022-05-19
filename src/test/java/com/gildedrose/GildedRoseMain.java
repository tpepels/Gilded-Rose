package com.gildedrose;

import com.gildedrose.items.UpdateableItem;

public class GildedRoseMain {
    
    public static void main(String[] args) {

        ItemFactory itemFactory = new ItemFactory();
        UpdateableItem item1 = itemFactory.createItem("+5 Dexterity Vest", 10, 20);
        UpdateableItem item2 = itemFactory.createItem("Aged Brie", 2, 0);
        UpdateableItem item3 = itemFactory.createItem("Sulfaras", 0, 0);

        Item[] items = new Item[]{item1, item2};
        GildedRose app = new GildedRose(items);

        int days = 4;

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");

            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
