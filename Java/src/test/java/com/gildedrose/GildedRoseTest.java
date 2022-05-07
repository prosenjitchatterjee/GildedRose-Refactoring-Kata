package com.gildedrose;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;
import com.gildedrose.service.impl.GildedRoseImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 0, 4) };
        GildedRoseImpl app = new GildedRoseImpl(items);
        app.updateQuality();
        assertNotEquals("fixme", app.items[0].name);
    }

}
