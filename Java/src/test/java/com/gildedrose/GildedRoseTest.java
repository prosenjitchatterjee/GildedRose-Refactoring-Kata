package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.service.impl.GildedRoseImpl;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 0, 4) };
        GildedRoseImpl app = new GildedRoseImpl(items);
        app.updateQuality();
        assertNotEquals("fixme", app.items[0].name);
    }

}
