package com.backbase.weatherapp.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent
{

    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 5;
    private static String []cityName = {"Toronto", "Edmonton", "Winnipeg", "Ottawa", "Vancouver"};

    static
    {
        for (int i = 0; i < COUNT; i++)
        {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item)
    {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position)
    {
        return new DummyItem(String.valueOf(position), cityName[position], makeDetails(position));
    }

    private static String makeDetails(int position)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++)
        {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    public static class DummyItem
    {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details)
        {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString()
        {
            return content;
        }
    }
}