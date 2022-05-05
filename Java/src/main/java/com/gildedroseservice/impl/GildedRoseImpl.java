package com.gildedroseservice.impl;

import com.gildedrose.model.Item;
import com.gildedrose.service.GildedRose;
import com.gildedrose.util.Constants;

public class GildedRoseImpl implements GildedRose{
    public Item[] items;

    public GildedRoseImpl(Item[] items) {
        this.items = items;
    }

    @Override
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(Constants.AGED_BRIE)
                    && !items[i].name.equals(Constants.BACKSTAGE_TAFKAL80ETC)
                    && items[i].quality > 0
                    && !items[i].name.equals(Constants.SULFURAS_HAND_OF_RAGNAROS)) /*{
                if (items[i].quality > 0) {
                    if (!items[i].name.equals(Constants.SULFURAS_HAND_OF_RAGNAROS))*/ 
            		{
                        items[i].quality = items[i].quality - 1;
                    }
			/*
			 * } }
			 */else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals(Constants.BACKSTAGE_TAFKAL80ETC)) {
                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {  // Already checked in outer if 
                                items[i].quality = items[i].quality + 1;
//                            }
                        }

                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {  // Already checked in outer if 
                                items[i].quality = items[i].quality + 1;
//                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals(Constants.SULFURAS_HAND_OF_RAGNAROS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals(Constants.AGED_BRIE)) {
                    if (!items[i].name.equals(Constants.BACKSTAGE_TAFKAL80ETC)) {
                        if (items[i].quality > 0 && !items[i].name.equals(Constants.SULFURAS_HAND_OF_RAGNAROS)) {
//                            if (!items[i].name.equals(Constants.SULFURAS_HAND_OF_RAGNAROS)) {
                                items[i].quality = items[i].quality - 1;
//                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } 
                else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}