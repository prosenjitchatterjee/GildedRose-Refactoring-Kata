package com.gildedrose;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;
import com.gildedroseservice.impl.GildedRoseImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRoseImpl app = new GildedRoseImpl(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}
