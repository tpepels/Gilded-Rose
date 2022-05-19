package com.gildedrose;

import com.gildedrose.items.UpdateableItem;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        ItemFactory itemFactory = new ItemFactory();
        UpdateableItem item = itemFactory.createItem("+5 Dexterity Vest", 10, 20);
        UpdateableItem item2 = itemFactory.createItem("Aged Brie", 2, 0);

        GildedRose app = new GildedRose(new Item[] { item, item2 });

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

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
