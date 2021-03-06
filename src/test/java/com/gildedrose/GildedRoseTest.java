package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    private Item[] testItems = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20),
            new Item("Aged Brie", 2, 0),
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6) };

    @Test
    void testNormalItem() {
        Item[] testItems = new Item[] { new Item("+5 Dexterity Vest", 10, 20) };
        GildedRose gildedRose = new GildedRose(testItems);

        for (int i = 1; i <= 12; i++) {
            gildedRose.updateQuality();

            if (testItems[0].sellIn > 10)
                assertEquals(20 - i, testItems[0].quality);
            else
                assertEquals(10 - (i - 10) * 2, testItems[0].quality);
            assertEquals(Math.max(0, 10 - i), testItems[0].sellIn);
        }
    }

    @Test
    void testAgedBrie() {

    }

    @Test
    void testConjuredItem() {

    }

    @Test
    void testLegendaryItem() {

    }

}
